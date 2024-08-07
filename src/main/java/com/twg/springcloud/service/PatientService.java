package com.twg.springcloud.service;

import java.util.List;

import com.twg.springcloud.entities.Patient;


public interface PatientService {
	
	public Patient savePatient(Patient patient);
	public Patient updatePatient(Patient patient);
	public void deletePatient(Patient patient);
	public Patient findById(int id);
	public List<Patient> findAll();
}
