package User;

public class Seller extends User {
	private String website;
	private String businessContact;
	
	public Seller() {
		super();
	}
	
	public Seller(String website, String businessContact) {
		super();
		this.website = website;
		this.businessContact = businessContact;
	}

	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getBusinessContact() {
		return businessContact;
	}
	public void setBusinessContact(String businessContact) {
		this.businessContact = businessContact;
	}
	
	
	
}
