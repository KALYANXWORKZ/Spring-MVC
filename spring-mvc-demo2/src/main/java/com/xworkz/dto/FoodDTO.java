package com.xworkz.dto;

public class FoodDTO {
	
	private String itemName;
	private Double price;
	private String hotelName;
	private String type;
	private String location;
	private String ordered;
	private Integer quantity;
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOrdered() {
		return ordered;
	}
	public void setOrdered(String ordered) {
		this.ordered = ordered;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "FoodDTO [itemName=" + itemName + ", price=" + price + ", hotelName=" + hotelName + ", type=" + type
				+ ", location=" + location + ", ordered=" + ordered + ", quantity=" + quantity + "]";
	}
	public FoodDTO(String itemName, Double price, String hotelName, String type, String location, String ordered,
			Integer quantity) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.hotelName = hotelName;
		this.type = type;
		this.location = location;
		this.ordered = ordered;
		this.quantity = quantity;
	}
	public FoodDTO() {
		super();

	}
	
	

}
