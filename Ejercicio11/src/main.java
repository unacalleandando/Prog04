/*Hacer un programa para que pida una palabra de no más de 20 caracteres y 
 * efectúe todas las rotaciones posibles de dicha palabra de forma que el último carácter pase al primero 
 * y los demás corran un espacio, es decir si la palabra fuera “HOLA” el resultado debe ser :
 * 
 * HOLA
AHOL
LAHO
OLAH
Observar que una palabra de n caracteres tiene n rotaciones.
 * */
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String palabra,letra="",nuevo="",salida="";
		System.out.println("Dame una palabra. max 20 caracteres.");
		palabra=teclado.nextLine();
		
		while(palabra.length()>20){
			System.out.println("Dame una palabra. max 20 caracteres.");
			palabra=teclado.nextLine();
		}
		for(int x=0;x<=palabra.length();x++){
			letra=palabra.substring(palabra.length()-1,palabra.length());
			nuevo=palabra.substring(0,palabra.length()-1);
			salida=letra+nuevo;
			palabra=salida;
			System.out.println(salida);
		}

	}

}
