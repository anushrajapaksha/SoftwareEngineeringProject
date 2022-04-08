package com.wemapjobs.wemapjobs.model;

import java.sql.Date;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personaldetails")
public class Personaldetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int pid;
	
	@Column(name="firstname")
	public String firstname;
	
	@Column(name="lastname")
	public String lastname;
	
	@Column(name="dob")
	public LocalDate dob;
	
	@Column(name="address")
	public String address;
	
	@Column(name="phonenumber")
	public int phone;
	
	@Column(name="nationality")
	public String nationality;
	
	@Column(name="visastatus")
	public String visaStatus;
	
	@Column(name="resume")
	public String resume;
	
	@OneToOne(cascade = CascadeType.ALL)
	public Users userId;
	
}
