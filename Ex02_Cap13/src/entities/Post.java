package entities;

import java.util.Date;

public class Post {

	// atributos
	private Date moment;
	private String title;
	private String content;
	private Integer likes;

	// construtor
	public Post() {

	}

	public Post(Date moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	// encapsulamento
	public Date getMoment() {
		return moment;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public Integer getLikes() {
		return likes;
	}
	
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public void name() {
		
	}
	
	
	
}