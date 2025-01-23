package Rel5;


import java.util.Random;
public class Ejercicio04Arrays {
public static void main(String[]args) {
	
	Random aleatorio = new Random();
	
	int numeros = 30;
	
	int[]vector= new int [numeros];
	int media=0;
	
	for (int i = 0 ; i<numeros ; i++) {
		vector[i]=aleatorio.nextInt(100);
		media=media+ vector[i];
		System.out.print(vector[i] + " ");
	}
	
	System.out.println();
//______________________________________________
	
	media = media/numeros;
	
//______________________________________________
	
	int []numerosfinales= new int[numeros];
	
	for(int i =0; i<numeros ;i++) {
		numerosfinales[i]= vector[i]%10;
		System.out.print(numerosfinales[i] + " ");
	}
	System.out.println();
//______________________________________________

int[]repeticiones= new int [10];

     for(int i= 0 ; i<=9 ; i++) {
    	 
    	 for(int f=0; f<numeros;f++) {
    		 
    		 if (numerosfinales[f] == i) {
    			 repeticiones[i]++;
    		 }
    	 }
     }
     
     for(int i= 0 ; i<=9 ; i++) {
    	 System.out.print(repeticiones[i] + " ");
     }
     System.out.println();
//______________________________________________
     
     int masserepite = 0;
     int menosserepite = 9;
     int indice= 0;
     int indice2 =0;
     
     for(int i=0; i<=9;i++) {
    	 if (repeticiones[i]< menosserepite) {
    		 menosserepite = repeticiones[i];
    		 indice = i;
    	 }
    	 
    	 if(repeticiones[i]>masserepite) {
    		 masserepite =repeticiones[i];
    		 indice2= i;
    		 
     }
     
     }
     
//______________________________________________
	
System.out.println("La media de los numeros generados es " + media);
System.out.println("El numero que menos se repite es " + indice);
System.out.println("El numero que más se repite es " + indice2);



}
}
