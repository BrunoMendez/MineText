package mineText;
import java.util.Scanner;
public class Round3c {
	public Scanner sc = new Scanner(System.in);
	public int score, choices;
	public boolean correct, validation = true;

	public Round3c(int puntaje){
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
			System.out.println("Habiendo dejado el zombi en el sótano bloqueas la puerta con muebles y sales a la calle. \nEscuchas sonidos de gente gritando provenientes del norte. ¿Qué haces?");
			System.out.println("1) Vas al norte a investigar qué está pasando.");
			System.out.println("2) Vas al noroeste.");
			System.out.println("3) Vas al sur.");
			System.out.println("4) Vas al este.");
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
			System.out.println("Habiendo dejado el zombi en el sótano sales a la calle y cierras la puerta de la casa para encerrar al zombi. \nEscuchas sonidos de gente gritando provenientes del norte. ¿Qué haces?");
			System.out.println("1) Vas al norte a investigar qué está pasando.");
			System.out.println("2) Vas al noroeste.");
			System.out.println("3) Vas al sur.");
			System.out.println("4) Vas al este.");
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
			System.out.println("Habiendo dejado el zombi en el sótano bloqueas la puerta con muebles y sales a la calle. \nEscuchas sonidos raros provenientes del norte. ¿Qué haces?");
			System.out.println("1) Vas al norte a investigar qué está pasando.");
			System.out.println("2) Vas al noroeste.");
			System.out.println("3) Vas al sur.");
			System.out.println("4) Vas al este.");
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
			System.out.println("Habiendo dejado el zombi en el sótano bloqueas la puerta con muebles y sales a la calle. \nEscuchas sonidos de gente gritando provenientes del norte. No sabes qué es lo que está pasando. ¿Qué haces?");
			System.out.println("1) Vas al norte a investigar qué está pasando.");
			System.out.println("2) Vas al noroeste.");
			System.out.println("3) Vas al sur.");
			System.out.println("4) Vas al este.");
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
			System.out.println("Habiendo dejado el zombi en el sótano bloqueas la puerta con muebles y sales a la calle. \nEscuchas sonidos de gente gritando provenientes del norte y empiezas a caminar hacia ellos pero te das cuenta que a lo mejor tu vida puede estar en peligro. ¿Qué haces?");
			System.out.println("1) Vas al norte a investigar qué está pasando.");
			System.out.println("2) Vas al noroeste.");
			System.out.println("3) Vas al sur.");
			System.out.println("4) Vas al este.");
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
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Empiezas a caminar y después de media hora de no ver nada te das la vuelta y caminas al noroeste. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("Caminas y descubres que hay cientos de zombis corriendo hacia ti. No logras escapar y te muerden. Has Muerto.");
			}
			break;
		case 2:
			correct = true;
			score = score+5;
			System.out.println("Empiezas a caminar y te comes una bolsa de papitas que encontraste en el piso. Pasas a la siguiente ronda.");
			break;
		case 3:
			correct = false;
			System.out.println("Empiezas a caminar al sur y no te das cuenta que de la nada te empieza a perseguir un zombi que estaba escondido. \nTe logra morder antes de que reaccionas. Has Muerto.");
			break;
		case 4:
			correct = false;
			System.out.println("Empiezas a caminar al este y no te das cuenta que de la nada te empieza a perseguir un zombi que estaba escondido. \nTe logra morder antes de que reaccionas. Has Muerto.");
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