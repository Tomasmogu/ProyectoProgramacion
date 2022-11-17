package com.formacion;
import javax.swing.JOptionPane;

public class FormacionDeJugadores {
	
static String[][] jugadoresColombia = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
		{"Mosquera","Lopez","Ramirez","Gomez","Velasquez","Luna","Rivera","Rodriguez","Montoya","Gutierrez","Santamaria","Calderon","Valencia","Garcia","Carvajal"},
        {"Defensa","Arquero","Defensa","Delantero","Medio","Medio","Medio","Delantero","Delantero","Arquero","Defensa","Delantero","Defensa","Medio","Medio","Defensa"},
        {"Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","En Banca","En Banca","En Banca","En Banca"}};

static String[][] jugadoresAlemania = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
		{"Müller","Schmidt","Schneider","Fischer","Weber","Meyer","Wagner","Becker","Schulz","Hoffmann","Schäfer","Koch","Bauer","Richter","Schröder"},
		{"Defensa","Defensa","Arquero","Delantero","Delantero","Medio","Medio","Medio","Delantero","Defensa","Defensa","Defensa","Arquero","Delantero","Delantero"},
		{"Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","En Banca","En Banca","En Banca","En Banca"}};

static String[][] jugadoresBrazil = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
		{"Da Silva","Dos Santos","Pereira","Alves","Ferreira","Rodrigues","Silva","De Oliveira","De Souza","Gomes","Santos","Oliveira","Ribeiro","De Jesús","Soares"},
		{"Defensa","Defensa","Arquero","Delantero","Delantero","Medio","Medio","Medio","Delantero","Defensa","Defensa","Arquero","Defensa","Defensa","Delantero"},
		{"Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","En banca","En banca","En banca","En banca"}};

static String[][] jugadoresArgentina = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
		{"González","Rodríguez","Gómez","Fernández","López","Martínez","Diaz","Pérez","Sánchez","Romero","García","Sosa","Benítez","Ramírez","Torres"},
		{"Defensa","Defensa","Arquero","Delantero","Delantero","Medio","Medio","Medio","Delantero","Defensa","Defensa","Medio","Medio","Defensa","Delantero","Delantero"},
		{"Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","En Banca","En Banca","En Banca","En Banca","En Banca"}};

static String[][] jugadoresUruguay = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
		{"Rodriguez","Martinez","Suarez","Silva","Hernandez","Acosta","Machado","Pereyra","De leon","Delgado","Medina","Marquez","Blanco","Vidal","Ortiz"},
		{"Defensa","Defensa","Arquero","Delantero","Delantero","Medio","Medio","Medio","Delantero","Defensa","Defensa","Defensa","Medio","Delantero","Arquero","Arquero"},
		{"Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","En Banca","En Banca","En Banca","En Banca","En Banca"}};

static String[][] jugadoresBolivia = {{"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15"},
		{"Mamani","Flores","Vargas","Gutiérrez","Quispe","Rodriguez","Condori","Rojas","Fernández","Cruz","Mendoza","Sánchez","Chávez","Ramos","Apaza"},
		{"Defensa","Defensa","Arquero","Delantero","Delantero","Medio","Medio","Medio","Delantero","Defensa","Defensa","Delantero","Delantero","Defensa","Defensa"},
		{"Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","Jugando","En Banca","En Banca","En Banca","En Banca"}};


static int numerolineas=60;

static String respuesta;

static String cambio;

static int capitanColombia;

static int capitanAlemania;

static int capitanBrazil;

static int capitanArgentina;

static int capitanUruguay;

static int capitanBolivia;

public static void main(String[] args) {
	//empieza el do while
	do {
		
	respuesta=JOptionPane.showInputDialog("Bienvenido que opcion desea realizar:\n 1_Formacion de Equipos.\n 2_Cambio de Jugadores.\n 3_Elegir un Capitan.\n 4_Jugar.");
	
	switch (respuesta) {
	case "1":
		
		System.out.println("Esta es la formacion del equipo de Colombia: ");
		imprimir(jugadoresColombia);
		imprimirLineas();
		imprimirLineas();
		
		System.out.println("Esta es la formacion del equipo de Alemania: ");
		imprimir1 (jugadoresAlemania);
		imprimirLineas();
		imprimirLineas();
		
		System.out.println("Este es la formacion del equipo de Brazil: ");
		imprimir2(jugadoresBrazil);
		imprimirLineas();
		imprimirLineas();
		
		System.out.println("Este es la formacion del equipo de Argentina: ");
		imprimir3(jugadoresArgentina);
		imprimirLineas();
		imprimirLineas();
		
		System.out.println("Este es la formacion del equipo de Uruguay: ");
		imprimir4(jugadoresUruguay);
		imprimirLineas();
		imprimirLineas();
		
		System.out.println("Este es la formacion del equipo de Bolivia: ");
		imprimir5(jugadoresBolivia);
		imprimirLineas();
		imprimirLineas();
		break;
		
	case "2":
		respuesta=JOptionPane.showInputDialog("Ingrese el equipo que quiere hacer el cambio: C_Colombia. A_Alemania. B_Brazil. Ar_Argentina. U_Uruguay. Bo_Bolivia.");
		switch (respuesta) {
		case "C":
			respuesta=JOptionPane.showInputDialog("Ingrese el # del Jugador que quiere cambiar: ");
			cambiarjugador(jugadoresColombia);
			imprimir(jugadoresColombia);
			imprimirLineas();
			break;
		case "A":
			respuesta=JOptionPane.showInputDialog("Ingrese el # del Jugador que quiere cambiar: ");
			cambiarjugador1(jugadoresAlemania);
			imprimir1(jugadoresAlemania);
			imprimirLineas();
			break;
		case "B":
			respuesta=JOptionPane.showInputDialog("Ingrese el # del Jugador que quiere cambiar: ");
			cambiarjugador2(jugadoresBrazil);
			imprimir2(jugadoresBrazil);
			imprimirLineas();
			break;
		case "Ar":
			respuesta=JOptionPane.showInputDialog("Ingrese el # del Jugador que quiere cambiar: ");
			cambiarjugador3(jugadoresArgentina);
			imprimir3(jugadoresArgentina);
			imprimirLineas();
			break;
		case "U":
			respuesta=JOptionPane.showInputDialog("Ingrese el # del Jugador que quiere cambiar: ");
			cambiarjugador4(jugadoresUruguay);
			imprimir4(jugadoresUruguay);
			imprimirLineas();
			break;
		case "Bo":
			respuesta=JOptionPane.showInputDialog("Ingrese el # del Jugador que quiere cambiar: ");
			cambiarjugador5(jugadoresBolivia);
			imprimir5(jugadoresBolivia);
			imprimirLineas();
			break;
		}
		break;
	case "3":
		respuesta=JOptionPane.showInputDialog("Elije el equipo que quiera trabajar en: C_Colombia. A_Alemania. B_Brazil. Ar_Argentina. U_Uruguay. Bo_Bolivia.");
		switch (respuesta) {
		case "C":
			capitanColombia(jugadoresColombia);
			imprimirLineas();
			break;
		case "A":
			capitanAlemania(jugadoresAlemania);
			imprimirLineas();
			break;
		case "B":
			capitanBrazil(jugadoresBrazil);
			imprimirLineas();
			break;
		case "Ar":
			capitanArgentina(jugadoresArgentina);
			imprimirLineas();
			break;
		case "U":
			capitanUruguay(jugadoresUruguay);
			imprimirLineas();
			break;
		case "Bo":
			capitanBolivia(jugadoresBolivia);
			imprimirLineas();
			break;
		}
	break;
	
}
//termina el do while.		
}while (!respuesta.equals("4"));	
		
}

	
		


public static void imprimirLineas () {
	for(int i=0;i<numerolineas;i++) { 
		System.out.print("-");
	}
	
	System.out.println();

		
		

}
		
		
public static void imprimir (String [][]jugdoresColombia) {
	for(int i=0;i<15;i++) { 

		System.out.print("Jugador "+ jugadoresColombia[0][i]+": ");


		System.out.print(jugadoresColombia[1][i]+" - ");
		System.out.println(jugadoresColombia[2][i]+" ");
		System.out.println(jugadoresColombia[3][i]+" ");

}

		System.out.println();
}

public static void cambiarjugador (String [][]jugadoresColombia) {
	switch (respuesta) {
	case "1": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][0] = cambio;
		break;
	case "2": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][1] = cambio;
		break;
	case "3": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][2] = cambio;
		break;
	case "4": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][3] = cambio;
		break;
	case "5":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][4] = cambio;
		break;
	case "6":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][5] = cambio;
		break;
	case "7":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][6] = cambio;
		break;
	case "8":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][7] = cambio;
		break;
	case"9":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][8] = cambio;
		break;
	case "10":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][9] = cambio;
		break;
	case "11":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresColombia[2][10] = cambio;
		break;
		
}
}
		

public static void imprimir1 (String[][]jugdoresAlemania) {
	for(int i=0;i<15;i++) { 

		System.out.print("Jugador "+ jugadoresAlemania[0][i]+": ");

		System.out.print(jugadoresAlemania[1][i]+" - ");
		System.out.println(jugadoresAlemania[2][i]+" ");
		System.out.println(jugadoresAlemania[3][i]+" ");

		}

			System.out.println();
		}


public static void cambiarjugador1 (String [][]jugadoresAlemania) {
	switch (respuesta) {
	case "1": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][0] = cambio;
		break;
	case "2": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][1] = cambio;
		break;
	case "3": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][2] = cambio;
		break;
	case "4": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][3] = cambio;
		break;
	case "5":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][4] = cambio;
		break;
	case "6":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][5] = cambio;
		break;
	case "7":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][6] = cambio;
		break;
	case "8":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][7] = cambio;
		break;
	case"9":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][8] = cambio;
		break;
	case "10":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][9] = cambio;
		break;
	case "11":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresAlemania[2][10] = cambio;
		break;
		
}
}

			
public static void imprimir2 (String[][]jugadoresBrazil) {
			for(int i=0;i<15;i++) { 

				System.out.print("Jugador "+ jugadoresBrazil[0][i]+": ");



				System.out.print(jugadoresBrazil[1][i]+" - ");
				System.out.println(jugadoresBrazil[2][i]+" ");
				System.out.println(jugadoresBrazil[3][i]+" ");

				}

					System.out.println();
				}


public static void cambiarjugador2 (String [][]jugadoresBrazil) {
	switch (respuesta) {
			case "1": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][0] = cambio;
				break;
			case "2": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][1] = cambio;
				break;
			case "3": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][2] = cambio;
				break;
			case "4": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][3] = cambio;
				break;
			case "5":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][4] = cambio;
				break;
			case "6":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][5] = cambio;
				break;
			case "7":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][6] = cambio;
				break;
			case "8":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][7] = cambio;
				break;
			case"9":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][8] = cambio;
				break;
			case "10":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][9] = cambio;
				break;
			case "11":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBrazil[2][10] = cambio;
				break;
				
}
}

				
public static void imprimir3 (String[][]jugadoresArgentina) {
		for(int i=0;i<15;i++) { 

			System.out.print("Jugador "+ jugadoresArgentina[0][i]+": ");



				System.out.print(jugadoresArgentina[1][i]+" - ");
				System.out.println(jugadoresArgentina[2][i]+" ");
				System.out.println(jugadoresArgentina[3][i]+" ");

				}

				System.out.println();
				}


public static void cambiarjugador3 (String [][]jugadoresArgentina) {
		switch (respuesta) {
		case "1": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresArgentina[2][0] = cambio;
		break;
		case "2": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresArgentina[2][1] = cambio;
		break;
		case "3": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresArgentina[2][2] = cambio;
		break;
		case "4": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresArgentina[2][3] = cambio;
		break;
		case "5":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresArgentina[2][4] = cambio;
		break;
		case "6":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresArgentina[2][5] = cambio;
		break;
					case "7":
						cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
						jugadoresArgentina[2][6] = cambio;
						break;
					case "8":
						cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
						jugadoresArgentina[2][7] = cambio;
						break;
					case"9":
						cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
						jugadoresArgentina[2][8] = cambio;
						break;
					case "10":
						cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
						jugadoresArgentina[2][9] = cambio;
						break;
					case "11":
						cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
						jugadoresArgentina[2][10] = cambio;
						break;
						
		}
		}
						
public static void imprimir4 (String[][]jugadoresUruguay) {
	for(int i=0;i<15;i++) { 

		System.out.print("Jugador "+ jugadoresUruguay[0][i]+":  ");



		System.out.print(jugadoresUruguay[1][i]+" - ");
		System.out.println(jugadoresUruguay[2][i]+" ");
		System.out.println(jugadoresUruguay[3][i]+" ");

}

		System.out.println();
}


public static void cambiarjugador4 (String [][]jugadoresUruguay) {
	switch (respuesta) {
		case "1": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][0] = cambio;
		break;
		case "2": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][1] = cambio;
		break;
		case "3": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][2] = cambio;
		break;
		case "4": 
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][3] = cambio;
		break;
		case "5":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][4] = cambio;
		break;
		case "6":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][5] = cambio;
		break;
		case "7":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][6] = cambio;
		break;
		case "8":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][7] = cambio;
		break;
		case"9":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][8] = cambio;
		break;
		case "10":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][9] = cambio;
		break;
		case "11":
		cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
		jugadoresUruguay[2][10] = cambio;
		break;
								
}
}
								
public static void imprimir5 (String[][]jugadoresBolivia) {
	for(int i=0;i<15;i++) { 

		System.out.print("Jugador "+ jugadoresBolivia[0][i]+": ");



		System.out.print(jugadoresBolivia[1][i]+" - ");
		System.out.println(jugadoresBolivia[2][i]+" ");
		System.out.println(jugadoresBolivia[3][i]+" ");

	}

		System.out.println();
	}


public static void cambiarjugador5 (String [][]jugadoresBolivia) {
		switch (respuesta) {
			case "1": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][0] = cambio;
				break;
			case "2": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][1] = cambio;
				break;
			case "3": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][2] = cambio;
				break;
			case "4": 
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][3] = cambio;
				break;
			case "5":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][4] = cambio;
				break;
			case "6":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][5] = cambio;
				break;
			case "7":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][6] = cambio;
				break;
			case "8":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][7] = cambio;
				break;
			case"9":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][8] = cambio;
				break;
			case "10":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][9] = cambio;
				break;
			case "11":
				cambio=JOptionPane.showInputDialog("Ingrese la posicion que desea cambiar: ");
				jugadoresBolivia[2][10] = cambio;
				break;	
				
		}
}
				
private static void capitanColombia (String [][]jugadoresColombia) {
	imprimir(jugadoresColombia);
	respuesta=JOptionPane.showInputDialog("Escoja el # de jugador que va a nombrar de capitan: ");
	capitanColombia=Integer.parseInt(respuesta);
	JOptionPane.showMessageDialog(null, "El Capitan de Colombia es: "+ jugadoresColombia[1][capitanColombia-1]);
	
}
private static void capitanAlemania (String [][]jugadoresAlemania) {
	imprimir(jugadoresAlemania);
	respuesta=JOptionPane.showInputDialog("Escoja el # de jugador que va a nombrar de capitan: ");
	capitanAlemania=Integer.parseInt(respuesta);
	JOptionPane.showMessageDialog(null, "El Capitan de Alemania es: "+ jugadoresAlemania [1][capitanAlemania-1]);
	
}
private static void capitanBrazil (String [][]jugadoresBrazil) {
	imprimir(jugadoresBrazil);
	respuesta=JOptionPane.showInputDialog("Escoja el # de jugador que va a nombrar de capitan: ");
	capitanBrazil=Integer.parseInt(respuesta);
	JOptionPane.showMessageDialog(null, "El Capitan de Brazil es: "+ jugadoresBrazil [1][capitanBrazil-1]);
}
private static void capitanArgentina (String [][]jugadoresArgentina) {
	imprimir(jugadoresArgentina);
	respuesta=JOptionPane.showInputDialog("Escoja el # de jugador que va a nombrar de capitan: ");
	capitanArgentina=Integer.parseInt(respuesta);
	JOptionPane.showMessageDialog(null, "El Capitan de Argentina es: "+ jugadoresArgentina [1][capitanArgentina-1]);
}
private static void capitanUruguay (String [][]jugadoresUruguay) {
	imprimir(jugadoresUruguay);
	respuesta=JOptionPane.showInputDialog("Escoja el # de jugador que va a nombrar de capitan: ");
	capitanUruguay=Integer.parseInt(respuesta);
	JOptionPane.showMessageDialog(null, "El Capitan de Uruguay es: "+ jugadoresUruguay [1][capitanUruguay-1]);
}
private static void capitanBolivia (String [][]jugadoresBolivia) {
	imprimir(jugadoresBolivia);
	respuesta=JOptionPane.showInputDialog("Escoja el # de jugador que va a nombrar de capitan: ");
	capitanBolivia=Integer.parseInt(respuesta);
	JOptionPane.showMessageDialog(null, "El Capitan de Bolivia es: "+ jugadoresBolivia [1][capitanBolivia-1]);
}
}
