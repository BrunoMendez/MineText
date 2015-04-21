package mineText;
import java.util.Scanner;
public class Round5d {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round5d(int puntaje){
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
			System.out.println("Los zombis se aproximan de manera rapida, no parece haber escapatoria, solo hay 4 opciones");
			System.out.println("1) Los esperas para tratar de enfrentarlos ");
			System.out.println("2) Te subes al avion de dos pisos para esconderte ");
			System.out.println("3) Te escondes tras el mostrador esperando que no te vean ");
			System.out.println("4) Te suicidas. ");
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
			System.out.println("Los zombis se aproximan! Se multiplicaron y parecen ser miles de zombis. El ruido es fuerte y decides:");
			System.out.println("1) Los esperas para tratar de enfrentarlos ");
			System.out.println("2) Te subes al avion de dos pisos para esconderte ");
			System.out.println("3) Te escondes tras el mostrador esperando que no te vean ");
			System.out.println("4) Te suicidas. ");
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
			System.out.println("No hay nada mas que hacer, llegaste a la sala de abordaje y mientras que los zombis se aproximan ");
			System.out.println("1) Los esperas para tratar de enfrentarlos ");
			System.out.println("2) Te subes al avion de dos pisos para esconderte ");
			System.out.println("3) Te escondes tras el mostrador esperando que no te vean ");
			System.out.println("4) Te suicidas. ");
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
			System.out.println("Los zombis te han alcanzado, estan a menos de 20 metros de ti, y solo tienes algunas opciones:");
			System.out.println("1) Los esperas para tratar de enfrentarlos ");
			System.out.println("2) Te subes al avion de dos pisos para esconderte ");
			System.out.println("3) Te escondes tras el mostrador esperando que no te vean ");
			System.out.println("4) Te suicidas. ");
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
			System.out.println("Con los zombis a menos de 20 metros de distancia, tus opciones son limitadisimas. El avion suena como la mas prometedora:");
			System.out.println("1) Los esperas para tratar de enfrentarlos ");
			System.out.println("2) Te subes al avion de dos pisos para esconderte ");
			System.out.println("3) Te escondes tras el mostrador esperando que no te vean ");
			System.out.println("4) Te suicidas. ");
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
			System.out.println("Jamas podrias contra tantos zombis, pesima eleccion, viviras una muerte lenta y dolorosa");
			break;
		case 2:
			correct = false;
			System.out.println("Te subes al avion y encuentras muchisima comida y espacio. Sin embargo despues de algunos meses los zombis siguen\n esperando, por lo que muertes de hambre en el avion atrapado");
			break;
		case 3:
			correct = false;
			System.out.println("Los zombis se guian por el olfato y te encuentran casi instantaneamente");
			break;
		case 4:
			correct = false;
			System.out.println("AL MENOS LO HICISTE CON DIGNIDAD, UN PUNTO POR ESO");
			score=score+1;
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
