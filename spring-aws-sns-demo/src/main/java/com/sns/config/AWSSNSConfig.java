package com.sns.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;


@Configuration
public class AWSSNSConfig {
	
<<<<<<< HEAD
	public static final String SECRET_KEY = "vrql9WXMP1Xfe4bv1m8eH5eyvj8pObvwsvQMphO6";
	public static final String ACCESS_KEY = "AKIA4MFLODBGCBWCR7Z3";
=======
	public static final String SECRET_KEY = "";
	public static final String ACCESS_KEY = "";
>>>>>>> bd636cae2d4de6f371a6f95c38910a7d7f4f70bc
	
 @Primary
 @Bean
	public AmazonSNSClient getSnsClient() {
		return (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.US_EAST_1)
				.withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY))).build();
	}
}
