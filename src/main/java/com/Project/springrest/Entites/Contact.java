package com.Project.springrest.Entites;
import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;
import jakarta.persistence.Entity;

@Entity
public class Contact {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	 private String Ctype;
    private long value;

    @OneToOne(mappedBy = "contact")
    @JsonBackReference
    private Patient patient;

	public Contact(Long id, Long value, String type, Patient patient) {
		super();
		this.id = id;
		this.value = value;
		this.Ctype = type;
		this.patient = patient;
	}

	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return Ctype;
	}

	public void setType(String type) {
		this.Ctype = type;
	}

	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		this.value = value;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
    
}
