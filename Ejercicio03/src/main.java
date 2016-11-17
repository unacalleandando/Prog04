/*Programa que lea una frase y una palabra y que nos diga la posición de dicha palabra en la frase 
 * y si no la encuentra devuelva un cero.*/ 
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String frase="", palabra="";

		System.out.println("Dame una frase, luego una palabra y buscaremos dicha palabra en la frase.");
		frase = teclado.nextLine();
		System.out.println("Introduce la palabra");
		palabra=teclado.nextLine();
		
		if(frase.indexOf(palabra)>=0){
			System.out.println("La posicion de la palabra: "+frase.indexOf(palabra));
		}
		if(frase.indexOf(palabra)==-1){
			System.out.println("La palabra no existe: 0");
		}
	}

}
