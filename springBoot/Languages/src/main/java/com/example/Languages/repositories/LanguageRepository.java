package com.example.Languages.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.Languages.models.Language;

public interface LanguageRepository extends CrudRepository<Language,Long>{
	List <Language> findAll();
	
}
