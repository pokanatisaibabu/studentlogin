package com.practice.studentlogin;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@Table(name="studentlogin")
@Entity
@NoArgsConstructor
@Component
public class StudentDetails 
{
	  @Id
	  private int id;
	  private String sname;
	  private double Cgpa;
	  private String email;
	  private String phone;
	  private String department;
	  private int year;
	  public StudentDetails() {}
	  public StudentDetails(int id, String sname, double Cgpa, String email, String phone, String department, int year) {
		super();
		this.id = id;
		this.sname = sname;
		this.Cgpa = Cgpa;
		this.email = email;
		this.phone = phone;
		this.department = department;
		this.year = year;
	}
  public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getCgpa() {
		return Cgpa;
	}
	public void setCgpa(double marks) {
		this.Cgpa = marks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
}
