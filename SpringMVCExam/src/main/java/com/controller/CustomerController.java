package com.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.entities.Address;
import com.entities.Customer;
import com.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/login.do")
	public ModelAndView login(String username,String password,HttpServletRequest request){
		Customer customer = new Customer();
		customer.setFirst_name(username);
		customer.setLast_name(password);
		Customer customer2 = customerService.getCustomerByName(customer);
		System.out.println(customer2);
		if (customer2 == null) {
			return new ModelAndView("/login.jsp");
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("user", customer2.getFirst_name());
		}
		
		return new ModelAndView("/WEB-INF/index.jsp");
	}
	
	@RequestMapping("/exit.do")
	public ModelAndView exit(HttpServletRequest request) {
		HttpSession session = request.getSession();
		session.removeAttribute("user");
		return new ModelAndView("/login.jsp");
	}
	@RequestMapping("/select.do")
	public @ResponseBody List<Customer> getCustomers(){
		List<Customer> customers = customerService.getCustomers();
		System.out.println(customers.get(1));
		return customers;
	}
	
	@RequestMapping("/addCustomer.do")
	public ModelAndView insert(String first_name,String last_name,String email,Integer address){
		System.out.println(last_name + " " + last_name + " " + address);
		
		//List<Address> addresses = customerService.getAddresses();
		Customer customer = new Customer();    		
		customer.setStore_id(1);
		customer.setFirst_name(first_name);
		customer.setLast_name(last_name);
		if (null == email || "".equals(email)) {
			customer.setEmail("default@xx.com");
		}else {
			customer.setEmail(email);
		}
		customer.setAddress_id(address);
		customer.setCreate_date(new Date());
		
		customerService.insertCustomer(customer);
		return new ModelAndView("/WEB-INF/index.jsp");
	}
	@RequestMapping("/address.do")
	public @ResponseBody List<Address> getAddress() {
		List<Address> addresses = customerService.getAddresses();
		return addresses;
	}
	
	@RequestMapping("/toAddCustomer.do")
	public ModelAndView toAddCustomer() {
		return new ModelAndView("/WEB-INF/addCustomer.jsp");
	}
	
	@RequestMapping("/toFilme.do")
	public ModelAndView toAddFilme() {
		return new ModelAndView("/WEB-INF/filme.jsp");
	}
	
	@RequestMapping("/toIndex.do")
	public ModelAndView toIndex(){
		return new ModelAndView("/WEB-INF/index.jsp");
	}
}
