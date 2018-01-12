package icehs.science.chapter09;

public class Television extends Product {
	private String description;
	
	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public Television(String name, int price, int discountRate, String description) {
		super(name, price, discountRate);
		this.description = description;
	}
 
}
