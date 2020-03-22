package org.com.sapient.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.com.sapient.ecommerce.mapper.ProductMapper;
import org.com.sapient.ecommerce.model.Product;
import org.com.sapient.ecommerce.model.Product.Color;
import org.com.sapient.ecommerce.model.Product.Size;
import org.com.sapient.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;import org.w3c.dom.Element;
@Service
public class ProductService {
	
	@Autowired 
	private ProductMapper productMapper;

	
	public ProductService(ProductMapper productMapper) {
		super();
		this.productMapper = productMapper;
	}

	private List<Product> getData() {	
		return productMapper.getData();
	}
	
	public List<Product> getAllProductData() {	
		return productMapper.getData();
	} 
	
	public List<Product> byBrand(String name)
	{
		List<Product> product= getData();
		return	product.stream().filter(x -> x.getProductBrand().contains(name)).collect(Collectors.toList());
			
	}
	public List<Product> bySize(String size)
	{
		List<Product> product= getData();
		return	product.stream().filter(x -> x.getSize().equals(size)).collect(Collectors.toList());
			
	}
	public List<Product> byColor(String color)
	{
		List<Product> product= getData();
		return	product.stream().filter(x -> x.getColor().equals(color)).collect(Collectors.toList());
			
	}
	
	
	

}
