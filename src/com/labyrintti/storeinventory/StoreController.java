package com.labyrintti.storeinventory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StoreController {
	
	@RequestMapping("/list")
    public ModelAndView helloWorld(HttpServletRequest request, HttpServletResponse response, HttpSession session) {
        
        String message = "This is a list page.";
        
        return new ModelAndView("list", "message", message);
    }

}
