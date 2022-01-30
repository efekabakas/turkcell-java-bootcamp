package Post;

import java.util.Arrays;

public class Store {
	private StoreItem[] items;

	public Store() {
		super();
	}

	public Store(StoreItem[] items) {
		super();
		this.items = items;
	}

	public StoreItem[] getItems() {
		return items;
	}

	public void setItems(StoreItem[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Store [items=" + Arrays.toString(items) + "]";
	}
	
	
}
