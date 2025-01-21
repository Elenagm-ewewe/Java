package Rel3;

import java.util.Scanner;
public class Ejercicio07Rel3 {
public static void main(String[]args) {
   Scanner entrada = new Scanner(System.in);

System.out.println("Introduce el primer numero");
int numero1 = entrada.nextInt();

System.out.println("Introduce el segundo numero");
int numero2 = entrada.nextInt();
//----------------------------------------------------------

if (numero1<=0|| numero2<=0) {
	System.out.println("Introduce un numero entero MAYOR que 0");
	
	System.out.println("Introduce el primer numero");
	numero1 = entrada.nextInt();

	System.out.println("Introduce el segundo numero");
	numero2 = entrada.nextInt();
}

//-----------------------------------------------------------

int resto;
int a = numero1;
int b = numero2;
int guarda;

do {
   resto = a%b;
   a=b;
   guarda=b;
   b=resto;
}while (resto !=0);

//-------------------------------------------------------------

System.out.println("El mcd de "+ numero1 + " y " + numero2 + " es " + guarda);

//-------------------------------------------------------------

entrada.close();
}
}
