package com.example.Languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.Languages.models.Language;
import com.example.Languages.repositories.LanguageRepository;

@Service
public class LanguageService {
private final LanguageRepository languageRebo;

public LanguageService(LanguageRepository languageRebo) {
	this.languageRebo = languageRebo;
}
public List<Language> allLanguage(){
	return languageRebo.findAll();
}
public Language createlanguage(Language a) {
	return languageRebo.save(a);
}
public Language findlanguage(Long id) {
	Optional<Language>optionallanguage=languageRebo.findById(id);
	if(optionallanguage.isPresent()) {
		return optionallanguage.get();
	}else {
		return null;
	}
}
public Language ubdatelanguage(Long id ,String name,String creator,Double currentVersion) {
	Language c =findlanguage(id);
	c.setName(name);
	c.setCreator(creator);
	c.setCurrentVersion(currentVersion);
	languageRebo.save(c);
	return c;
}
public void deletelanguage(Long id) {
	languageRebo.deleteById(id);
}
}
