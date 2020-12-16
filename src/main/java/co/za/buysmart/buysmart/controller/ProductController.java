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

import co.za.buysmart.buysmart.model.Product;
import co.za.buysmart.buysmart.service.ProductService;

@Controller
@RequestMapping(value = "/buysmart/product")
public class ProductController {
	
	@Autowired
	private ProductService productService;

	@RequestMapping(value = {"/productmainpage", ""})
	public String viewHomePage(Model model) {
	    List<Product> listProducts = productService.getAllProducts();
	    model.addAttribute("listProducts", listProducts);
	     
	    return "/product/productmainpage.html";
	}
	
	@RequestMapping("/new")
	public String showNewPage(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "/product/new_product.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.addProduct(product);
		return "redirect:/buysmart/product/productmainpage";
		
	}
	
	@RequestMapping("/edit/{productId}")
	public ModelAndView showEditPage(@PathVariable(name = "productId") Long productId) {
		ModelAndView mav = new ModelAndView("product/edit_product");
		
		Product product = productService.getProductById(productId);
		mav.addObject("product", product);
		return mav;
	}
	
	@RequestMapping("/delete/{productId}")
	public String showDeletePage(@PathVariable(name = "productId") Long productId) {
		productService.deleteProduct(productId);
		return "redirect:/buysmart/product/productmainpage";
	}

}
