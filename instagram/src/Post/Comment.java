package Post;

import User.User;

public class Comment {
	private int id;
	private User commentOwner;
	private Content post;
	
	public Comment() {
		super();
	}

	public Comment(int id, User commentOwner, Content post) {
		super();
		this.id = id;
		this.commentOwner = commentOwner;
		this.post = post;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getCommentOwner() {
		return commentOwner;
	}

	public void setCommentOwner(User commentOwner) {
		this.commentOwner = commentOwner;
	}

	public Content getPost() {
		return post;
	}

	public void setPost(Content post) {
		this.post = post;
	}

	@Override
	public String toString() {
		return "Comment [id=" + id + ", commentOwner=" + commentOwner + ", post=" + post + "]";
	}
	
	

}
