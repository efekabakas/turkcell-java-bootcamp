package entities.concrete;

import entities.abstracts.Entity;

public class Campaign implements Entity {
	
	private int id;
	private String campaignCode;
	private double percentage;
	
	public Campaign() {
		super();
	}
	public Campaign(int id, String campaignCode, double percentage) {
		super();
		this.id = id;
		this.campaignCode = campaignCode;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	
	

}
