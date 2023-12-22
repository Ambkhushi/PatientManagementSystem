package com.Project.springrest.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Insurance {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String policyholderFirstName;
	    private String policyholderLastName;
	    private String primaryRxBin;
		
	    public Insurance(Long id, String policyholderFirstName, String policyholderLastName, String primaryRxBin) {
			super();
			this.id = id;
			this.policyholderFirstName = policyholderFirstName;
			this.policyholderLastName = policyholderLastName;
			this.primaryRxBin = primaryRxBin;
		}

	    @OneToOne(mappedBy = "insurance")
	    @JsonBackReference
	    private Patient patient;
	    
		public Insurance() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPolicyholderFirstName() {
			return policyholderFirstName;
		}

		public void setPolicyholderFirstName(String policyholderFirstName) {
			this.policyholderFirstName = policyholderFirstName;
		}

		public String getPolicyholderLastName() {
			return policyholderLastName;
		}

		public void setPolicyholderLastName(String policyholderLastName) {
			this.policyholderLastName = policyholderLastName;
		}

		public String getPrimaryRxBin() {
			return primaryRxBin;
		}

		public void setPrimaryRxBin(String primaryRxBin) {
			this.primaryRxBin = primaryRxBin;
		}
	    
}
