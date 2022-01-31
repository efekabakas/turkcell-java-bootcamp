package business.concrete;

import business.abstracts.CampaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concrete.Campaign;

public class CampaignManager implements CampaignService {
	
	private CampaignDao campaignDao;
	
	public CampaignManager(CampaignDao campaignDao) {
		super();
		this.campaignDao = campaignDao;
	}

	@Override
	public void add(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Campaign campaign) {
		// TODO Auto-generated method stub
		
	}

}
