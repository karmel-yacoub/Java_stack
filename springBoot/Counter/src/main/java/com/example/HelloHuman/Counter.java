package com.example.HelloHuman;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Counter {

	@RequestMapping("/your_server")
	public String index() {
	return "index.jsp";
}
	int c=0;
	@RequestMapping("/your_server/counter")
	public String index(HttpSession session){
        session.setAttribute("count", c);
        c+=1;
//        Integer count = (Integer) session.getAttribute("count");
//        model.addAttribute("count",count);
        return "count.jsp";
    }
}
