package co.za.buysmart.buysmart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/buysmart")
public class AppController {
	
	@RequestMapping("")
	public String viewHomePage(Model model) { 
	    return "index";
	}

	@RequestMapping("/login")
    public String login(Model model) {
        return "login.html";
    }

	@RequestMapping("/user")
    public String userIndex() {
        return "login_index.html";
    }

    @RequestMapping(value = {"/clientmainpage", "/client"}, method = RequestMethod.POST)
    public String clientIndex() {
		return "redirect:/buysmart/client/clientmainpage";
    }

    @RequestMapping(value = {"/productmainpage", "/product"}, method = RequestMethod.POST)
    public String productIndex() {
        return "redirect:/buysmart/product/productmainpage";
    }

    @RequestMapping(value = {"/shopmainpage", "/shop"}, method = RequestMethod.POST)
    public String shopsIndex() {
        return "redirect:/buysmart/shopmainpage";
    }
	
}
