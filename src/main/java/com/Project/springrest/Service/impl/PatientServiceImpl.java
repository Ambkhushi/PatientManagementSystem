package com.Project.springrest.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.Project.springrest.Entites.Patient;
import com.Project.springrest.Exception.ResourceNotFoundException;
import com.Project.springrest.Repository.PatientRepo;
import com.Project.springrest.Service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	private PatientRepo patientRepo;
	
	public PatientServiceImpl(PatientRepo patientRepo) {
		super();
		this.patientRepo = patientRepo;
	}
	
	@Override
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}

	@Override
	public List<Patient> getAllPatients() {
		return patientRepo.findAll();
	}

	@Override
	public Patient getPatientById(long id) {
		Optional<Patient> patient=patientRepo.findById(id);
		if(patient.isPresent()) {
			return patient.get();
		}else {
			throw new ResourceNotFoundException("Patient", "Id", id);
		}
	}

	@Override
	public Patient updatePatient(Patient patient) {
		//we need to check whether patient with given id is exist in DB or not
//		Patient existingPatient=patientRepo.findById(id).orElseThrow(
//				()-> new ResourceNotFoundException("Patient", "Id", id));
		//save existing patient to DB
		patientRepo.save(patient);
		return patient;
	}

	@Override
	public void deletePaitient(long id) {
		//we need to check whether patient with given id is exist in DB or not
		patientRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Patient", "Id", id));
	patientRepo.deleteById(id);
	}

	
}
