package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.repository.CustomerRepository;

@Controller
public class CustomerController {

	@Autowired CustomerRepository cr;

	@RequestMapping("/")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();

		Iterable<Customer> customerList = cr.findAll();
		mav.addObject("customerList", customerList);
		mav.setViewName("customerList");
        return mav;
	}
}