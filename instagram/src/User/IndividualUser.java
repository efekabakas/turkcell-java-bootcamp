package User;

import Post.Content;

public class IndividualUser  extends User{
	private Content[] taggedContents;

	public IndividualUser() {
		super();
	}

	public IndividualUser(Content[] taggedContents) {
		super();
		this.taggedContents = taggedContents;
	}

	public Content[] getTaggedContents() {
		return taggedContents;
	}

	public void setTaggedContents(Content[] taggedContents) {
		this.taggedContents = taggedContents;
	}
	
	
}
