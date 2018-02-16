package com.org.record.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "Donation")
public class Donate implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "donateId")
	private Long donateId;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "id", nullable = false)
	private PersonInfo personInfo;
	private Long donatedAmt;
	private Date donatedDate;

	public Donate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donate(Long donateId, PersonInfo personInfo, Long danatedAmt, Date donatedDate) {
		super();
		this.donateId = donateId;
		this.personInfo = personInfo;
		this.donatedAmt = danatedAmt;
		this.donatedDate = donatedDate;
	}

	public Long getDonateId() {
		return donateId;
	}

	public void setDonateId(Long donateId) {
		this.donateId = donateId;
	}

	public PersonInfo getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(PersonInfo personInfo) {
		this.personInfo = personInfo;
	}

	public Long getDonatedAmt() {
		return donatedAmt;
	}

	public void setDonatedAmt(Long donatedAmt) {
		this.donatedAmt = donatedAmt;
	}

	public Date getDonatedDate() {
		return donatedDate;
	}

	public void setDonatedDate(Date donatedDate) {
		this.donatedDate = donatedDate;
	}

 

}
