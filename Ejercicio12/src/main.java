//Ejercicio 1 hoja2 
/*Escribir un programa que pida por teclado una cadena y una letra, de manera que
ponga en mayúsculas cada ocurrencia de la letra que haya en la cadena y lo
muestre por pantalla*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String cadena="",letra="",caracter="",c1="",c2="",cadenaf="";
		System.out.println("Dame una cadena, luego una letra y pondremos esa letra en mayus, en la frase.");
		cadena=teclado.nextLine();
		System.out.println("Dame una letra que aparezca en la cadena");
		letra=teclado.nextLine();
		
		while(cadena.indexOf(letra)==-1){
			System.out.println("Dame una letra que aparezca en la cadena");
			letra=teclado.nextLine();
		}
		for(int x=0; x<cadena.length();x++){
			caracter=cadena.substring(x,x+1);
			if(letra.equals(caracter)){
				caracter=caracter.toUpperCase();
				c1=cadena.substring(0,x);
				c2=cadena.substring(x+1,cadena.length());
				cadenaf=c1+caracter+c2;
			}
		}
		System.out.println(cadenaf);
	}

}
