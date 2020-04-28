package com.example.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Policy;
import com.example.demo.entity.PolicyProvider;
import com.example.demo.service.PolicyProviderService;

@RestController
public class PolicyProviderController {

	@Autowired
	PolicyProviderService policyProviderService;
	
	/**
	 * creating a get mapping that retrieves all the registered insurance provider list from database 
	 * @param 
	 * @return List<PolicyProvider>
	 */
	@GetMapping("provider/getProviderList")
	public List<PolicyProvider> getProviderList(){
		return policyProviderService.getProviderList();
		
	}
	
	/**
	 * creating a post mapping to register the interested insurance provider with the Aggregator system 
	 * @param PolicyProvider
	 * @return PolicyProvider
	 */
	@PostMapping("provider/register")
	public PolicyProvider register(@Valid @RequestBody PolicyProvider provider) {
		return policyProviderService.register(provider);		
	}
	
	/**
	 * creating a get mapping that retrieves all the policies provided by the insurance Provider 
	 * @param 
	 * @return List<Policy>
	 */
	@GetMapping("policy/getAll")
	public List<Policy> getAllPolicies(){
		return policyProviderService.getAllPolicies();
		
		
	}
	
	
	
}
