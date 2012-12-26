package com.labyrintti.storeinventory.controller;

//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/store")
public class StoreController {
    @RequestMapping("/list")
    public ModelAndView list() {
        
        String message = "This is a list page.";
        
        return new ModelAndView("list", "message", message);
    }
    
    @RequestMapping("/list/{id}")
    public ModelAndView listWithParm(@PathVariable("id") String contactId) {
        
        String message = contactId;
        
        return new ModelAndView("list", "message", message);
    }
}
