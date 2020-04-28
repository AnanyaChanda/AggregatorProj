package com.example.demo.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="PolicyProviderDetails")
public class PolicyProvider implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Provider_Id")
	private long providerId;
	
	@NotNull(message = "Enter the name of the insurance provider")
	@Column(name = "Provider_Name")
	private String providerName;
	
	@NotNull(message = "Provide the URL of the insurance provider to fetch all its policies")
	@Column(name = "Provider_URL")
	private String providerUrl;
	
	@NotNull(message = "Provide the response type  of the insurance provider (json/xml) ")
	@Column(name = "Response_Type")
	private String responseType;
	
	
	@Column(name="Active_Status", nullable = false)
	private boolean activeStatus=true;


	public long getProviderId() {
		return providerId;
	}


	public void setProviderId(long providerId) {
		this.providerId = providerId;
	}


	public String getProviderName() {
		return providerName;
	}


	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}


	public String getProviderUrl() {
		return providerUrl;
	}


	public void setProviderUrl(String providerUrl) {
		this.providerUrl = providerUrl;
	}


	public String getResponseType() {
		return responseType;
	}


	public void setResponseType(String responseType) {
		this.responseType = responseType;
	}


	public boolean isActiveStatus() {
		return activeStatus;
	}


	public void setActiveStatus(boolean activeStatus) {
		this.activeStatus = activeStatus;
	}

	

}
