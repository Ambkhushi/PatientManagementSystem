package com.Project.springrest.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Address {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    
	    private String type;

	    @Column(nullable = false)
	    private String line1;

	    private String line2;

	    @Column(nullable = false)
	    private String city;

	    @Column(nullable = false)
	    private String zipcode;

	    @Column(nullable = false)
	    private String stateCode;
	    
	    @OneToOne(mappedBy = "address")
	    @JsonBackReference
	    private Patient patient;
	    
		public Address(Long id, String type, String line1, String line2, String city, String zipcode, String stateCode,
				Patient patient) {
			super();
			this.id = id;
			this.type = type;
			this.line1 = line1;
			this.line2 = line2;
			this.city = city;
			this.zipcode = zipcode;
			this.stateCode = stateCode;
			this.patient = patient;
		}

		public Address() {
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
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public String getLine1() {
			return line1;
		}

		public void setLine1(String line1) {
			this.line1 = line1;
		}

		public String getLine2() {
			return line2;
		}

		public void setLine2(String line2) {
			this.line2 = line2;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getZipcode() {
			return zipcode;
		}

		public void setZipcode(String zipcode) {
			this.zipcode = zipcode;
		}

		public String getStateCode() {
			return stateCode;
		}

		public void setStateCode(String stateCode) {
			this.stateCode = stateCode;
		}

		public Patient getPatient() {
			return patient;
		}

		public void setPatient(Patient patient) {
			this.patient = patient;
		}


}
