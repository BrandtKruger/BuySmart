package co.za.buysmart.buysmart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import co.za.buysmart.buysmart.model.Client;
import co.za.buysmart.buysmart.service.ClientService;

import javax.validation.Valid;

@Controller
@RequestMapping(value = "/buysmart/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value = {"/clientmainpage", ""})
	public String viewAllClients(Model model) {
	    List<Client> listClients = clientService.getAllClients();
	    model.addAttribute("listClients", listClients);	     
	    return "/client/clientmainpage.html";
	}
	
	@RequestMapping("/new")
	public String showNewPage(Model model) {
		Client client = new Client();
		model.addAttribute("client", client);
		return "/client/new_client.html";
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String saveClient(@Valid @ModelAttribute("client") Client client) {
		clientService.addClient(client);
		return "redirect:/buysmart/client/clientmainpage";
		
	}

	@RequestMapping("/edit/{clientId}")
	public ModelAndView showEditPage(@Valid @PathVariable(name = "clientId") Long clientId) {
		ModelAndView mav = new ModelAndView("client/edit_client");
		
		Optional<Client> client = clientService.getClient(clientId);
		mav.addObject("client", client);
		return mav;
	}
	
	@RequestMapping("/delete/{clientId}")
	public String showDeletePage(@PathVariable(name = "clientId") Long clientId) {
		clientService.deleteClient(clientId);
		return "redirect:/buysmart/client/clientmainpage";
	}
}
