package User;

import Post.Content;

public class User {
	private int id;
	private String username;
	private String name;
	private String surname;
	private String phone;
	private String bio;
	private String password;
	private int status;
	private Content[] posts;
	private User[] followers;
	private User[] followings;
	public User() {
		super();
	}
	public User(int id, String username, String name, String surname, String phone, String bio, String password,
			int status, Content[] posts, User[] followers, User[] followings) {
		super();
		this.id = id;
		this.username = username;
		this.name = name;
		this.surname = surname;
		this.phone = phone;
		this.bio = bio;
		this.password = password;
		this.status = status;
		this.posts = posts;
		this.followers = followers;
		this.followings = followings;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Content[] getPosts() {
		return posts;
	}
	public void setPosts(Content[] posts) {
		this.posts = posts;
	}
	public User[] getFollowers() {
		return followers;
	}
	public void setFollowers(User[] followers) {
		this.followers = followers;
	}
	public User[] getFollowings() {
		return followings;
	}
	public void setFollowings(User[] followings) {
		this.followings = followings;
	}
	
	

}
