/*Leer una frase filtrándola a que todos sus caracteres sean mayúsculas, una vez filtrada y dado un numero entre 1 y
 *  10 haga un cifrado de la frase (denominado cifrado CESAR) del modo siguiente ,
 *   si el numero por ejemplo es 3, transforme la frase de manera que cada carácter se transforme en 3 códigos ASCII mas es decir :
	Frase inicial PROGRAMACION resultado SURJUDPDFLRQ.
	Desarrollar los programas de codificar y descodificar mediante dos funciones.*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena;
		char caracter;
		int n;
		System.out.println("Dame una frase");
		cadena=teclado.nextLine();
		cadena=cadena.toUpperCase();
		System.out.println("Dame un numero para codificarla");
		n=teclado.nextInt();
		
		for(int x=0;x<cadena.length();x++){
			caracter=cadena.charAt(x);
			caracter+=n;
		System.out.print(caracter);
			
		}
		

	}

}
