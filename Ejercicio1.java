/*
 * @author = Sergio Ortega
 * @version = 1.0 
 */
 
 

import java.util.Scanner;
//Importamos el escáner
public class Ejercicio1 {
	
	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in); 
		//Creamos un escáner
		
		System.out.println ("Introduce un número");
		int numero1 = sc.nextInt();
		System.out.println ("Introduce otro número");
		int numero2 = sc.nextInt(); 
		//Introducimos los dos números
		
		sc.close();
		//Cerramos el escáner
		
		if (numero1 < numero2) {
			System.out.println ("------");
			for (int i = numero2; i >= numero1; i--)
				System.out.println (i);
				//Si numero1 es menor que numero2, se imprimira de mayor a menor
			calcularValorMedio (numero1, numero2);
			//System.out.printf ("El valor medio de %d más %d es %f%n", numero1, numero2, media.calcularValorMedio);

		} else {
			if (numero1 > numero2) {
				System.out.println ("------");
			for (int i = numero2; i <= numero1; i++)
				System.out.println (i);
				//Si numero1 es mayor que numero2, se imprimirá de menor a mayor
				calcularValorMedio (numero2, numero1);
				
			}else {
				System.out.println ("------");
				System.out.println ("Son el mismo número");
				//Si son el mismo número, el programa te notificará esto
				}
		}
	}
	public static double calcularValorMedio(int valorMenor, int valorMayor) {
		double media = (valorMenor + valorMayor)/2;
		return media;
	}
}


