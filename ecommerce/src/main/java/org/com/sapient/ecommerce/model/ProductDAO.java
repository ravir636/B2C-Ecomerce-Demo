package org.com.sapient.ecommerce.model;

public class ProductDAO {

		 int productID;

		String productName;

		String productBrand;

		String category;

		boolean active;
	
		int price;
		
		String color;

		String size;
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getSize() {
			return size;
		}
		public void setSize(String size) {
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
		
		

	}



