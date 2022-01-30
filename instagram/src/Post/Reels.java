package Post;

import java.util.Arrays;

public class Reels {
	private ReelsItem[] items;

	public Reels() {
		super();
	}

	public ReelsItem[] getItems() {
		return items;
	}

	public void setItems(ReelsItem[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Reels [items=" + Arrays.toString(items) + "]";
	}
	
	

}
