package business.concretes;

import java.util.ArrayList;
import business.abstracts.UserService;
import core.exceptions.BusinessException;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService{
	private UserDao userDao;
	
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	

	@Override
	public void add(User user) throws BusinessException {
		if (checkeMailExist(user.geteMail())&&
			checkeMailisValid(user.geteMail())&&
			checkPasswordLength(user.getPassword())&&
			checkName(user.getFirstName())&&
			checkSurname(user.getLastName())) {
			
			userDao.add(user);
		}
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	public boolean checkPasswordLength(String password) throws BusinessException {
		
		if (password.length()<6) {
			throw new BusinessException("Þifre 6 karakterden az olamaz.");
		}
		return true;
				
	}

	public boolean checkeMailisValid(String eMail) throws BusinessException {
		if(eMail.contains("@")) {
			return true;
		}
		throw new BusinessException("Geçerli bir e posta adresi girin.");
		
	}
	
	public boolean checkeMailExist(String eMail) throws BusinessException {
		if (userDao.eMailGetAll().contains(eMail)) {
			throw new BusinessException("Kayýtlý eMail.");
		}
		return true;
	}
	

	public boolean checkName(String name) throws BusinessException {
		if (name.length()<2) {
			throw new BusinessException("Ad ve soyad en az ikiþer karakterden oluþmalýdýr.");
		}
		return true;
	}
	public boolean checkSurname(String surname) throws BusinessException {
		if (surname.length()<2) {
			throw new BusinessException("Ad ve soyad en az ikiþer karakterden oluþmalýdýr.");
		}
		return true;
	}

	@Override
	public ArrayList<String> eMailGetAll() {
		return null;
	}

}
