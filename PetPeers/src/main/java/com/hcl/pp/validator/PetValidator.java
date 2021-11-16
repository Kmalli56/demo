package com.hcl.pp.validator;

import java.io.Serializable;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author mounika.kuna
 *
 */
public class PetValidator implements Serializable {

	private static final long serialVersionUID = 8842211433788795263L;

	@NotNull(message = "Pet name can't be null")
	@NotEmpty(message = "Pet name can't be empty")
	private String name;

	@NotNull(message = "Pet age can't be null")
	@Digits(integer = 2, fraction = 0, message = "Age must be in number ")
	@Min(value = 0, message = "Age must be minimum 1 year")
	@Max(value = 99, message = "Age must be maximum upto 99 years")
	private Integer age;

	@NotNull(message = "Place can't be null")
	@NotEmpty(message = "Place can't be empty")
	private String place;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

}
