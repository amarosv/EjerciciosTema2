package condicionales;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio02 {
	
	/* PRUEBA 1
	 * VALOR DE ENTRADA: 77863792
	 * RESULTADO ESPERADO: Y
	 * RESULTADO OBTENIDO: Y
	 * 
	 * PRUEBA 2
	 * VALOR DE ENTRADA: 29627264K
	 * RESULTADO ESPERADO: DATO ERRONEO
	 * VALOR ESPERADO: DATO ERRONEO
	 * 
	 * PRUEBA 3
	 * VALOR DE ENTRADA: 23000000
	 * RESULTADO ESPERADO: T
	 * RESULTADO OBTENIDO: T
	 * 
	 * PRUEBA 4
	 * VALOR DE ENTRADA: 22999999
	 * RESULTADO ESPERADO: E
	 * RESULTADO OBTENIDO: E*/

	public static void main(String[] args) {
		// Variable donde se almacenará el número del DNI
		int numero;
		int modulo;
		String letra;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Hacemos un try/catch para asegurar que no introduce la letra
		try {
			// Le pedimos al usuario el número del DNI sin la letra y lo guardamos
			System.out.println("Introduzca el número de su DNI sin la letra");
			numero = sc.nextInt();
			
			// Calculamos el modulo
			modulo = numero%23;
			
			// Asignamos la letra según el modulo
			letra = switch(modulo) {
				case 0 -> "T";
				case 1 -> "R";
				case 2 -> "W";
				case 3 -> "A";
				case 4 -> "G";
				case 5 -> "M";
				case 6 -> "Y";
				case 7 -> "F";
				case 8 -> "P";
				case 9 -> "D";
				case 10 -> "X";
				case 11 -> "B";
				case 12 -> "N";
				case 13 -> "J";
				case 14 -> "Z";
				case 15 -> "S";
				case 16 -> "Q";
				case 17 -> "V";
				case 18 -> "H";
				case 19 -> "L";
				case 20 -> "C";
				case 21 -> "K";
				case 22 -> "E";
				default -> "";
			};
			
			// Imprimimos el mensaje por pantalla
			System.out.println("La letra de Su DNI es: "+letra);
			
			
		} catch(InputMismatchException e) {
			System.out.println("Dato erróneo");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
