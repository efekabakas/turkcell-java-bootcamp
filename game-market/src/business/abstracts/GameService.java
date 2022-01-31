package business.abstracts;

import entities.concrete.Game;

public interface GameService {
	void add(Game game);
	void update(Game game);
	void delete(Game game);
}
