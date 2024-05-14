import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		LocalDateTime d04 =  LocalDateTime.parse("2024-05-19T01:20:26");
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formatação 
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		
		
		System.out.println(d01);
		System.out.println(d02);
		System.out.println(d03);
		System.out.println(d04);
		System.out.println(d08);

	}

}
