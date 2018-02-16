package com.org.record.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "personinfo")
public class PersonInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull
	@Column(name = "id", unique = true, nullable = false)
	private Long personId;

	@NotNull(message = "name field can not be null")
	@NotBlank(message = "name filed can not be blank")
	@Column(name = "name", unique = true, nullable = false, length = 40)
	private String name;

	@NotNull
	@Column(name = "surname", length = 40)
	private String surName;

	@NotNull
	@Column(name = "mob", unique = true, nullable = false, length = 10)
	private Long mobileNo;

	@Email
	@Column(name = "email", length = 80)
	private String email;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "addressId", nullable = false)
	private Address address;

	@JsonManagedReference
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "personInfo")
	private Set<Donate> donate;

	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonInfo(Long personId, String name, String surName, Long mobileNo, String email, Address address,
			Set<Donate> donate) {
		super();
		this.personId = personId;
		this.name = name;
		this.surName = surName;
		this.mobileNo = mobileNo;
		this.email = email;
		this.address = address;
		this.donate = donate;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public Long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Set<Donate> getDonate() {
		return donate;
	}

	public void setDonate(Set<Donate> donate) {
		this.donate = donate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
