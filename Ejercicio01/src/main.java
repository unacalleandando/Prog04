/*Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es: “ciervo”, el programa debe imprimir*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena="", nuevo="";
		System.out.println("Introduce una frase. Max 80 caracteres.");
		cadena=teclado.nextLine();
		
		while(cadena.length()>80 || cadena.length()<0){
			System.out.println("Esa cadena no esta dentro de mis especificaciones, introducela de nuevo");
			cadena=teclado.nextLine();
		}
		for(int x=0;x<cadena.length();x++){
			for(int y=0; y<=x;y++){
				
				System.out.print(cadena.charAt(y));
				
			}
			System.out.println();
		}
		
	}

}
