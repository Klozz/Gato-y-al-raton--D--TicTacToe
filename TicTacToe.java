/*Juego de 3 en raya :D
Autor: Klozz Jesus
Fecha: 29 marzo 2014
v1= first test

*/


import java.util.Random;
import java.util.Scanner;

public class TicTacToe{

	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args){
		Random rand = new Random();
		char[][] tictactoe = {{' ', ' ', ' '},{' ',' ', ' '},{' ',' ', ' '}};
		char ganador= ' ';
		boolean juega_cpu = rand.nextBoolean();
	int a,b,turnos;
		for (turnos=0;turnos<9 && ganador!='O' && ganador!='X'; turnos++) {
	if(juega_cpu){
		do{
		a=rand.nextInt(3);
		b=rand.nextInt(3);
	     }while(tictactoe[a][b] != ' ');
		tictactoe[a][b] = 'O';
	     }else{
		imprimirCuadricula(tictactoe);
	     do{
		a = leerNumero("rengl\242n");
		b = leerNumero("columna");
			if(tictactoe[a][b] != ' ');
				System.out.println("Lacasilla seleccionada ya est\240 ocupada.\n");
	}	while(tictactoe[a][b] != ' ');
		tictactoe[a][b] = 'X';
    }
         for(a=0;ganador==' ' && a<3; a++)
		if (tictactoe[a][0] != ' ' && tictactoe[a][0] == tictactoe[a][1] && tictactoe[a][1] == tictactoe[a][2])
	ganador = tictactoe[a][0];

         for(a=0;ganador==' ' && a<3; a++)
		if (tictactoe[0][a] != ' ' && tictactoe[0][a] == tictactoe[1][a] && tictactoe[1][a] == tictactoe[2][a])
	ganador = tictactoe[0][a];

	if(ganador == ' ' && tictactoe[0][0] != ' ' && tictactoe[0][0] ==tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][2])
	if(ganador == ' ' && tictactoe[0][2] != ' ' && tictactoe[0][2] ==tictactoe[1][1] && tictactoe[1][1] == tictactoe[2][0])

ganador = tictactoe[0][2];
juega_cpu =! juega_cpu;
}

imprimirCuadricula(tictactoe);
switch (ganador){
case 'O' : System.out.println("La CPU ha ganado.");
case 'X' : System.out.println("El usuario ha ganado.");
case ' ' : System.out.println("Empate.");
}
System.out.println();
}

//comenzamos metodo de cuadricula

      public static void imprimirCuadricula(char[] [] tictactoe){
int i, j;
System.out.println("\n\n\n");
System.out.println("       \311\315\315\315\313\315\315\313\\315\315\315\272");
System.out.println("       \272 1  \272 2 \272 3\272");
System.out.println("       \310\315\315\315\312\315\315\315\312\315\315\315\274");
System.out.println();
System.out.println("\311\315\273  \311\315\315\315\313\315\315\315\313\315\315\315\273");
		for (i=0;i<tictactoe.length; i++){
			if (i !=0)
		System.out.println("\314\315\271  \314\315\315\315\316\315\315\315\316\315\315\315\271");
			System.out.println("\272" + (i+1) + "\272  \272");
		for (j=0; j<tictactoe[i].length; j++)
			System.out.print(" " + tictactoe[i][j] + " \272");		
			System.out.println();
}
	System.out.println("\310\315\274  \310\315\315\315\312\315\315\315\312\315\315\315\274\n");
	}
	
static int leerNumero(String variable) {
int numero;
	do{
		System.out.print("Seleccione el n\243mero de " + variable + ": ");
		numero = in.nextInt();
	if (numero != 1 && numero != 2 && numero != 3)
		System.out.println("La casilla seleccionada esta fuera de rango.\n");

	}while (numero !=1 && numero != 2 && numero != 3);
		return numero - 1;
   }
}
