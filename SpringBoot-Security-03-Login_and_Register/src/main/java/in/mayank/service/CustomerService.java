package in.mayank.service;

import org.springframework.security.core.userdetails.UserDetails;

import in.mayank.Entity.Customer;

public interface CustomerService {

	public String login(Customer c);

	public boolean register(Customer c);

	public UserDetails loadUserByUsername(String email);
	
}
