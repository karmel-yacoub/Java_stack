package com.example.DojoSurvey;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class DojoSurvey {
@RequestMapping("/")
public String form() {
	return "form.jsp";
}
@RequestMapping("/result")
public String information(HttpSession session) {
	return "show.jsp";
}

@RequestMapping(value="/show", method=RequestMethod.POST)
public String submitted(HttpSession session, @RequestParam(value="name") String name, @RequestParam(value="location") String location,@RequestParam(value="favLanguage") String favLanguage,@RequestParam(value="comment") String comment) {
    session.setAttribute("fname",name);
    session.setAttribute("location",location);
    session.setAttribute("favLanguage",favLanguage);
    session.setAttribute("comment",comment);
    return"redirect:/result";
}
}
