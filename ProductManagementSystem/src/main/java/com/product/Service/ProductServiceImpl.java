package com.product.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.Entity.Product;
import com.product.Service.IProductService;
import com.product.repo.IProductRepository;

@Service
public class ProductServiceImpl implements IProductService{

	@Autowired
	IProductRepository productRepository;
	
	@Override
	public Integer addProduct(Product product) {
		Product addProduct = productRepository.save(product);
		return addProduct.getId();
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Optional<Product> getProduct(Integer Id) {
		// TODO Auto-generated method stub
		return productRepository.findById(Id);
	}

}
