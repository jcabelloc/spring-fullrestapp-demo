package edu.tamu.jcabelloc.springfullrestappdemo.dao;

import java.util.List;

import edu.tamu.jcabelloc.springfullrestappdemo.entity.Customer;;;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);
}
