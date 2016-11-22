/*Escribir un programa que lea una frase (máximo 60 caracteres) y diga cuántas letras
distintas tiene y la frecuencia de las mismas, para homogeneizar el conjunto de letras
debemos trabajar solo con mayúsculas.*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String cadena,encontradas="";
		char letra;
		int coincidencias=0;
		System.out.println("Dame una cadena (max. 60 caracteres) y diremos cuantas letras tiene y sus repeticiones");
		cadena=teclado.nextLine();
		while(cadena.length()>60){
			System.out.println("Dame una cadena (max. 60 caracteres) y diremos cuantas letras tiene y sus repeticiones");
			cadena=teclado.nextLine();
		}
		cadena=cadena.toUpperCase();
		for(int x=0;x<cadena.length();x++){
			letra=cadena.charAt(x);
			if(encontradas.indexOf(letra)>=0){
				
			}else{
				encontradas=encontradas+letra;
				coincidencias=0;
				for(int y=0;y<cadena.length();y++)
					if(cadena.charAt(y)==letra)
						coincidencias++;

				System.out.println("La letra: "+letra+" tiene este numero de coincidencias "+ coincidencias);
			}
			
		}	
		
		System.out.println("Se han encontrado en tu cadena estas letras diferentes: "+encontradas);
		
		
		
		
		
	}

}
