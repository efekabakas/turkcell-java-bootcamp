package User;

import java.util.Arrays;

import Post.Content;

public class DirectMessage {
	private User sender;
	private User receiver;
	private String desc;
	private Content[] content;
	
	public DirectMessage() {
		super();
	}

	public DirectMessage(User sender, User receiver, String desc, Content[] content) {
		super();
		this.sender = sender;
		this.receiver = receiver;
		this.desc = desc;
		this.content = content;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getReceiver() {
		return receiver;
	}

	public void setReceiver(User receiver) {
		this.receiver = receiver;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Content[] getContent() {
		return content;
	}

	public void setContent(Content[] content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "DirectMessage [sender=" + sender.getUsername() + ", receiver=" + receiver.getUsername() + ", desc=" + desc + ", content="
				+ Arrays.toString(content) + "]";
	}


}
