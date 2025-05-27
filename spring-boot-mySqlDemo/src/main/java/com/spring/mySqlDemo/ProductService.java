package com.spring.mySqlDemo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product saveProduct(Product product) {
		return productRepository.save(product);
	}
	public Product getProductById(Long id) {
	    return productRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("Product not found"));
	}

	public Product updateProduct(Long id, Product updatedProduct) {
	    Product existingProduct = productRepository.findById(id)
	        .orElseThrow(() -> new RuntimeException("Product not found"));

	    existingProduct.setName(updatedProduct.getName());
	    existingProduct.setPrice(updatedProduct.getPrice());
	    existingProduct.setQuantity(updatedProduct.getQuantity());

	    return productRepository.save(existingProduct);
	}


	public void deleteProduct(Long id) {
	    if (!productRepository.existsById(id)) {
	        throw new RuntimeException("Product not found");
	    }
	    productRepository.deleteById(id);
	}

}
