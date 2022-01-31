package business.concrete;

import business.abstracts.CustomerService;
import entities.concrete.Customer;
import core.adapter.abstracts.MernisAdapterService;
import dataAccess.abstracts.CustomerDao;

public class CustomerManager implements CustomerService {
	
	private CustomerDao customerDao;
	private MernisAdapterService mernisAdapterService;

	public CustomerManager(CustomerDao customerDao, MernisAdapterService mernisAdapterService) {
		super();
		this.customerDao = customerDao;
		this.mernisAdapterService = mernisAdapterService;
	}
	@Override
	public void add(Customer customer) throws Exception {
		
		if(this.mernisAdapterService.checkIfRealPerson(customer)) {
			this.customerDao.add(customer);
		}else throw new Exception(customer.getId() + " is not a valid person");
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}
}
