package in.mayank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.mayank.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

	public Customer findByEmail(String email);
}
