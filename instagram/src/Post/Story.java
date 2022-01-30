package Post;

import User.User;

public class Story extends Content {
	private int remaining_time;
	private User[] viewers;
	
	public Story() {
		super();
	}

	public Story(int remaining_time, User[] viewers) {
		super();
		this.remaining_time = remaining_time;
		this.viewers = viewers;
	}

	public int getRemaining_time() {
		return remaining_time;
	}

	public void setRemaining_time(int remaining_time) {
		this.remaining_time = remaining_time;
	}

	public User[] getViewers() {
		return viewers;
	}

	public void setViewers(User[] viewers) {
		this.viewers = viewers;
	}
	
	
}
