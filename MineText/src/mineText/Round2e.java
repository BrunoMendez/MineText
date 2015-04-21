package mineText;
import java.util.Scanner;
public class Round2e {
	public static Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round2e(int puntaje){
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
			System.out.println("Te mordieron pero por alguna razon sobreviviste. Te levantas con hambre... hambre de humanos");
			System.out.println("Ves a un amigo tuyo con un cuchillo a lo lejos y gente muerta alrededor de ti. Tu reaccion es:");
			System.out.println("1) Resistir el hambre");
			System.out.println("2) Tratar de comerte a tu amigo");
			System.out.println("3) Comerte a una persona muerta");
			System.out.println("4) Buscar a otras personas que comer");
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
			System.out.println("Te mordieron pero por alguna razon sobreviviste. Te levantas con hambre... hambre de humanos");
			System.out.println("Una persona normal esta pasando cerca de ti. Tu reaccion es:");
			System.out.println("1) Morderle el pie y comerte a la persona");
			System.out.println("2) Resistir el hambre");
			System.out.println("3) Dejarlo pasar y buscar a otra persons que comer");
			System.out.println("4) Levantarte y morderle el cuello");
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
			System.out.println("Te mordieron pero por alguna razon sobreviviste. Te levantas con hambre... hambre de humanos");
			System.out.println("Ves a tu amigo vuelto zombi comiendose a alguien. Tu reaccion es:");
			System.out.println("1) Tratar de matarlos");
			System.out.println("2) Comer con el");
			System.out.println("3) Resistir el hambre");
			System.out.println("4) Buscar a alguien más que comer");
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
			System.out.println("Te mordieron pero por alguna razon sobreviviste. Te levantas con hambre... hambre de humanos");
			System.out.println("Ves a tu hijo llorando alado de ti porque piensa que estas muerto. Tu reaccion es: ");
			System.out.println("1) Morderle el cuello");
			System.out.println("2) Morderle el pie");
			System.out.println("3) Resistir el hambre");
			System.out.println("4) Levantarte y salir corriendo");
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
			System.out.println("Te mordieron pero por alguna razon sobreviviste. Te levantas con hambre... hambre de humanos");
			System.out.println("Estas en una calle vacia y estas a punto de morirte de hambre. Tu reaccion es:");
			System.out.println("1) Regresar a tu casa y hacerte un sandwich");
			System.out.println("2) Resistir el hambre");
			System.out.println("3) Buscar a gente que comer en las calles");
			System.out.println("4) Buscar a gente que comer en las casas");
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
			case 3:
				correct = true;
				score = score+5;
				break;
			case 1:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			case 2:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Te apuñalo en la cabeza. Estas muerto");
				}
				break;
			case 4:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 1:
			switch(choices2){
			case 4:
				correct = true;
				score = score+5;
				break;
			case 2:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te apuñalo en la cabeza. Estas muerto");
				}
				break;
			case 3:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 2:
			switch(choices2){
			case 2:
				correct = true;
				score = score+5;
				break;
			case 3:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			case 4:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Te has muerto de hambre");
				}
				break;
			case 1:
				correct = false;
				System.out.println("Fallaste. Te has muerto de hambre");
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
			case 3:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Te apuñaló en la cabeza. Estas muerto");
				}
				break;
			case 4:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 4:
			switch(choices2){
			case 4:
				correct = true;
				score = score+5;
				break;
			case 2:
				System.out.println("Te has muerto de hambre");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Te has muerto de hambre");
				}
				break;
			case 1:
				System.out.println("Los sandwiches no afectan tu hambre. Te has muerto de hambre");
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
