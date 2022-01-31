package business.concrete;

import business.abstracts.SaleService;
import dataAccess.abstracts.SaleDao;
import entities.concrete.Sale;

public class SaleManager implements SaleService {
	
	private SaleDao saleDao;
	
	public SaleManager(SaleDao saleDao) {
		super();
		this.saleDao = saleDao;
	}

	@Override
	public void add(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Sale sale) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Sale sale) {
		// TODO Auto-generated method stub
		
	}

}
