package dataAccess.abstracts;

import entities.concrete.Customer;

public interface CustomerDao {
	void add(Customer customer);
	void update(Customer customer);
	void delete(Customer customer);

}
