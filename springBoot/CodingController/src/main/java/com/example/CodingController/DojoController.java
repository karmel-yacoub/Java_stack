package com.example.CodingController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	@RequestMapping("/{dojo}")
	public String showdojo(@PathVariable("dojo") String dojo){
		if (dojo.equals("dojo")){
		return "The dojo is awesome!" + dojo;
		}
		else if (dojo.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California"+dojo;
			
		}
		else if(dojo.equals("san-jose")) {
			return "SJ dojo is the headquarters";
			
		}
		
		else {
			return "hi";
		}
	}
	

}
