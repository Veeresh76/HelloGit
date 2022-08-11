package com.Doctors.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Doctor {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private	int did;
	@Column
private	String name;
	@Column
private	String specialist;
	@Column
private	int yearsofexperinece;
	@Column
private int hospitalId;
	
	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Doctor(int did, String name, String specialist, int yearsofexperinece, int hospitalId) {
		super();
		this.did = did;
		this.name = name;
		this.specialist = specialist;
		this.yearsofexperinece = yearsofexperinece;
		this.hospitalId = hospitalId;
	}
	
	public Doctor(String name, String specialist, int yearsofexperinece, int hospitalId) {
		super();
		
		this.name = name;
		this.specialist = specialist;
		this.yearsofexperinece = yearsofexperinece;
		this.hospitalId = hospitalId;
	}
	
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public int getYearsofexperinece() {
		return yearsofexperinece;
	}
	public void setYearsofexperinece(int yearsofexperinece) {
		this.yearsofexperinece = yearsofexperinece;
	}
	public int getHospitalId() {
		return hospitalId;
	}
	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}
	@Override
	public String toString() {
		return "Doctor [did=" + did + ", name=" + name + ", specialist=" + specialist + ", yearsofexperinece="
				+ yearsofexperinece + ", hospitalId=" + hospitalId + "]";
	}
	
	
	
	
}
