package com.Project.springrest.Service;

import java.util.List;

import com.Project.springrest.Entites.Patient;

public interface PatientService {

	Patient savePatient(Patient patient);
	List<Patient> getAllPatients();
	Patient getPatientById(long patientId);
	Patient updatePatient(Patient patient);
	void deletePaitient(long id);
}
