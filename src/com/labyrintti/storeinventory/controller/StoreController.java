package com.labyrintti.storeinventory.controller;

//import java.io.IOException;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.beans.factory.annotation.Autowired;

import com.labyrintti.storeinventory.service.GoodsService;
import com.labyrintti.storeinventory.dbmodel.Goods;

@Controller
@RequestMapping("/store")
public class StoreController {
    
    @Autowired
    private GoodsService goodsService;
    
    @RequestMapping("/list")
    public ModelAndView list() {
        
        String message = "This is a list page.";
        
        List<Goods> goods = (List<Goods>) goodsService.listGoods();
        System.out.println(goods);
        return new ModelAndView("list", "message", message);
    }
    
    @RequestMapping("/list/{id}")
    public ModelAndView listWithParm(@PathVariable("id") String contactId) {
        
        String message = contactId;
        
        return new ModelAndView("list", "message", message);
    }
}
