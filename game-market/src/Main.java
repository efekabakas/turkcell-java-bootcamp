import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import business.concrete.CustomerManager;

import core.adapter.concrete.MernisAdapterManager;
import dataAccess.concrete.hibernateImpls.CustomerHibenateDao;
import entities.concrete.Campaign;
import entities.concrete.Customer;
import entities.concrete.Game;
import entities.concrete.Sale;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		//Customer customer = new Customer(1, "firstName", "surname",  LocalDate.of(year, month, day), "nationalityId");
		
		Campaign campaign = new Campaign(1, "NEWYEAR", 35);
		CustomerManager customerManager = new CustomerManager(new CustomerHibenateDao(), new MernisAdapterManager());
		customerManager.add(customer);
		
		Game game1 = new Game(0, "Fifa 2022", 79.99, "");
		Game game2 = new Game(1, "GTA V", 89.99, "");
		List<Game> games = new ArrayList<Game>();
		games.add(game1);
		games.add(game2);
		
		Sale sale = new Sale(customer, games, campaign);
		
		System.out.println(sale.getFee());
		
		
	

	}

}
