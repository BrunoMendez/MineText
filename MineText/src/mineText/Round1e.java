package mineText;
import java.util.Scanner;
public class Round1e {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round1e(int puntaje){
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
			System.out.println("Lo que estaba afuera de la puerta era tu esposa muerta y te esta mordiendo el cuello");
			System.out.println("Tu reaccion es: ");
			System.out.println("1) Morderla devuelta");
			System.out.println("2) Pedir ayuda");
			System.out.println("3) Retroceder y matarla con un palo");
			System.out.println("4) Tratar de noquearla y llevarla al hospital");
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
			System.out.println("Ahora hay 5 creaturas más y una de ellas esta agarrando te el pie");
			System.out.println("Tu reacción es: ");
			System.out.println("1) Retroceder y luchar contra los otros");
			System.out.println("2) Pedir ayuda");
			System.out.println("3) Usar tu fuerza para derribarlos");
			System.out.println("4) Usar tus habilidades de combate para pelear contra ellos");
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
			System.out.println("Lo que estaba detras de la puerta era tu mejor amigo, pero se ve muy mal y se te esta acercando");
			System.out.println("Tu reaccion es: ");
			System.out.println("1) Pedir ayuda");
			System.out.println("2) Reirte de su broma");
			System.out.println("3) Abrazarlo");
			System.out.println("4) Tratar de noquearlo con un golpe");
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
			System.out.println("Ves a la creatura comiendose a alguien enfrente de ti");
			System.out.println("Tu reaccion es: ");
			System.out.println("1) Tratar de detenerlo");
			System.out.println("2) Ir a buscar tu pistola");
			System.out.println("3) Tratar de pasar alado de el");
			System.out.println("4) Cerrar la puerta y esonderte en tu casa");
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
			System.out.println("Lo que estaba detras de la puerta era tu novia, pero se ve muy mal y te esta tratando de agarrar");
			System.out.println("Tu reaccion es: ");
			System.out.println("1) Dejarla entrar");
			System.out.println("2) Pedir ayuda");
			System.out.println("3) Darle un abrazo");
			System.out.println("4) Golpearla en la cara");
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
			System.out.println("Escoge un número del 1-5");
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
			case 2:
				System.out.println("Era un zombi y te comio");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Era un zombi y te comio");
				}
				break;
			case 4:
				System.out.println("Era un zombi y te comio");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 1:
			switch(choices2){
			case 3:
				correct = true;
				score = score+5;
				break;
			case 1:
				System.out.println("El zombi te comio");
				correct = false;
				break;
			case 4:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("No tienes habilidades de combate. El zombi te comio");
				}
				break;
			case 2:
				System.out.println("Era un zombi y te comio");
				correct = false;
				break;
			default:
				System.out.println("Intente de nuevo");
				break;
			}
			break;
		case 2:
			switch(choices2){
			case 4:
				correct = true;
				score = score+5;
				break;
			case 3:
				correct = false;
				System.out.println("Era un zombi y te comio");
				break;
			case 2:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Era un zombi y te comio");
				}
				break;
			case 1:
				System.out.println("Era un zombi y te comio");
				correct = false;
				break;
			default:
				System.out.println("Inente de nuevo");
				break;
			}
			break;
		case 3:
			switch(choices2){
			case 3:
				correct = true;
				score = score+5;
				break;
			case 2:
				correct = false;
				System.out.println("Era un zombi y te comio");
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Era un zombi y te comio");
				}
				break;
			case 4:
				correct = false;
				System.out.println("Era un zombi y te comio");
				break;
			default:
				System.out.println("Intenta de nuevo.");
				break;
			}
			break;
		case 4:
			switch(choices2){
			case 1:
				correct = true;
				score = score+5;;
				break;
			case 2:
				System.out.println("Era un zombi y te comio");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score+15;
				}
				else{
					System.out.println("Era un zombi y te comio");
				}
				break;
			case 4:
				System.out.println("Era un zombi y te comio");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo.");
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
