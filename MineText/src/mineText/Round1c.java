package mineText;
import java.util.Scanner;
public class Round1c {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round1c(int puntaje){
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
			System.out.println("Escuchas los golpes volverse cada vez más fuertes y de la nada se rompe la puerta. \nEl zombi que estaba golpeando entra a la casa y empieza a bajar al sótano. ¿Qué haces?");
			System.out.println("1) Cierras la puerta con llave.");
			System.out.println("2) Corres para afuera antes de que baje el zombi.");
			System.out.println("3) Agarras la pistola que tenías en el sótano para defenderte.");
			System.out.println("4) Te escondes en el sótano para ver si el zombi no te encuentra.");
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
			System.out.println("Dejas de escuchar los golpes y subes a checar qué era. De la nada se rompe la puerta. \nEl zombi que estaba golpeando entra a la casa y te empieza a perseguir al sótano. ¿Qué haces?");
			System.out.println("1) Cierras la puerta con llave.");
			System.out.println("2) Corres para afuera antes de que baje el zombi.");
			System.out.println("3) Agarras la pistola que tenías en el sótano para defenderte.");
			System.out.println("4) Te escondes en el sótano para ver si el zombi no te encuentra.");
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
			System.out.println("Escuchas los golpes volverse cada vez más fuertes y de la nada se rompe la puerta. \nEntran dos zombis a la casa, pero uno se desinteresa y se sale. El otro empieza a bajar al sótano. ¿Qué haces?");
			System.out.println("1) Cierras la puerta con llave.");
			System.out.println("2) Corres para afuera antes de que baje el zombi.");
			System.out.println("3) Agarras la pistola que tenías en el sótano para defenderte.");
			System.out.println("4) Te escondes en el sótano para ver si el zombi no te encuentra.");
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
			System.out.println("Escuchas los golpes volverse cada vez más fuertes y de la nada se rompe la puerta. \nEl zombi que estaba golpeando entra a la casa y empieza a bajar al sótano, pero de la nada dejas de escuchar pasos. Sales a ver qué había pasado y aparece el zombi. Rápidamente vuelves a bajar al sótano. ¿Qué haces?");
			System.out.println("1) Cierras la puerta con llave.");
			System.out.println("2) Corres para afuera antes de que baje el zombi.");
			System.out.println("3) Agarras la pistola que tenías en el sótano para defenderte.");
			System.out.println("4) Te escondes en el sótano para ver si el zombi no te encuentra.");
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
			System.out.println("Escuchas los golpes volverse cada vez más fuertes y de la nada se rompe la puerta. \nEl zombi que estaba golpeando entra a la casa y empieza a rondar la casa y detecta que te encuentras en el sótano. El zombi empieza a bajar. ¿Qué haces?");
			System.out.println("1) Cierras la puerta con llave.");
			System.out.println("2) Corres para afuera antes de que baje el zombi.");
			System.out.println("3) Agarras la pistola que tenías en el sótano para defenderte.");
			System.out.println("4) Te escondes en el sótano para ver si el zombi no te encuentra.");
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
			System.out.println("El zombi logra romper la puerta y te come. Has Muerto.");
			break;
		case 2:
			correct = false;
			System.out.println("El zombi logra atraparte y te come. Has Muerto.");
			break;
		case 3:
			correct = true;
			score = score+5;
			System.out.println("Ahora tienes una pistola para defenderte. Pasas a la siguiente ronda.");
			break;
		case 4:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("El zombi no logra encontrarte por el momento. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("El zombi te encuentra y te muerde. Has Muerto.");
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

	public int getScore(){
		return score;
	}
}