package com.hcl.pp.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "PETS")
public class Pet implements Serializable {

	private static final long serialVersionUID = -6508968280275752489L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "PET_NAME", length = 55, nullable = false)
	private String name;

	@Column(name = "PET_AGE")
	private Integer age;

	@Column(name = "PET_PLACE", length = 55)
	private String place;

	@ManyToOne
	@JoinColumn(name = "PET_OWNERID")
	@JsonIgnoreProperties({ "pets", "confirmPassword", "userPassword" })
	private User owner;

	public Pet() {
		super();
	}

	public Pet(Long id, String name, Integer age, String place, User owner) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.place = place;
		this.owner = owner;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}

}
