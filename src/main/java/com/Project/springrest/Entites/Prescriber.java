package com.Project.springrest.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Prescriber {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(nullable = false)
	 private String NPI;
	
	@Column(nullable = false)
	 private String firstName;
	
	@Column(nullable = false)
	 private String LastName;
	
	 private String Title;

	public Prescriber(Long id, String npi, String firstName, String lastName, String title) {
		super();
		this.id = id;
		NPI = npi;
		this.firstName = firstName;
		LastName = lastName;
		Title = title;
	}
	
	 @OneToOne(mappedBy = "prescriber")
	    @JsonBackReference
	    private Patient patient;

	public Prescriber() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNPI() {
		return NPI;
	}

	public void setNPI(String nPI) {
		NPI = nPI;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}
}
