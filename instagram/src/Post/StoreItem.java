package Post;

import User.Seller;

public class StoreItem extends Content {
	private Seller seller;
	private double price;
	private String source;
	public StoreItem() {
		super();
	}
	public StoreItem(Seller seller, double price, String source) {
		super();
		this.seller = seller;
		this.price = price;
		this.source = source;
	}
	public Seller getSeller() {
		return seller;
	}
	public void setSeller(Seller seller) {
		this.seller = seller;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}


}
