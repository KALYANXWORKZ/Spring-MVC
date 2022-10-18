package com.xworkz.criminals.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name = "criminals_info")

@NamedQueries({@NamedQuery(name = "findAll", query = "select info from CriminalsDTO info")})
public class CriminalsDTO {

	@Id
	@GenericGenerator(name = "kk", strategy = "increment")
	@GeneratedValue(generator = "kk")
	private Integer id;
	private String name;
	private Integer age;
	private String country;
	private String criminalType;
	private Integer noOfCases;
	private String alive;
	private String gender;
	private String international;
	private String married;
	private Double jailTerm;
	private String wifeName;
	private String rightHandName;
	private String leftHandName;
	private String prisonName;
	private Double netWorth;

}
