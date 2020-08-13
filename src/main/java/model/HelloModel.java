package model;

public class HelloModel {
	private final long id;
	private final String content;
	
	
	public HelloModel(long id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	
	public long getId() {
		return id;
	}
	public String getContent() {
		return content;
	}

	
}
