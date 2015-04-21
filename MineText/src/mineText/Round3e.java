package mineText;
import java.util.Scanner;
public class Round3e {
	public static Scanner sc = new Scanner(System.in);	//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round3e(int puntaje){
		score = puntaje;
	}


	public boolean randomScenario() {
		int scenario = (int)(5*Math.random());
		choices = choosingScenario(scenario);
		correct = checkAnswer(scenario, choices);

		return correct;
	}


	public int choosingScenario(int scenario2){
		switch(scenario2){
		case 0:
			System.out.println("Ya te alimentaste, sigues hambriento pero ya estas mas enfocado");
			System.out.println("Escuchas a un grupo de humanos con pistolas cerca. Tu reaccion es:");
			System.out.println("1) Correr hacia adelante");
			System.out.println("2) Correr hacia la izquierda");
			System.out.println("3) Correr hacia la derecha");
			System.out.println("4) Enfrentarlos y luchar contra ellos");
			while(validation){
				try{
					choices = sc.nextInt();
				}
				catch(Exception e){
					choices = 0;
					sc.nextLine();
					System.out.println("Intenta de nuevo");
				}
				if(choices == 1 || choices == 2 || choices == 3 || choices == 4){
					validation = false;
				}
				else{
					System.out.println("Ingrese un número entre 1 y 4");
				}
			}
			break;
		case 1:
			System.out.println("Ya te alimentaste, sigues hambriento pero ya estas mas enfocado");
			System.out.println("Empiezas a oler sangre humana. Tu siguiente jugada es");
			System.out.println("1) Ir por ella");
			System.out.println("2) Correr hacia adelante");
			System.out.println("3) Correr hacia la izquierda");
			System.out.println("4) Correr hacia la derecha");
			while(validation){
				try{
					choices = sc.nextInt();
				}
				catch(Exception e){
					choices = 0;
					sc.nextLine();
					System.out.println("Intenta de nuevo");
				}
				if(choices == 1 || choices == 2 || choices == 3 || choices == 4){
					validation = false;
				}
				else{
					System.out.println("Ingrese un número entre 1 y 4");
				}
			}
			break;
		case 2:
			System.out.println("Ya te alimentaste, sigues hambriento pero ya estas mas enfocado");
			System.out.println("Estas en medio de una calle con cuatro direcciones. Tu siguiente jugada es:");
			System.out.println("1) Ir hacia adelante");
			System.out.println("2) Ir a la izquierda");
			System.out.println("3) Ir a la derecha");
			System.out.println("4) Ir hacia atras");
			while(validation){
				try{
					choices = sc.nextInt();
				}
				catch(Exception e){
					choices = 0;
					sc.nextLine();
					System.out.println("Intenta de nuevo");
				}
				if(choices == 1 || choices == 2 || choices == 3 || choices == 4){
					validation = false;
				}
				else{
					System.out.println("Ingrese un número entre 1 y 4");
				}
			}
			break;
		case 3:
			System.out.println("Ya te alimentaste, sigues hambriento pero ya estas mas enfocado");
			System.out.println("Un grupo de personas con cuchillos te estan persiguiendo. Tu siguiente jugada es:");
			System.out.println("1) Correr hacia adelante");
			System.out.println("2) Correr hacia el bosque");
			System.out.println("3) Correr hacia una casa");
			System.out.println("4) Luchar contra ellos");
			while(validation){
				try{
					choices = sc.nextInt();
				}
				catch(Exception e){
					choices = 0;
					sc.nextLine();
					System.out.println("Intenta de nuevo");
				}
				if(choices == 1 || choices == 2 || choices == 3 || choices == 4){
					validation = false;
				}
				else{
					System.out.println("Ingrese un número entre 1 y 4");
				}
			}
			break;
		case 4:
			System.out.println("Ya te alimentaste, sigues hambriento pero ya estas mas enfocado");
			System.out.println("Escuchas balasos cerca de donde estas. Tu suiguiente jugada es:");
			System.out.println("1) Correr hacia adelante");
			System.out.println("2) Correr hacia el bosque");
			System.out.println("3) Correr hacia una casa");
			System.out.println("4) Buscarlos y luchar contra ellos");
			while(validation){
				try{
					choices = sc.nextInt();
				}
				catch(Exception e){
					choices = 0;
					sc.nextLine();
					System.out.println("Intenta de nuevo");
				}
				if(choices == 1 || choices == 2 || choices == 3 || choices == 4){
					validation = false;
				}
				else{
					System.out.println("Ingrese un número entre 1 y 4");
				}
			}
			break;
		default:
			System.out.println("Escoge un numero del 1-5");
		}
		return choices;	
	}


	public boolean checkAnswer (int scenario3, int choices2){
		switch(scenario3){
		case 0:
			switch(choices2){
			case 1:
				correct = true;
				score = score+5;
				break;
			case 2:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te encontraron y te mataron");
				}
				break;
			case 4:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 1:
			switch(choices2){
			case 2:
				correct = true;
				score = score+5;
				break;
			case 4:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te encontraron y te mataron");
				}
				break;
			case 3:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 2:
			switch(choices2){
			case 3:
				correct = true;
				score = score+5;
				break;
			case 2:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			case 4:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te encontraron y te mataron");
				}
				break;
			case 1:
				correct = false;
				System.out.println("Te encontraron y te mataron");
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 3:
			switch(choices2){
			case 2:
				correct = true;
				score = score+5;
				break;
			case 1:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te encontraron y te mataron");
				}
				break;
			case 4:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 4:
			switch(choices2){
			case 2:
				correct = true;
				score = score+5;
				break;
			case 1:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te encontraron y te mataron");
				}
				break;
			case 4:
				System.out.println("Te encontraron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		}
		return correct;
	}


	public boolean chances() {
		int chances = (int) (10*Math.random());
		if(chances%2 == 0){
			correct = true;
		}
		else{
			correct = false;
		}
		return correct;
	}


	public int getScore() {
		return score;
	}

}
