/*Leer una frase por teclado (máximo 80) y a continuación escribir cuantas vocales, consonantes y caracteres numéricos posee.*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String numeros,vocales,consonantes, cadena,n1,n2,caracter,numero,vocal,consonante;
		int contnum=0,contvoc=0,contcons=0;
			numeros="1234567890";
			vocales="aeiouAEIOU";
			consonantes="qwrtypsdfghjklñmnbvcxzQWRTYPSDFGHJKLÑZXCVBNM";
			
		System.out.println("Dame una frase, (max 80 caracteres) y contaremos vocales, consonantes y numeros");
		cadena=teclado.nextLine();
		
		while(cadena.length()>80){
			System.out.println("Dame una frase, (max 80 caracteres) y contaremos vocales, consonantes y numeros");
			cadena=teclado.nextLine();
		}		
		for(int x=0;x<cadena.length();x++){
			caracter=cadena.substring(x,x+1);
			for(int y=0;y<numeros.length();y++){
				numero=numeros.substring(y,y+1);
				if(caracter.equals(numero)){
					contnum++;
				}
			}
			for(int z=0;z<vocales.length();z++){
				vocal=vocales.substring(z,z+1);
				if(caracter.equals(vocal)){
					contvoc++;
				}
			}
			for(int t=0;t<consonantes.length();t++){
				consonante=consonantes.substring(t,t+1);
				if(caracter.equals(consonante)){
					contcons++;
				}
			}
		}
		System.out.println("Numero de numeros: "+contnum);
		System.out.println("Numero de vocales: "+contvoc);
		System.out.println("Numero de consonantes: "+contcons);
			
		
		
		
	}

}
