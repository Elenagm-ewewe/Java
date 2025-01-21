package Rel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio8 {
       public static void main(String[]args) {
       Scanner scanner = new Scanner(System.in);
       ArrayList<Integer> numeros = new ArrayList<>();
	
int numero ;
boolean continuar = true;
int veces = 1;
String SN;

do {
   veces=veces+1;
   System.out.println("Introduce un número");
   numero = scanner.nextInt();

   System.out.println("¿Desea continuar? (S/N)");
		SN = scanner.next().toUpperCase();
   
   
if (SN!="S" && SN!="N") {	

	  System.out.println("No vale, pon otro");
		SN = scanner.next().toUpperCase();

}else {
	switch (SN) {
	  case "S": 
		  continuar = true;
	  break;
	  
	  case "N": 
		  continuar = false;
	  break;
	  }

  }
  
numeros.add(numero);
   

} while (continuar == true) ;
	

//escribir el vector


for (int num : numeros) {
	System.out.print(num+ ", ");
}


scanner.close();
}
}
