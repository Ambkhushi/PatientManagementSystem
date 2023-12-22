package com.Project.springrest.Entites;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.*;

@Entity
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "FirstName", nullable = false)
	private String firstName;
	@Column(nullable = false)
	private String lastName;
	@Column(nullable = false)
	private String dateofBirth;
	@Column(nullable = false)
	private String gender;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "contact_id")
	@JsonManagedReference
	private Contact contact;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	@JsonManagedReference
	private Address address;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "clinical_id")
	@JsonManagedReference
	private Clinical clinical;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prescription_id")
	@JsonManagedReference
	private Prescriptions prescriptions;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "prescriber_id")
	@JsonManagedReference
	private Prescriber prescriber;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "insurance_id")
	@JsonManagedReference
	private Insurance insurance;

	public Patient(Long id, String firstName, String lastName, String dateofBirth, String gender, Contact contact,
			Address address, Clinical clinical, Prescriptions prescriptions, Prescriber prescriber,
			Insurance insurance) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.contact = contact;
		this.address = address;
		this.clinical = clinical;
		this.prescriptions = prescriptions;
		this.prescriber = prescriber;
		this.insurance = insurance;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Clinical getClinical() {
		return clinical;
	}

	public void setClinical(Clinical clinical) {
		this.clinical = clinical;
	}

	public Prescriptions getPrescriptions() {
		return prescriptions;
	}

	public void setPrescriptions(Prescriptions prescriptions) {
		this.prescriptions = prescriptions;
	}

	public Prescriber getPrescriber() {
		return prescriber;
	}

	public void setPrescriber(Prescriber prescriber) {
		this.prescriber = prescriber;
	}

	public Insurance getInsurance() {
		return insurance;
	}

	public void setInsurance(Insurance insurance) {
		this.insurance = insurance;
	}
}
