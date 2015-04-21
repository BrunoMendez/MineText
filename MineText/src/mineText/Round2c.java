package mineText;
import java.util.Scanner;
public class Round2c {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round2c(int puntaje){
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
			System.out.println("El zombi logra entrar al sótano y te empieza a buscar. Una vez que te encuentra \nempieza a correr hacia ti y intenta morder y agarrarte. ¿Qué haces?");
			System.out.println("1) Agarras un barrote y le empiezas a pegar para intentar matarlo.");
			System.out.println("2) Le disparas con la pistola.");
			System.out.println("3) Sales corriendo intentando esquivarlo");
			System.out.println("4) Te quedas parado para ver que pasa.");
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
			System.out.println("El zombi logra entrar al sótano y te empieza a buscar. Una vez que te encuentra \nempieza a correr hacia ti. ¿Qué haces?");
			System.out.println("1) Agarras un barrote y le empiezas a pegar para intentar matarlo.");
			System.out.println("2) Le disparas con la pistola.");
			System.out.println("3) Sales corriendo intentando esquivarlo");
			System.out.println("4) Te quedas parado para ver que pasa.");
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
			System.out.println("El zombi logra entrar al sótano y te empieza a buscar. El zombi no te ve al principio, \npero una vez que te encuentra empieza a correr hacia ti y intenta morder y agarrarte. ¿Qué haces?");
			System.out.println("1) Agarras un barrote y le empiezas a pegar para intentar matarlo.");
			System.out.println("2) Le disparas con la pistola.");
			System.out.println("3) Sales corriendo intentando esquivarlo");
			System.out.println("4) Te quedas parado para ver que pasa.");
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
			System.out.println("El zombi logra entrar al sótano y empieza a olfatear todo. Una vez que te encuentra \nempieza a correr hacia ti y intenta morder y agarrarte. ¿Qué haces?");
			System.out.println("1) Agarras un barrote y le empiezas a pegar para intentar matarlo.");
			System.out.println("2) Le disparas con la pistola.");
			System.out.println("3) Sales corriendo intentando esquivarlo");
			System.out.println("4) Te quedas parado para ver que pasa.");
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
			System.out.println("El zombi logra entrar al sótano y te empieza a buscar. Una vez que te encuentra empieza a correr \nhacia ti y intenta morder y agarrarte. En eso se cae pero empieza a arrastrarse hacia ti. ¿Qué haces?");
			System.out.println("1) Agarras un barrote y le empiezas a pegar para intentar matarlo.");
			System.out.println("2) Le disparas con la pistola.");
			System.out.println("3) Sales corriendo intentando esquivarlo");
			System.out.println("4) Te quedas parado para ver que pasa.");
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
		switch(choices2){
		case 1:
			correct = false;
			System.out.println("El barrote no le hace daño al zombi y éste te muerde. Has Muerto.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Logras matar al zombi con 3 balazos en la cabeza. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("La bala no le hace daño al zombi y te muerte. Has Muerto. ");
			}
			break;
		case 3:
			correct = true;
			score = score+5;
			System.out.println("Logras escapar del zombi distrayéndolo. ");
			break;
		case 4:
			correct = false;
			System.out.println("El zombi corre hacia ti y te muerde. Has Muerto.");
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

	public int getScore(){
		return score;
	}
}