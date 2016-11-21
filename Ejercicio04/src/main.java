/*Leer una cadena de hasta 80 caracteres y pasarla en función de una variable de opción a mayúsculas ó a minúsculas e imprimir la cadena resultante*/
import java.util.*;
public class main {

	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	int opcion;
	String cadena="", cMayus, cMinus;
	System.out.println("Dame una cadena. max 80 caracteres");
	cadena=teclado.nextLine();
	
	while(cadena.length()>80){
		System.out.println("Dame una cadena. max 80 caracteres");
		cadena=teclado.nextLine();
		
	}
	System.out.println("Elige una opcion: [1] Pasar la frase a mayus, [2] a minus. ");
	opcion=teclado.nextInt();
	while(opcion<1 || opcion>2){
		System.out.println("Elige una opcion: [1] Pasar la frase a mayus, [2] a minus. ");
		opcion=teclado.nextInt();
		
	}
	if(opcion==1){
		cMayus=cadena.toUpperCase();
		System.out.println(cMayus);
	}
	if(opcion==2){
		cMinus=cadena.toLowerCase();
		System.out.println(cMinus);
	
		
	}
		

	}

}
