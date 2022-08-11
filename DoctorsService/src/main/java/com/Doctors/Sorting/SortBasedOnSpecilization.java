package com.Doctors.Sorting;

import java.util.Comparator;

import com.Doctors.Entity.Doctor;

public class SortBasedOnSpecilization implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		
		return o1.getSpecialist().compareTo(o2.getSpecialist());
	}

}
