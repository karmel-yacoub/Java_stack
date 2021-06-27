package com.example.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.relationships.models.License;

public interface LicenseRepositories extends CrudRepository<License,Long>{
	List<License>findAll();

}
