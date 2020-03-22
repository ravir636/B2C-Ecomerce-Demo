package org.com.sapient.ecommerce.model;

import java.util.stream.Stream;

import io.swagger.annotations.ApiModelProperty;

public class Product {
	
	public enum Color{
		RED,
		GREEN ,
		YELLOW ,
		BLACK,
		GREY,
		OLIVE,
		PURRPLE
		}
	public static Stream<Color> getcolor() {
        return Stream.of(Color.values()); 
    }
	
	
	public enum Size{
		XS,
		S,
		M,
		L,
		XL,
		XXL
		}
	
	public static Stream<Size> getsize() {
        return Stream.of(Size.values()); 
    }
	 @ApiModelProperty(notes="product id which is unique")
	 int productID;
	 public Product() {
		super();
		
	}
	
	@ApiModelProperty(notes="product name")
	String productName;
	 @ApiModelProperty(notes="product brand")
	String productBrand;
	 @ApiModelProperty(notes="product category either shirts/pant/t-shirt")
	String category;
	 @ApiModelProperty(notes="product is active of not")
	boolean active;
	 @ApiModelProperty(notes="product price")
	int price;
	 @ApiModelProperty(notes="product color")
	Color color;
	 @ApiModelProperty(notes="product size")
	Size size;
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Size getSize() {
		return size;
	}
	public void setSize(Size size) {
		this.size = size;
	}

	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (active ? 1231 : 1237);
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + price;
		result = prime * result + ((productBrand == null) ? 0 : productBrand.hashCode());
		result = prime * result + productID;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((size == null) ? 0 : size.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (active != other.active)
			return false;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (color != other.color)
			return false;
		if (price != other.price)
			return false;
		if (productBrand == null) {
			if (other.productBrand != null)
				return false;
		} else if (!productBrand.equals(other.productBrand))
			return false;
		if (productID != other.productID)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (size != other.size)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productID=" + productID + ", productName=" + productName + ", productBrand=" + productBrand
				+ ", category=" + category + ", active=" + active + ", price=" + price + ", color=" + color + ", size="
				+ size + "]";
	}
	

}


