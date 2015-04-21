package mineText;
import java.util.Scanner;
public class Round2d {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round2d(int puntaje){
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
			System.out.println("Desp˙es de haberte salido vivo de esa situaciÛn, es hora de que decidas que hacer, por lo que tienes que buscar un plan entonces decides:");
			System.out.println("1) Explorar el aeropuerto abandonado");
			System.out.println("2) Ir al aeropuerto para buscar ver si hay alguien en la torre de control");
			System.out.println("3) Quedarte en tu casa para ver si hay alguien que te salve. ");
			System.out.println("4) Robar un avión que esté en el aeropuerto cerca de tu casa para salir de ahi ");
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
			System.out.println("Cuando te recuperas por esa violencia tan sangrienta, comienza a llover, y te das cuenta que debes salir de ahi. Consideras tus opciones y decides:");
			System.out.println("1) Explorar el aeropuerto abandonado");
			System.out.println("2) Ir al aeropuerto para buscar ver si hay alguien en la torre de control");
			System.out.println("3) Quedarte en tu casa para ver si hay alguien que te salve. ");
			System.out.println("4) Robar un avión que esté en el aeropuerto cerca de tu casa para salir de ahi ");
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
			System.out.println("Cuando ya te hiciste cargo de los Zombis, una manada de tal vez trillones de zombis asquerosos y violentos se acercan a ti, consideras tus opciones rapido y decides:");
			System.out.println("1) Explorar el aeropuerto abandonado");
			System.out.println("2) Ir al aeropuerto para buscar ver si hay alguien en la torre de control");
			System.out.println("3) Quedarte en tu casa para ver si hay alguien que te salve. ");
			System.out.println("4) Robar un avión que esté en el aeropuerto cerca de tu casa para salir de ahi ");
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
			System.out.println("Despues del incidente con los zombis es hora de cambiar el plan. Sabes que si permaneces ahi miles de millones de zombis llegaran en poco tiempo asi que decides:");
			System.out.println("1) Explorar el aeropuerto abandonado");
			System.out.println("2) Ir al aeropuerto para buscar ver si hay alguien en la torre de control");
			System.out.println("3) Quedarte en tu casa para ver si hay alguien que te salve. ");
			System.out.println("4) Robar un avión que esté en el aeropuerto cerca de tu casa para salir de ahi ");
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
			System.out.println("Despues de haber escapado de la muerte, logras recuperarte y decides que es hora de moverte. Buscas tus opciones y recuerdas que el aeropuerto fue cerrado cuando la epidemia se solto entonces decides:");
			System.out.println("1) Explorar el aeropuerto abandonado");
			System.out.println("2) Ir al aeropuerto para buscar ver si hay alguien en la torre de control");
			System.out.println("3) Quedarte en tu casa para ver si hay alguien que te salve. ");
			System.out.println("4) Robar un avión que esté en el aeropuerto cerca de tu casa para salir de ahi ");
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
			System.out.println("Escoge un número del 1 al 5");
		}
		return choices;	
	}
	public boolean checkAnswer (int scenario3, int choices2){
		switch(choices2){
		case 1:
			correct = true;
			score = score+5;
			System.out.println("Al llegar al aeropuerto encuentras que esta completamente abandonado, todo el aeropuerto es para ti");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("No hay nadie en la torre y bajas a el aeropuerto a explorar.");
			}
			else{
				System.out.println("hay un zombi, y como no hay a donde correr, te mata rapidamente");
			}
			break;
		case 3:
			correct = false;
			System.out.println("Despues de semanas en tu casa, mueres de hambre, nadie te rescato.");
			break;
		case 4:
			correct = false;
			System.out.println("Te subes al avion, aceleras a fondo, pero recuerdas que no sabes volar un avion. Al elevarte pierdes control y mueres. ");
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