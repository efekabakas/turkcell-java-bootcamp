package Post;

import java.util.Arrays;

import User.User;

public class Content {
	private String date;
	private String[] content;
	private User owner;
	public Content() {
		super();
	}
	public Content(String date, String[] content, User owner) {
		super();
		this.date = date;
		this.content = content;
		this.owner = owner;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String[] getContent() {
		return content;
	}
	public void setContent(String[] content) {
		this.content = content;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Content [date=" + date + ", content=" + Arrays.toString(content) + ", owner=" + owner + "]";
	}
	
	
}
