package com.example.relationships.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.relationships.models.Person;

public interface PersonRepsitories extends CrudRepository<Person,Long> {
	List<Person>findAll();
}
