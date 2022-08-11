package com.Doctors.Services;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Doctors.Entity.Doctor;
import com.Doctors.Repository.DoctorRepository;
import com.Doctors.Sorting.SortBasedOnName;
import com.Doctors.Sorting.SortBasedOnSpecilization;

@Service
public class DoctorsServices {

	@Autowired
	DoctorRepository doctorRepository;

	public List<Doctor>  allDoctors() {
		
		return doctorRepository.findAll();
	}
	
	public void addDoc() {
		Doctor doc=new Doctor("alex","eye",10,103);
		Doctor doc1=new Doctor("kindle","kidney",10,103);
		Doctor doc2=new Doctor("Sam","heart",10,103);
		doctorRepository.save(doc);
		doctorRepository.save(doc1);
		doctorRepository.save(doc2);
		
		
	}

	public List<Doctor> doctorById(int id) {
		
		
	List<Doctor> l =	doctorRepository.findByHospitalId(id);
	Collections.sort(l,new SortBasedOnName());
	return l;
	}

	public Doctor setYoeById(int id, int yoe) {
		Doctor d=doctorRepository.findById(id).get();
		d.setYearsofexperinece(yoe);
		doctorRepository.save(d);
		return d;
	}

	public List<Doctor> doctorSortBySpecilization(int id) {
		
		List<Doctor> l =	doctorRepository.findByHospitalId(id);
		Collections.sort(l,new SortBasedOnSpecilization());
		return l;
		
		
	}
	
	
}
