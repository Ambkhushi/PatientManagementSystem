package com.Project.springrest.Controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Project.springrest.Entites.Patient;
import com.Project.springrest.Service.PatientService;

@RestController
@RequestMapping("/patients")
public class PatientController {

	private final PatientService patientService;

	public PatientController(PatientService patientService) {
		super();
		this.patientService = patientService;
	}

	// build create Patient Rest API
	@PostMapping
	public ResponseEntity<Patient> savePatient(@RequestBody Patient patient) {
		return new ResponseEntity<Patient>(patientService.savePatient(patient), HttpStatus.CREATED);
	}

	// build get all Patient API
	@GetMapping
	public List<Patient> getAllPatients() {
		return patientService.getAllPatients();
	}

	// build get PAtient By Id Rest API
	@GetMapping("{id}")
	public ResponseEntity<Patient> getPatientById(@PathVariable("id") long patientId) {
		return new ResponseEntity<Patient>(patientService.getPatientById(patientId), HttpStatus.OK);
	}

	// build update Patient Rest API
	@PutMapping("{id}")
	public ResponseEntity<Patient> updatePatient(@PathVariable("id") long id, @RequestBody Patient patient) {
		patient.setId(id);
		return new ResponseEntity<Patient>(patientService.updatePatient(patient), HttpStatus.OK);
	}

	// build delete Patient Rest API
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletePaitient(@PathVariable("id") long id) {
		patientService.deletePaitient(id);
		return new ResponseEntity<String>("Patient Deleted Successfully!.", HttpStatus.OK);
	}
}
