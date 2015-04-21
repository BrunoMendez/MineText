package mineText;
import java.util.Scanner;
public class Round3a {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round3a(int puntaje){
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
			System.out.println("Ahora vas en el carro hacia el norte y no te puedes explicar por qué no hay carros en la calle. Pasa alrededor de 1 hora y de repente ves que \nhay una fila gigantesca de carros para salir de la ciudad. El trafico no se mueve, por lo que al llegar a la cola te tienes que parar. ¿Qué haces?");
			System.out.println("1) Te bajas del carro y caminas entre los carros para salir de la ciudad.");
			System.out.println("2) Te quedas en el carro esperando a que se mueva el tráfico.");
			System.out.println("3) Te das la vuelta y te regresas por donde venías.");
			System.out.println("4) Te regresas pero decides volver a tu casa para agarrar la pistola que se había quedado.");
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
			System.out.println("Ahora vas en el carro hacia el norte y no te puedes explicar por qué no hay carros en la calle. Pasa alrededor de media hora y de repente ves que \nhay una fila gigantesca de carros para salir de la ciudad. El trafico está parado, por lo que al llegar a la cola no puedes avanzar. ¿Qué haces?");
			System.out.println("1) Te bajas del carro y caminas entre los carros para salir de la ciudad.");
			System.out.println("2) Te quedas en el carro esperando a que se mueva el tráfico.");
			System.out.println("3) Te das la vuelta y te regresas por donde venías.");
			System.out.println("4) Te regresas pero decides volver a tu casa para agarrar la pistola que se había quedado.");
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
			System.out.println("Ahora vas en el carro hacia el norte y no te puedes explicar por qué no hay carros en la calle. Pasa alrededor de 1 hora y de repente ves que hay una fila \ngigantesca de carros para salir de la ciudad. El trafico no se mueve, por lo que al llegar a la cola te tienes que parar. Te bajas del carro y ves que no hay nadie en sus carros. Esto se te hace muy raro. ¿Qué haces?");
			System.out.println("1) Te bajas del carro y caminas entre los carros para salir de la ciudad.");
			System.out.println("2) Te quedas en el carro esperando a que se mueva el tráfico.");
			System.out.println("3) Te das la vuelta y te regresas por donde venías.");
			System.out.println("4) Te regresas pero decides volver a tu casa para agarrar la pistola que se había quedado.");
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
			System.out.println("Ahora vas en el carro hacia el norte y no te puedes explicar por qué no hay carros en la calle. Al llegar al puente ves que hay una fila gigantesca de carros \nesperando salir de la ciudad. El trafico no se mueve, por lo que al llegar a la cola te tienes que parar. Al llegar descubres que no se mueven porque todo había sido causado por un choque masivo. ¿Qué haces?");
			System.out.println("1) Te bajas del carro y caminas entre los carros para salir de la ciudad.");
			System.out.println("2) Te quedas en el carro esperando a que se mueva el tráfico.");
			System.out.println("3) Te das la vuelta y te regresas por donde venías.");
			System.out.println("4) Te regresas pero decides volver a tu casa para agarrar la pistola que se había quedado.");
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
			System.out.println("Ahora vas en el carro hacia el norte y no te puedes explicar por qué no hay carros en la calle. Pasa alrededor de 1 hora y de repente ves que hay fila \ngigantesca de carros para salir de la ciudad. El trafico no se mueve, por lo que al llegar a la cola te tienes que parar. Te \nempiezas a desesperar ya que no se mueve y pitas como histérico, pero al fijarte bien descubres que los carros están vacíos. ¿Qué haces?");
			System.out.println("1) Te bajas del carro y caminas entre los carros para salir de la ciudad.");
			System.out.println("2) Te quedas en el carro esperando a que se mueva el tráfico.");
			System.out.println("3) Te das la vuelta y te regresas por donde venías.");
			System.out.println("4) Te regresas pero decides volver a tu casa para agarrar la pistola que se había quedado.");
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
				System.out.println("Al bajarte caminas por un rato. Al cansarte decides descansar, pero ves que a lo lejos van llegando los zombis. Empiezas \na correr y por suerte llegas a tu carro sin daños. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("Al bajarte caminas por un rato. Al cansarte decides descansar, pero ves que a lo lejos van llegando los zombis. Empiezas a correr, \npero lamentablemente los zombis son más rápidos que tu y te alcanzan a morder. Has Muerto.");
			}
			break;
		case 2:
			correct = false;
			System.out.println("El tráfico nunca se mueve por lo que te quedas dormido. Después de una hora te despiertas por movimiento en el carro y ves que estás \nrodeado de zombis. No hay escapatoria. Has Muerto.");
			break;
		case 3:
			correct = true;
			score = score+5;
			System.out.println("Pasas a la siguiente ronda.");
			break;
		case 4:
			correct = false;
			System.out.println("Al regresar a tu casa entras y rápidamente buscas tu pistola. Finalmente la encuentras y al ir de regreso a tu carro se aparece un zombi. \nTu le disparas pero la bala no le hace daño, por lo que se te lanza y te muerde. Has Muerto.");
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