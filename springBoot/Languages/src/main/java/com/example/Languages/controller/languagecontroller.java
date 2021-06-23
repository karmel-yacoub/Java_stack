package com.example.Languages.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Languages.models.Language;
import com.example.Languages.services.LanguageService;
@Controller
public class languagecontroller {
private final LanguageService languageserve;

public languagecontroller(LanguageService languageserve) {
	this.languageserve = languageserve;
}
@RequestMapping("/languages")
public String form(Model model,@ModelAttribute("language") Language lang) {
    List<Language> languages = languageserve.allLanguage();
    model.addAttribute("languages", languages);
    return "/languages/form.jsp";
}
@RequestMapping(value="/languages", method=RequestMethod.POST)
public String createlanguage(@Valid @ModelAttribute("language") Language language , BindingResult result) {
	if (result.hasErrors()) {
		return "/languages/form.jsp";
	}
	else {
		languageserve.createlanguage(language);
		return "redirect:/languages";
		
	}
}
@RequestMapping("/languages/{id}")
public String show(@PathVariable("id")Long id,Model model) {
	Language language = languageserve.findlanguage(id);
	model.addAttribute("language",language);
	return"/languages/show.jsp";
}
@RequestMapping(value="/languages/delete/{id}")
public String destroy(@PathVariable("id")Long id) {
	languageserve.deletelanguage(id);
	return"redirect:/languages";
}
@RequestMapping("/languages/edit/{id}")
public String showedit(@PathVariable("id")Long id,Model model,@Valid @ModelAttribute("language") Language language) {
	Language lang = languageserve.findlanguage(id);
	model.addAttribute("language",lang);
	return"/languages/edit.jsp";
}
@RequestMapping(value="/languages/edit/{id}",method=RequestMethod.POST)
public String edit(@PathVariable("id")Long id,@RequestParam(value ="name") String name,@RequestParam(value ="creator") String creator,@RequestParam(value ="currentVersion") Double currentVersion){
	languageserve.ubdatelanguage(id, name, creator, currentVersion);
	return "redirect:/languages/{id}";
}
}
