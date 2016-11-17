/*Dada una frase de no más de 80 caracteres hacer un programa que busque cuántas mayúsculas y minúsculas tiene y lo imprima*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		String cadena="", nuevo="";
		int contadormayus=0,contadorminus=0;
		System.out.println("Introduce una frase. Max 80 caracteres.");
		cadena=teclado.nextLine();
		
		while(cadena.length()>80 || cadena.length()<0){
			System.out.println("Esa cadena no esta dentro de mis especificaciones, introducela de nuevo");
			cadena=teclado.nextLine();
		}
		for(int x=0;x<cadena.length();x++){
			 if(cadena.charAt(x)<=90 && cadena.charAt(x)>=65) {
				 contadormayus++;  
			 }
			 if(cadena.charAt(x)<=122 && cadena.charAt(x)>=97) {
				 contadorminus++;  
			 }
		}
		System.out.println("Tu cadena cuenta con "+ contadormayus+ " mayusculas "+ " y con "+ contadorminus + " minusculas");
	}

}
