package com.xworkz.shirtdetails.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "shirt")
public class ShirtDTO {

	@Id
	@GenericGenerator(name = "ss", strategy = "increment")
	@GeneratedValue(generator = "ss")
	private int id;
	private String brand;
	private String size;
	private double price;
	private String discount;
	private int quantity;
	private String gender;
	private String color;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ShirtDTO(String brand, String size, double price, String discount, int quantity, String gender,
			String color) {
		super();
		this.brand = brand;
		this.size = size;
		this.price = price;
		this.discount = discount;
		this.quantity = quantity;
		this.gender = gender;
		this.color = color;
	}

	public ShirtDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ShirtDTO [id=" + id + ", brand=" + brand + ", size=" + size + ", price=" + price + ", discount="
				+ discount + ", quantity=" + quantity + ", gender=" + gender + ", color=" + color + "]";
	}

}
