package com.wemapjobs.wemapjobs.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jobs")
public class Jobs {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int jobid;
	
	@Column(name="userid")
	public int userId;
	
	@Column(name="title")
	public String title;
	
	@Column(name="description")
	public String description;
	
	@Column(name="location")
	public String location;
	
	@Column(name="phonenumber")
	public int phone;
	
	@Column(name="isactive")
	public boolean isActive;
	
	@ManyToOne
	public Jobcategory jobcategory;
	
	@ManyToOne
	public Company company;
	
	

	
	
	
	
}
