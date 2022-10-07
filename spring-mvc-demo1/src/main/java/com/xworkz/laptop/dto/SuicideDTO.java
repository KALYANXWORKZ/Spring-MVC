package com.xworkz.laptop.dto;

public class SuicideDTO {

	private String name,reason,gender,spot,type,dateAndTime;
	
	private Integer age , noOfAttempts;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSpot() {
		return spot;
	}

	public void setSpot(String spot) {
		this.spot = spot;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getNoOfAttempts() {
		return noOfAttempts;
	}

	public void setNoOfAttempts(Integer noOfAttempts) {
		this.noOfAttempts = noOfAttempts;
	}

	@Override
	public String toString() {
		return "SuicideDTO [name=" + name + ", reason=" + reason + ", gender=" + gender + ", spot=" + spot + ", type="
				+ type + ", dateAndTime=" + dateAndTime + ", age=" + age + ", noOfAttempts=" + noOfAttempts + "]";
	}
	
	
}
