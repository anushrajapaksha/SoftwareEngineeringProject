package com.wemapjobs.wemapjobs.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="jobcategory")
public class Jobcategory {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int job_category_id;
	
	@Column(name="categoryname")
	public String name;

	@OneToMany(cascade=CascadeType.ALL,mappedBy = "jobcategory")
	public List<Jobs> job;
	
	
	public Jobcategory(int job_category_id, String name) {
		super();
		this.job_category_id = job_category_id;
		this.name = name;
	}

	public int getJob_category_id() {
		return job_category_id;
	}

	public void setJob_category_id(int job_category_id) {
		this.job_category_id = job_category_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
}
