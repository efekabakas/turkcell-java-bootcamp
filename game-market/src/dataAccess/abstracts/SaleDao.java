package dataAccess.abstracts;

import entities.concrete.Sale;

public interface SaleDao {
	void add(Sale sale);
	void update(Sale sale);
	void delete(Sale sale);
}
