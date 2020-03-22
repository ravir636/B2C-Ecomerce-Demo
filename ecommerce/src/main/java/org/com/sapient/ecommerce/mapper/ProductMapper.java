package org.com.sapient.ecommerce.mapper;

import java.util.ArrayList;
import java.util.List;

import org.com.sapient.ecommerce.model.Product;
import org.com.sapient.ecommerce.model.Product.Color;
import org.com.sapient.ecommerce.model.Product.Size;
import org.com.sapient.ecommerce.model.ProductDAO;
import org.com.sapient.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductMapper {

	@Autowired 
	private ProductRepository productRepository;
	
	public ProductMapper(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}
	
	List<ProductDAO> productList = productRepository.getProducts();
	public List<Product> getData() {		
		List<Product> productDataMapper = new ArrayList<Product>();
	
		for(ProductDAO data : productList) {
			Product product=new Product();
			product.setProductID(data.getProductID());
			product.setCategory(data.getCategory());
			product.setActive(data.isActive());
			product.setPrice(data.getPrice());
			product.setProductBrand(data.getProductBrand());
			if(data.getColor().equalsIgnoreCase("black"))
			product.setColor(Color.BLACK);
			else if(data.getColor().equalsIgnoreCase("green"))
				product.setColor(Color.GREEN);
			else if(data.getColor().equalsIgnoreCase("black"))
				product.setColor(Color.BLACK);
			else if(data.getColor().equalsIgnoreCase("grey"))
				product.setColor(Color.GREY);
			else if(data.getColor().equalsIgnoreCase("yellow"))
				product.setColor(Color.YELLOW);
			else if(data.getColor().equalsIgnoreCase("red"))
				product.setColor(Color.RED);
			else if(data.getColor().equalsIgnoreCase("olive"))
				product.setColor(Color.OLIVE);
			else if(data.getColor().equalsIgnoreCase("purple"))
				product.setColor(Color.PURRPLE);
			
			if(data.getSize().equalsIgnoreCase("M"))
				product.setSize(Size.M);
			else if(data.getSize().equalsIgnoreCase("l"))
				product.setSize(Size.L);
			else if(data.getSize().equalsIgnoreCase("s"))
				product.setSize(Size.S);
			else if(data.getSize().equalsIgnoreCase("xs"))
				product.setSize(Size.XS);
			else if(data.getSize().equalsIgnoreCase("xl"))
				product.setSize(Size.XL);
			else if(data.getSize().equalsIgnoreCase("xxl"))
				product.setSize(Size.XXL);
			productDataMapper.add(product);
		}
		
		return productDataMapper;
		
	}

	
	
	
	

}
