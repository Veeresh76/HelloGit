package com.Doctors.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Doctors.Entity.Doctor;
import com.Doctors.Services.DoctorsServices;

@RestController
public class DoctorsController {

	@Autowired
	DoctorsServices doctorsServices;
	
	@RequestMapping(path="/home")
	public ResponseEntity<String> home() {
		doctorsServices.addDoc();
		 return new ResponseEntity<>("home",HttpStatus.OK) ;
	}
	
	
	
	//Get All Doctors
	@GetMapping(path="/allDoctors")
	public ResponseEntity<List<Doctor>> allDoctors() {
		 return new ResponseEntity<List<Doctor>>(doctorsServices.allDoctors(),HttpStatus.OK) ;
	}
	
	
	
	//Sort Doctors List based on name 
	@GetMapping(path="/Doctor/{id}")
	public ResponseEntity<List<Doctor>> getDoctors(@PathVariable("id") int id) {
		 return new ResponseEntity<List<Doctor>>(doctorsServices.doctorById(id),HttpStatus.OK) ;
	}
	
	
	
    //Update YearOfExperiance by Id
	@PostMapping(path="/Doctor/{id}/{yoe}")
	public ResponseEntity<Doctor> setDoctorsYoe(@PathVariable("id") int id,@PathVariable("yoe") int yoe) {
		 return new ResponseEntity<Doctor>(doctorsServices.setYoeById(id,yoe),HttpStatus.OK) ;
	}
	
	
	
	//Sorted Doctors List based on Specilization
	@GetMapping(path="/DoctorSBS/{id}")
	public List<Doctor> dod(@PathVariable("id") int id) {
		 return (doctorsServices.doctorSortBySpecilization(id)) ;
	}
}
