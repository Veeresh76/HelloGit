package com.Doctors.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.Doctors.Entity.Doctor;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

//@Query(value = "SELECT * FROM doctor WHERE hospitalId = ?1", nativeQuery = true)
	public List<Doctor> findByHospitalId(Integer id);
	
}
//public interface UserRepository extends JpaRepository<User, Long> {
//	  @Query(value = "SELECT * FROM USERS WHERE EMAIL_ADDRESS = ?1", nativeQuery = true)
	//  User findByEmailAddress(String emailAddress);
	//}