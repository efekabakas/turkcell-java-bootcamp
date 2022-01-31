package entities.concrete;

import java.util.List;

import entities.abstracts.Entity;

public class Sale implements Entity {
	private Customer buyer;
	private double fee;
	private List<Game> games;
	private Campaign campaign;
	public Sale() {
		super();
	}
	public Sale(Customer buyer, List<Game> games, Campaign campaign) {
		super();
		this.buyer = buyer;
		this.games = games;
		this.campaign = campaign;
		applyCampaign();
	}
	public Customer getBuyer() {
		return buyer;
	}
	public void setBuyer(Customer buyer) {
		this.buyer = buyer;
	}
	public double getFee() {
		return fee;
	}
	public void applyCampaign() {	//calculation of total fee after applying campaign
		int sum = 0;
		for(Game game : games) {
			sum += game.getPrice();
		}
		sum *= 1-this.campaign.getPercentage()/100;
		this.fee = sum;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	public Campaign getCampaign() {
		return campaign;
	}
	public void setCampaigs(Campaign campaign) {
		this.campaign = campaign;
	}
	
	

}
