package com.example.TheCode;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class Code {
	@RequestMapping("/")
	public String view() {
		return "try.jsp";
	}
	
    @RequestMapping(value="/code", method=RequestMethod.POST)
    public String trycode(@RequestParam(value="code") String trycode) {
    	if (trycode.equals("karmel")) {
    	return "code.jsp";	
    	}
    	else {
    		return "redirect:/createError";
    	}
    	
    }

    @RequestMapping("/createError")
    public String flashMessages(RedirectAttributes redirectAttributes) {
        redirectAttributes.addFlashAttribute("error", "You must train harder!");
        return "redirect:/";
    	}
        
    
    @RequestMapping("/code")
    public String success() {
    return "code.jsp";
    }
}
