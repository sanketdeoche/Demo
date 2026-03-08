package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.CustomerDetails;
import com.example.demo.Services.BusServicesimpl;

@RestController
public class BusController {
	
	@Autowired
	BusServicesimpl busserviceimpl;
	
	@PostMapping("bus")
	String BusServices(@RequestBody CustomerDetails cd) {
		busserviceimpl.saveCustomerDetails(cd);
		return" data is added";
	}
	@DeleteMapping("bus/{id}")
	String deleteServices (@PathVariable int id) {
		busserviceimpl.deleteCustomerDetails(id);
		return "data is deleted";
	}
	@GetMapping("bus/{id}")
	CustomerDetails getServices(@PathVariable int id) {
		CustomerDetails cd =busserviceimpl.getCustomerDetails(id);
		return cd;
	}

}
