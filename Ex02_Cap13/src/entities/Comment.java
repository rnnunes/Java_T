package entities;

public class Comment {

	//atributos
	private String text;

	//construtor
	public Comment() {
		
	}
	
	public Comment(String text) {
		this.text = text;
	}
	
	//encapsulamento
	public String getText() {
		return text;
	}
	
	public void SetText(String text) {
		this.text = text;
	}
	
}

	