import java.util.Scanner;
public class Ejercicio2 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in); 
		//Creamos un escáner
		
		System.out.println ("Introduce una frase");
		String frase = sc.nextLine();

		System.out.println (frase.toLowerCase());
		System.out.println (frase.toUpperCase());


	}
}

