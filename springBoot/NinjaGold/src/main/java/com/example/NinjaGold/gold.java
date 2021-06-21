package com.example.NinjaGold;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class gold {
	public int num=0; 
	ArrayList <String> arr = new ArrayList<String>();
	@RequestMapping("/gold")

	public String yourgold(Model model) {
		model.addAttribute("arr", arr);
		return "gold.jsp";
	}

	@RequestMapping(value = "/process_money", method = RequestMethod.POST)
	public String findgold(HttpSession activbox,@RequestParam(value ="which_form") String buliding) {
		if(buliding.equals("farm")) {
			 Random r = new Random();
			 num=r.nextInt(10) + 10;
			 DateTimeFormatter date = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm a"); 
			 LocalDateTime now = LocalDateTime.now(); 
			 arr.add(0, "You entered a farm and earned "+String.valueOf(num)+ " golds. ("+
					 date.format(now) +")");
	
		}
		
		else if(buliding.equals("cave")) {
			 Random r = new Random();
			 num=r.nextInt(5) + 5;
			 DateTimeFormatter date = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm a"); 
			 LocalDateTime now = LocalDateTime.now(); 
			 arr.add(0, "You entered a cave and earned "+String.valueOf(num)+ " golds. ("+
					 date.format(now) +")");
			
		}
		else if(buliding.equals("casino")) 
		{
			 Random r = new Random();
			 num=r.nextInt(100) - 50;
			 DateTimeFormatter date = DateTimeFormatter.ofPattern("MMMM dd yyyy, hh:mm a"); 
			 LocalDateTime now = LocalDateTime.now(); 
			 if(num>0) {
				 arr.add(0, "You entered a casino and earned "+String.valueOf(num)+ " golds. ("+
						 date.format(now) +")");
				
			 }
			 else if(num<0) {
				 arr.add(0, "You entered a casino and lost "+String.valueOf(num)+ " golds..Ouch ("+
						 date.format(now) +")");
				 
			 }
			
		}
		 if(activbox.getAttribute("golds")!= null) {
			 activbox.setAttribute("golds", (Integer)activbox.getAttribute("golds")+num);
		 }
		 else {
			 activbox.setAttribute("golds", num);
		 }
		
		 activbox.setAttribute("activities", arr); 

		return "redirect:/gold";
	}
}
