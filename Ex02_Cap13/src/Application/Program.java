package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("Tenha uma boa Viagem!");
		Comment c2 = new Comment("Wow que legal!");

		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), 
									"Viajando para Nova Zelandia",
									"Eu estou indo visitar um Pais Maravilhoso!", 12);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
