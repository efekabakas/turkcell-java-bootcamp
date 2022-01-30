package Post;

import java.util.Arrays;

public class Explore {
	private Post[] posts;
	private ReelsItem[] reels;
	private StoreItem[] products;
	public Explore() {
		super();
	}
	public Explore(Post[] posts, ReelsItem[] reels, StoreItem[] products) {
		super();
		this.posts = posts;
		this.reels = reels;
		this.products = products;
	}
	public Post[] getPosts() {
		return posts;
	}
	public void setPosts(Post[] posts) {
		this.posts = posts;
	}
	public ReelsItem[] getReels() {
		return reels;
	}
	public void setReels(ReelsItem[] reels) {
		this.reels = reels;
	}
	public StoreItem[] getProducts() {
		return products;
	}
	public void setProducts(StoreItem[] products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Explore [posts=" + Arrays.toString(posts) + ", reels=" + Arrays.toString(reels) + ", products="
				+ Arrays.toString(products) + "]";
	}
}
