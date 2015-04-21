package mineText;
import java.util.Scanner;
public class Round4a {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round4a(int puntaje){
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
			System.out.println("Ahora vas de regreso e intentas buscar una salida alterna de la ciudad. Esto te lleva a al puente que te saca de la ciudad al otro \nlado de donde había todo el tráfico. Al irte aproximando te das cuenta que hay un barco gigante y muchas personas todavía vivas se están subiendo. Tu estacionas tu carro y empiezas a caminar hacia el barco. Pero de la nada te empieza a perseguir un grupo de zombis. ¿Qué haces?");
			System.out.println("1) Vas hacia ellos y los intentas matar para que no alcancen a subir al barco.");
			System.out.println("2) Corres inmediatamente al barco.");
			System.out.println("3) Corres hacia un lado para que los zombis no logren subirse al barco, y luego cambias de dirección drásticamente para alcanzar subirte sin que los zombis alcancen.");
			System.out.println("4) Te encierras en el carro para que no te pase nada.");
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
			System.out.println("Ahora intentas buscar una salida alterna de la ciudad. Esto te lleva a al puente que te saca de la ciudad y al irte aproximando \nte das cuenta que hay un barco gigante al que se están subiendo muchas personas todavía vivas. Tu estacionas tu carro y empiezas a caminar hacia el barco muy emocionado por creer que \nfinalmente estabas a salvo. Pero de la nada te empieza a perseguir un grupo de zombis. ¿Qué haces?");
			System.out.println("1) Vas hacia ellos y los intentas matar para que no alcancen a subir al barco.");
			System.out.println("2) Corres inmediatamente al barco.");
			System.out.println("3) Corres hacia un lado para que los zombis no logren subirse al barco, y luego cambias de dirección drásticamente para alcanzar subirte sin que los zombis alcancen.");
			System.out.println("4) Te encierras en el carro para que no te pase nada.");
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
			System.out.println("Ahora vas de regreso e intentas buscar una salida alterna de la ciudad. Esto te lleva a al puente que te saca de la ciudad al \notro lado de donde había todo el tráfico. Al irte aproximando te das cuenta que hay un barco gigante y muchas personas todavía vivas se están subiendo. Tu estacionas tu carro y \nempiezas a caminar hacia el barco. Pero de la nada ves un grupo de zombis a lo lejos, y ellos al verte empiezan a correr rápidamente hacia ti. ¿Qué haces?");
			System.out.println("1) Vas hacia ellos y los intentas matar para que no alcancen a subir al barco.");
			System.out.println("2) Corres inmediatamente al barco.");
			System.out.println("3) Corres hacia un lado para que los zombis no logren subirse al barco, y luego cambias de dirección drásticamente para alcanzar subirte sin que los zombis alcancen.");
			System.out.println("4) Te encierras en el carro para que no te pase nada.");
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
			System.out.println("Ahora intentas buscar una salida alterna de la ciudad. Esto te lleva a al puente que te saca de la ciudad y al irte aproximando \nte das cuenta que hay un barco gigante al que se están subiendo muchas personas todavía vivas. Tu estacionas tu carro y empiezas a caminar hacia el barco. Pero de la nada \nves un grupo de zombis a lo lejos, y ellos al verte empiezan a correr rápidamente hacia ti. ¿Qué haces?");
			System.out.println("1) Vas hacia ellos y los intentas matar para que no alcancen a subir al barco.");
			System.out.println("2) Corres inmediatamente al barco.");
			System.out.println("3) Corres hacia un lado para que los zombis no logren subirse al barco, y luego cambias de dirección drásticamente para alcanzar subirte sin que los zombis alcancen.");
			System.out.println("4) Te encierras en el carro para que no te pase nada.");
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
			System.out.println("Ahora intentas buscar una salida alterna de la ciudad. Esto te lleva a al puente que te saca de la ciudad y al irte aproximando \nte das cuenta que hay un barco gigante al que se están subiendo muchas personas todavía vivas. Tu estacionas tu carro y empiezas a caminar hacia el barco. Pero de la nada \nte empieza a perseguir un grupo de zombis y empiezas a correr. ¿Qué haces?");
			System.out.println("1) Vas hacia ellos y los intentas matar para que no alcancen a subir al barco.");
			System.out.println("2) Corres inmediatamente al barco.");
			System.out.println("3) Corres hacia un lado para que los zombis no logren subirse al barco, y luego cambias de dirección drásticamente para alcanzar subirte sin que los zombis alcancen.");
			System.out.println("4) Te encierras en el carro para que no te pase nada.");
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
			System.out.println("Has hecho algo bueno por los tripulantes del barco ya que hiciste que los zombis se distrajeran, pero lamentablemente te alcanzaron a morder. Has Muerto.");
			break;
		case 2:
			correct = true;
			score = score+5;
			System.out.println("Empiezas a correr al barco y por suerte los zombis no logran alcanzarte. Pasas a la siguiente ronda.");
			break;
		case 3:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Al hacer esta maniobra los zombis se entorpecen, ya que no tienen los mismos reflejos ni \nlas habilidades que tu. Por eso no te logran alcanzar cuando vas corriendo hacia el barco. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("Al cambiar drásticamente de dirección resbalas y terminas en el piso. Intentas levantarte lo \nmás rápido que puedes pero el dolor es demasiado fuerte. En eso llegan los zombis y te muerden. Has Muerto.");
			}
			break;
		case 4:
			correct = false;
			System.out.println("Al hacer esto tu carro termina rodeado de zombis y ya no tienes escapatoria. Lo bueno es que serviste como una \ndistracción que permitió que las demás personas escaparan con vida en el barco. Has Muerto.");
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