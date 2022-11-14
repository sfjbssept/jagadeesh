import * as client from "prom-client";
import {Brand} from "./common.model"

let _kafkaProcessDuration;

export function initCustomMetrics() {
    //Create prometheus registry
    const registry = new client.Registry();
    //Create histogram for kafka message process time divided by brand/status combination.
    _kafkaProcessDuration = new client.Histogram({
        name: 'kafka_process_duration_seconds',
        help: 'Seconds it takes to process a kafka message.',
        labelNames: ['brand', 'status']
    });
    const brands = [ Brand.AVIS, Brand.BUDGET, Brand.PAYLESS ];
    brands.forEach(brand => _kafkaProcessDuration.zero({ status: 'SUCCESS', brand }));
    brands.forEach(brand => _kafkaProcessDuration.zero({ status: 'IGNORED', brand }));
    brands.forEach(brand => _kafkaProcessDuration.zero({ status: 'FAILURE', brand }));
    registry.registerMetric(_kafkaProcessDuration);
    return registry;
}

//Wrappers to prevent us from directly touching the metric objects.
export const kafkaProcessDurationHistogram = {
    startTimer: (args?) => (args ? _kafkaProcessDuration.startTimer(args) : _kafkaProcessDuration.startTimer())
};