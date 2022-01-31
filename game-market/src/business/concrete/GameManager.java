package business.concrete;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concrete.Game;

public class GameManager implements GameService {
	
	private GameDao gameDao;
	
	public GameManager(GameDao gameDao) {
		super();
		this.gameDao = gameDao;
	}

	@Override
	public void add(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}
}
