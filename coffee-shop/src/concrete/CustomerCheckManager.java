package concrete;

import abstracts.CustomerCheckService;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class CustomerCheckManager implements CustomerCheckService{
	
	
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}
	
}
