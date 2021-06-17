package com.example.HelloHuman;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {

	@RequestMapping("/your_server/counter")
	public String count() {
	return "count.jsp";
}
	
	@RequestMapping("/your_server")
	public String index(HttpSession session){
      if(session.isNew()) {
    	 session.setAttribute("count", 0);
      }
      else{
    	  Integer count = (Integer) session.getAttribute("count");
    	  count++;
    	  session.setAttribute("count", count);
      }
       
        return "index.jsp";
    }
}
