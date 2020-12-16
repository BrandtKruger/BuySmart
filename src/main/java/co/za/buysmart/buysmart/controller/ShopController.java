package co.za.buysmart.buysmart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import co.za.buysmart.buysmart.model.Shop;
import co.za.buysmart.buysmart.service.ShopService;

@Controller
@RequestMapping(value = "/buysmart/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;

	@RequestMapping(value = {"", "/shopmainpage"})
	public String viewAllShops(Model model) {
	    List<Shop> listShops = shopService.getAllShops();
	    model.addAttribute("listShop", listShops);
	    return "/shop/shopmainpage.html";
	}
	
	@RequestMapping("/new")
	public String showNewPage(Model model) {
		Shop shop = new Shop();
		model.addAttribute("shop", shop);
		return "/shop/new_shop.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveShop(@ModelAttribute("shop") Shop shop) {
		shopService.addShop(shop);
		return "redirect:/buysmart/shop/shopmainpage";
	}

	@RequestMapping("/edit/{shopId}")
	public ModelAndView showEditPage(@PathVariable(name = "shopId") Long shopId) {
		ModelAndView mav = new ModelAndView("/shop/edit_shop");
		
		Shop shop = shopService.getShopDetails(shopId);
		mav.addObject("shop", shop);
		return mav;
	}
	
	@RequestMapping("/delete/{shopId}")
	public String showDeletePage(@PathVariable(name = "shopId") Long shopId) {
		shopService.deleteShop(shopId);
		return "redirect:/buysmart/shop/shopmainpage";
	}

}
