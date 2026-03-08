package com.example.demo.Services;

import com.example.demo.Entity.CustomerDetails;

public interface  BusServices{
	void saveCustomerDetails(CustomerDetails cd);
	void deleteCustomerDetails(int id);
	CustomerDetails getCustomerDetails(int id);
}
