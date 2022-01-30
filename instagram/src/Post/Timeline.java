package Post;

import java.util.Arrays;

public class Timeline {
	private Content[] items;

	public Timeline() {
		super();
	}

	public Timeline(Content[] items) {
		super();
		this.items = items;
	}

	public Content[] getItems() {
		return items;
	}

	public void setItems(Content[] items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Timeline [items=" + Arrays.toString(items) + "]";
	}
	
}
