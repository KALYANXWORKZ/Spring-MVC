package com.xworkz.milkshop.dto;

public class MilkShopDTO {

	
	private Integer id;
	private String brandName;
	private String shopName;
	private String type;
	private String ambassador;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAmbassador() {
		return ambassador;
	}
	public void setAmbassador(String ambassador) {
		this.ambassador = ambassador;
	}
	public MilkShopDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public MilkShopDTO(Integer id, String brandName, String shopName, String type, String ambassador) {
		super();
		this.id = id;
		this.brandName = brandName;
		this.shopName = shopName;
		this.type = type;
		this.ambassador = ambassador;
	}
	@Override
	public String toString() {
		return "MilkShopDTO [id=" + id + ", brandName=" + brandName + ", shopName=" + shopName + ", type=" + type
				+ ", ambassador=" + ambassador + "]";
	}
	
	
}
