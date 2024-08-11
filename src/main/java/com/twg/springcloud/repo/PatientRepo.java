package com.twg.springcloud.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twg.springcloud.entities.Patient;

public interface PatientRepo extends JpaRepository<Patient, Integer> {

}
