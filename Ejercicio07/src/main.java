/*7.	Leer una frase por teclado y escribir a continuación cuantas mayúsculas, minúsculas y números contiene*/
import java.util.*;
public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		final String numeros,mayus,minus;
		String cadena,caracter,numero,mayu,minu;
		int contnum=0,contmayus=0,contminus=0;
			numeros="1234567890";
			mayus="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			minus="abcdefghijklmnñopqrstuvwxyz";
			
			
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
			for(int z=0;z<mayus.length();z++){
				mayu=mayus.substring(z,z+1);
				if(caracter.equals(mayu)){
					contmayus++;
				}
			}
			for(int t=0;t<minus.length();t++){
				minu=minus.substring(t,t+1);
				if(caracter.equals(minu)){
					contminus++;
				}
			}
		}
		System.out.println("Numero de numeros: "+contnum);
		System.out.println("Numero de mayusculas: "+contmayus);
		System.out.println("Numero de minusculas: "+contminus);
	}

}
