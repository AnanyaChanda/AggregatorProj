package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.demo.entity.Policy;
import com.example.demo.entity.PolicyProvider;
import com.example.demo.exception.ProviderNotFoundException;
import com.example.demo.repo.PolicyProviderRepository;

@Service
public class PolicyProviderService {
	
	@Autowired
	PolicyProviderRepository policyProviderRepository;

	/**
	 * business logic to register or save the policy provider in to Aggregator's system 
	 * by using the method save() of CrudRepository 
	 * @param policy
	 * @return
	 */
	public PolicyProvider register(PolicyProvider provider) {		
		return policyProviderRepository.save(provider);
	}
	
	/**
	 * business logic to get all the policy provider list 
	 * by using the method findaAll() of CrudRepository
	 * @param 
	 * @return List<PolicyProvider>
	 */
	public List<PolicyProvider> getProviderList() {
		
		List<PolicyProvider> providerList= policyProviderRepository.findAll();
		if(providerList.isEmpty()) {
			throw new ProviderNotFoundException("Currently there is no Policy Provider available");
			
		}
		return providerList;
	}

	/**
	 * business logic to get all the policies of the insurance providers 
	 * @param 
	 * @return List<Policy>
	 */
	public List<Policy> getAllPolicies() {		
		List<Policy> policyList= new ArrayList<>();
		try {
			HttpHeaders headers=new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> requestEntity=new HttpEntity<>(headers);
			RestTemplate restTemplate=new RestTemplate();
				
			List<PolicyProvider> providerList=getProviderList();
			
			for(PolicyProvider provider:providerList) {
				System.out.println("Entered=====");
					
				ResponseEntity<Policy[]> responseEntity =restTemplate.exchange(provider.getProviderUrl(), HttpMethod.GET, requestEntity, Policy[].class);
				Policy[] policies=responseEntity.getBody();
				
				if(policies.length>0) {
					for(Policy policy:policies) {
						policyList.add(policy);
						System.out.println("=========");
						System.out.println(policy.getPlanName());
					}
					
				}
				
			
			}
		}
		catch(Exception exception) {
			System.out.println("Check the Exception  "+exception);
			
		}
		if(policyList.isEmpty()) {
			throw new ProviderNotFoundException("Currently there is no Policies available");		
		}
		
		return policyList;
		
		
		
	}
	
	
	
	
   

}
