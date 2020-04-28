package com.example.demo.entity;

public class Policy {
		
	private String planId;

	private String planName;
	
	private String  insuranceCompany;
	
	private double coverageAmount;
	
	private double premiumAmount;
	
	private String preOrPostHospitalization;

	private String preExistingDiseases;
	
	private double bonusPercentage;

	private String copayment;

	public String getPlanId() {
		return planId;
	}

	public void setPlanId(String planId) {
		this.planId = planId;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getInsuranceCompany() {
		return insuranceCompany;
	}

	public void setInsuranceCompany(String insuranceCompany) {
		this.insuranceCompany = insuranceCompany;
	}

	public double getCoverageAmount() {
		return coverageAmount;
	}

	public void setCoverageAmount(double coverageAmount) {
		this.coverageAmount = coverageAmount;
	}

	public double getPremiumAmount() {
		return premiumAmount;
	}

	public void setPremiumAmount(double premiumAmount) {
		this.premiumAmount = premiumAmount;
	}

	public String getPreOrPostHospitalization() {
		return preOrPostHospitalization;
	}

	public void setPreOrPostHospitalization(String preOrPostHospitalization) {
		this.preOrPostHospitalization = preOrPostHospitalization;
	}

	public String getPreExistingDiseases() {
		return preExistingDiseases;
	}

	public void setPreExistingDiseases(String preExistingDiseases) {
		this.preExistingDiseases = preExistingDiseases;
	}

	public double getBonusPercentage() {
		return bonusPercentage;
	}

	public void setBonusPercentage(double bonusPercentage) {
		this.bonusPercentage = bonusPercentage;
	}

	public String getCopayment() {
		return copayment;
	}

	public void setCopayment(String copayment) {
		this.copayment = copayment;
	}
	
	
	
	

}
