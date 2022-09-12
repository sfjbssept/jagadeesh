package com.product.Service;

import java.util.List;

import com.product.Entity.Product;

public interface IProductService {
	Integer addProduct(Product product);
	public List<Product> getAllProducts();
}
