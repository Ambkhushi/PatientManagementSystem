package com.Project.springrest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Project.springrest.Entites.Patient;

public interface PatientRepo  extends JpaRepository<Patient, Long> {

	
}
