package ui;


import java.util.LinkedList;
import java.util.Scanner;

public class PrincipalEj4 {

	public static void main(String[] args) {
		
		int numInicial;
		LinkedList<Integer> numeros= new LinkedList<>();
		int tamLista=5;
		int num;
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el numero de comparacion");
		numInicial=Integer.parseInt(lector.nextLine());
		
		System.out.println("Ingrese los "+ tamLista +" numeros para la comparacion");
		System.out.println("Ingrese el primer numero");
		num=Integer.parseInt(lector.nextLine());
		if (num>numInicial){
			numeros.add(num);	
		}
		for (int i = 1; i < tamLista; i++) {
			System.out.println("Ingrese el siguiente ("+ i+"/"+ tamLista+")");
			num= Integer.parseInt(lector.nextLine());
			if (num>numInicial){
				numeros.add(num);	
			}
		}
		
		System.out.println("Los mayores al numero de comparacion son: "+ numeros);
		lector.close();
	}

}
