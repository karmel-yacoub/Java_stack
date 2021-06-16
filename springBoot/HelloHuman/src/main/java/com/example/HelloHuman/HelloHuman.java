package com.example.HelloHuman;

//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloHuman{
	@RequestMapping("/")
	public String greet(@RequestParam(value="name", required=false) String your_server){
		if(your_server==null) {
			return "Hello Human!"+"\n Welcome to spring boot!";
		}
		else {
		 return "Hello"+" "+your_server+"Welcome to spring boot!";	
		}
}
}
//	@RequestMapping("/")
//	public String greeted(@RequestParam(value="name", required=false) String nameQuery) {
//		return "Hello"+nameQuery +"Welcome to spring boot!";
//	}
//}
