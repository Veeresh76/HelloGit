package com.Doctors.Sorting;

import java.util.Comparator;

import com.Doctors.Entity.Doctor;





public class SortBasedOnName implements Comparator<Doctor> {

	@Override
	public int compare(Doctor d1, Doctor d2) {

		return d1.getName().compareTo(d2.getName());
	}

	



}
