package in.mayank.service;

import java.util.Collections;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import in.mayank.Entity.Customer;
import in.mayank.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService, UserDetailsService {

	@Autowired
	private final JwtService jwtService;

	@Autowired
	private BCryptPasswordEncoder pwdEncoder;

	@Autowired
	private CustomerRepository customerRepo;

	@Autowired
	private AuthenticationManager authManager;

	CustomerServiceImpl(JwtService jwtService) {
		this.jwtService = jwtService;
	}

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Customer c = customerRepo.findByEmail(email);
		return new User(c.getEmail(), c.getPassword(), Collections.EMPTY_LIST);

	}

	@Override
	public String login(Customer c) {
	     UserDetails userDetails = loadUserByUsername(c.getEmail());
	     return jwtService.generateToken(userDetails);
	}

	@Override
	public boolean register(Customer c) {
		String pwdEncoded = pwdEncoder.encode(c.getPassword());

		c.setPassword(pwdEncoded);

		Customer customer = customerRepo.save(c);
		return customer.getId() != null;
	}

}
