package core.dataAccess;

import java.util.ArrayList;

import core.entities.Entity;

public interface CrudRepository<T extends Entity> {
	void add(T entity);
	void update(T entity);
	void delete(T entity);
	ArrayList<String> eMailGetAll();
}
