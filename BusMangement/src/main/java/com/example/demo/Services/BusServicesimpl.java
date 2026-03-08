package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.CustomerDetails;
import com.example.demo.Repository.BusRepository;
@Service
public class BusServicesimpl  implements  BusServices{
@Autowired

BusRepository busrepository;

	@Override
	public void saveCustomerDetails(CustomerDetails cd) {
		// TODO Auto-generated method stub
		busrepository.save(cd);
	}

	@Override
	public void deleteCustomerDetails(int id) {
		// TODO Auto-generated method stub
		busrepository.deleteById(id);
	}

	@Override
	public CustomerDetails getCustomerDetails(int id) {
		// TODO Auto-generated method stub
	 return busrepository.findById(id).get();
	}

}
