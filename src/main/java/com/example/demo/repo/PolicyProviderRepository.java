package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.PolicyProvider;

@Repository
public interface PolicyProviderRepository extends JpaRepository<PolicyProvider, Long>{

	

}
