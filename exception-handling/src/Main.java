import business.abstracts.UserService;
import business.concretes.UserManager;
import core.exceptions.BusinessException;
import dataAccess.concretes.InMemoryUserDao;
import entities.concretes.User;

public class Main {

	public static void main(String[] args) throws BusinessException {
		// TODO Auto-generated method stub
		UserService userManager = new UserManager(new InMemoryUserDao());
		
		User user1 = new User(1, "fa", "oa", "112345648", "asd@");
		User user2 = new User(1, "fa2", "oa", "112345648", "asd@");
		
		
		userManager.add(user1);
		
		userManager.add(user2);
		
		
	}

}
