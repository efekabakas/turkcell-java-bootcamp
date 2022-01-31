package business.abstracts;

import entities.concrete.Sale;

public interface SaleService {
	void add(Sale sale);
	void update(Sale sale);
	void delete(Sale sale);
}
