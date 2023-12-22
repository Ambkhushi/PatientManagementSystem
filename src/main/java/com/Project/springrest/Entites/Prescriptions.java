package com.Project.springrest.Entites;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.*;

@Entity
public class Prescriptions {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String NDC;

	@Column(nullable = false)
	private String rxNumber;

	@Column(nullable = false)
	private String drugName;

	@Column(nullable = false)
	private String strength;

	@Column(nullable = false)
	private String strengthUnits;

	@Column(nullable = false)
	private Integer supply;

	@Column(nullable = false)
	private Integer refills;

	public Prescriptions(Long id, String ndc, String rxNumber, String drugName, String strength, String strengthUnits,
			Integer supply, Integer refills) {
		super();
		this.id = id;
		NDC = ndc;
		this.rxNumber = rxNumber;
		this.drugName = drugName;
		this.strength = strength;
		this.strengthUnits = strengthUnits;
		this.supply = supply;
		this.refills = refills;
	}

	@OneToOne(mappedBy = "prescriptions")
	@JsonBackReference
	private Patient patient;

	public Prescriptions() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNDC() {
		return NDC;
	}

	public void setNDC(String ndc) {
		NDC = ndc;
	}

	public String getRxNumber() {
		return rxNumber;
	}

	public void setRxNumber(String rxNumber) {
		this.rxNumber = rxNumber;
	}

	public String getDrugName() {
		return drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getStrength() {
		return strength;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getStrengthUnits() {
		return strengthUnits;
	}

	public void setStrengthUnits(String strengthUnits) {
		this.strengthUnits = strengthUnits;
	}

	public Integer getSupply() {
		return supply;
	}

	public void setSupply(Integer supply) {
		this.supply = supply;
	}

	public Integer getRefills() {
		return refills;
	}

	public void setRefills(Integer refills) {
		this.refills = refills;
	}

}
