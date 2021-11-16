package com.hcl.pp.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "PET_USER")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;

	@Column(name = "USER_NAME", length = 55, nullable = false, unique = true)
	private String userName;

	@Column(name = "USER_PASSWD", length = 55, nullable = false)
	private String userPassword;

	@Transient
	private String confirmPassword;

	@OneToMany(mappedBy = "owner", cascade = CascadeType.ALL)
	@JsonIgnoreProperties({ "owner" })
	private Set<Pet> pets;

	public User() {
		super();
	}

	public User(Long id, String userName, String userPassword, String confirmPassword, Set<Pet> pets) {
		super();
		this.id = id;
		this.userName = userName;
		this.userPassword = userPassword;
		this.confirmPassword = confirmPassword;
		this.pets = pets;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}

	public User(Long id) {
		super();
		this.id = id;
	}

}
