import java.util.*;
/*Leer una frase por teclado (máximo 80 car) y construir otras dos cadenas de forma que una contenga los caracteres en posición par 
 * y la otra los caracteres en posición impar.*/
public class main {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int opcion;
		String cadena="",cadenapar="",cadenaimp="";
		System.out.println("Dame una cadena. max 80 caracteres");
		cadena=teclado.nextLine();
		
		while(cadena.length()>80){
		System.out.println("Dame una cadena. max 80 caracteres");
			cadena=teclado.nextLine();
			
		}
		
		for(int x=0;x<cadena.length();x+=2){
			
			cadenaimp=cadenapar+cadena.charAt(x);
		}
		for(int y=1;y<cadena.length();y+=2){
		
			cadenapar=cadenaimp+cadena.charAt(y);
		}
		System.out.println("Los caracteres en posicion impar son: "+ cadenaimp);
		System.out.println("Los caracteres en posicion par son: "+ cadenapar);
		
		
		
		
		
		
		
		
	}

}
