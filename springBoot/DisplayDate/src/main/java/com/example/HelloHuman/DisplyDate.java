package com.example.HelloHuman;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class DisplyDate {
	@RequestMapping("/")
	public String index() {
		return ("index.jsp");
	}
	@RequestMapping("/time")
	public String time(Model model) {
		String timepattern="hh:mm aaa";
		SimpleDateFormat time=new SimpleDateFormat(timepattern);
		String time2=time.format(new Date());
//		Date karmel=new Date();
//		model.addAttribute("time",karmel);
		model.addAttribute("time",time2);
		
		return("time.jsp");
	}
	@RequestMapping("/date")
	public String date(Model model) {
		String timepattern="E,MMM 'The' dd 'of' yyyy";
		SimpleDateFormat date=new SimpleDateFormat(timepattern);
		String date2=date.format(new Date());
		model.addAttribute("date",date2);
		return ("date.jsp");
	}
		
	}
