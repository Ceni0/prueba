package array5_nombrepersona;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		sc.useLocale(Locale.ENGLISH);
		
		String nombres []=new String [5];
		for (int i=0;i<nombres.length;i++) {
			nombres[i]=sc.nextLine();
		}
		burbuja(nombres,5);
		//Este for es para asegurarnos que ordena bien los nombres pero se podría quitar.
		for (int i=0;i<nombres.length;i++) {
			System.out.println(nombres[i]);
			System.out.println("esto es una prueba de github");
		}
		System.out.println("Anota un nombre para ver si esta en la  lista:");
		String otro=sc.nextLine();
		boolean encontrado=false;
		for (int i=0;i<nombres.length;i++) {
			if(nombres[i].equalsIgnoreCase(otro) ){
				System.out.println("Este nombre está en la lista.");
				encontrado=true;
				break;
			}
		}
		if (encontrado==false)
			System.out.println("Este nombre no está en la lista.");
	}
	public static void burbuja(String v[], int TAM)
	{
	int j,k;
	String aux;
	for(j=1;j<TAM;j++) // Doy tantas vueltas como elementos tenga mi array menos 1
	for (k=0; k<TAM-j;k++) // En cada vuelta llevo el elemento mayor al	final del array.
		if (v[k].compareToIgnoreCase(v[k+1]) >0)// Si un elemento es mayor que el siguiente, los intercambio
		{
			aux=v[k];
			v[k]=v[k+1];
			v[k+1]=aux;
		}
	}
}