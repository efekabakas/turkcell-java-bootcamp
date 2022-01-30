package Post;

import java.util.Arrays;

import User.User;

public class Post extends Content {
	private String id; 
	private String desc;
	private Comment[] comments;
	private User[] likes;
	public Post() {
		super();
	}
	public Post(String id, String desc, Comment[] comments, User[] likes) {
		super();
		this.id = id;
		this.desc = desc;
		this.comments = comments;
		this.likes = likes;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Comment[] getComments() {
		return comments;
	}
	public void setComments(Comment[] comments) {
		this.comments = comments;
	}
	public User[] getLikes() {
		return likes;
	}
	public void setLikes(User[] likes) {
		this.likes = likes;
	}
	@Override
	public String toString() {
		return "Post [id=" + id + ", desc=" + desc + ", comments=" + Arrays.toString(comments) + ", likes="
				+ Arrays.toString(likes) + "]";
	}
	
	
	
}
