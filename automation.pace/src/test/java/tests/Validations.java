package tests;

public class Validations {
	
	
	public static void Datevalidate(String AT) {
		
		String h=AT;
		String[] h1=h.split(":");

		int Date=Integer.parseInt(h1[0]);
		System.out.println(Date);
	}

}
