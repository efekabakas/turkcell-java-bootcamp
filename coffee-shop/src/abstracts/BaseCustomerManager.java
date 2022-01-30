package abstracts;

import entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) throws Exception {
		
		System.out.println(customer.getId() + ": Saved to the database.");
		
	}

}
