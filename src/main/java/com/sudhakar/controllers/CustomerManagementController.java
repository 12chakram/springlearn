/**
 * 
 */
package com.sudhakar.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sudhakar.common.ServiceDelegater;
import com.sudhakar.data.Customer;
import com.sudhakar.forms.CustoemrForm;
import com.sudhakar.service.CustomerManagementService;

/**
 * @author sudhakar5589
 *
 */
@Controller
@RequestMapping("/customer")
public class CustomerManagementController {
	
	 @RequestMapping(value = "/signup", method = RequestMethod.GET)
	    public String showForm(Model model) {
	    	model.addAttribute("customer", new CustoemrForm());
	        return "customerSignUp";
	    }
	 
	  
	 @RequestMapping(value ="/addCustomer", method=RequestMethod.POST)
	 public String addUser(@ModelAttribute("customer") CustoemrForm customerForm,Model model){
		 CustomerManagementService customerService = (CustomerManagementService)ServiceDelegater.getService("customerService");
		 
		 Customer customer = new Customer();
		 customer.setFirstName(customerForm.getFirstName());
		 customer.setLastName(customerForm.getLastName());
		 customer.setPassword(customerForm.getPassword());
		 customer.setEmail(customerForm.getEmail());
		 customer.setMobile(customerForm.getMobile());
		
		boolean isSaved = customerService.addCustomerService(customer);
		
		if(isSaved){
			return "showCustomer";
		}else{
			return "index";
		}
		
		 
	 }

}
