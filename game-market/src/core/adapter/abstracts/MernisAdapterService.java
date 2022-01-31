package core.adapter.abstracts;

import java.rmi.RemoteException;

import entities.concrete.Customer;

public interface MernisAdapterService {
	
	boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException;
}
