package com.example.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
	@Id
	private int courseid;
	private String cname;
	private String instructor;
	private String category;
	private int noOfDays;
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int courseid, String cname, String instructor, String category, int noOfDays) {
		super();
		this.courseid = courseid;
		this.cname = cname;
		this.instructor = instructor;
		this.category = category;
		this.noOfDays = noOfDays;
	}
	public int getCourseid() {
		return courseid;
	}
	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + ((cname == null) ? 0 : cname.hashCode());
		result = prime * result + courseid;
		result = prime * result + ((instructor == null) ? 0 : instructor.hashCode());
		result = prime * result + noOfDays;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Course))
			return false;
		Course other = (Course) obj;
		if (category == null) {
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (cname == null) {
			if (other.cname != null)
				return false;
		} else if (!cname.equals(other.cname))
			return false;
		if (courseid != other.courseid)
			return false;
		if (instructor == null) {
			if (other.instructor != null)
				return false;
		} else if (!instructor.equals(other.instructor))
			return false;
		if (noOfDays != other.noOfDays)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", cname=" + cname + ", instructor=" + instructor + ", category="
				+ category + ", noOfDays=" + noOfDays + "]";
	}	
	
	

}
