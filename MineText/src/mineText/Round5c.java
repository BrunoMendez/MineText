package mineText;
import java.util.Scanner;
public class Round5c {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round5c(int puntaje){
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
			System.out.println("Es la mañana y has llegado a las afueras de la ciudad, ya que caminaste toda la noche. Sigues caminando y descubres que la ciudad está rodeada por zombis que vienen de las ciudades cercanas. ¿Cómo quieres morir?");
			System.out.println("1) Te suicidas con un balazo.");
			System.out.println("2) Te suicidas sofocándote.");
			System.out.println("3) Cierras los ojos y rezas.");
			System.out.println("4) Te esperas a que lleguen los zombis.");
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
			System.out.println("Es la mañana y has llegado a las afueras de la ciudad, ya que te robaste un carro pero ya no tiene gasolina. \nTe bajas del carro y descubres que la ciudad está rodeada por zombis que vienen de las ciudades cercanas. ¿Cómo quieres morir?");
			System.out.println("1) Te suicidas con un balazo.");
			System.out.println("2) Te suicidas sofocándote.");
			System.out.println("3) Cierras los ojos y rezas.");
			System.out.println("4) Te esperas a que lleguen los zombis.");
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
			System.out.println("Es la tarde y has llegado a las afueras de la ciudad, ya que caminaste toda la noche y la mañana solo parándote para \nencontrar agua y comida. Sigues caminando y descubres que la ciudad está rodeada por zombis que vienen de las ciudades cercanas. ¿Cómo quieres morir?");
			System.out.println("1) Te suicidas con un balazo.");
			System.out.println("2) Te suicidas sofocándote.");
			System.out.println("3) Cierras los ojos y rezas.");
			System.out.println("4) Te esperas a que lleguen los zombis.");
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
			System.out.println("Es la mañana y has llegado a las afueras de la ciudad, ya que caminaste toda la noche. Está lloviendo, pero sigues \ncaminando y descubres que la ciudad está rodeada por zombis que vienen de las ciudades cercanas. \nCorres hacia el otro lado pero descubres que ahí también hay. ¿Cómo quieres morir?");
			System.out.println("1) Te suicidas con un balazo.");
			System.out.println("2) Te suicidas sofocándote.");
			System.out.println("3) Cierras los ojos y rezas.");
			System.out.println("4) Te esperas a que lleguen los zombis.");
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
			System.out.println("Es la mañana y has llegado a las afueras de la ciudad, ya que caminaste toda la noche. Sigues caminando y descubres \nque la ciudad está rodeada por zombis que vienen de las ciudades cercanas. Intentas encontrar un hueco entre ellos para intentar escapar. \nLocalizas uno y corres, pero de la nada te cierran el camino. ¿Cómo quieres morir?");
			System.out.println("1) Te suicidas con un balazo.");
			System.out.println("2) Te suicidas sofocándote.");
			System.out.println("3) Cierras los ojos y rezas.");
			System.out.println("4) Te esperas a que lleguen los zombis.");
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
			System.out.println("Has Muerto.\n");
			break;
		case 2:
			correct = false;
			System.out.println("No logras sofocarte y un zombi te muerde. Has Muerto.\n");
			break;
		case 3:
			correct = false;
			System.out.println("Un zombi te muerde. Has Muerto.\n");
			break;
		case 4:
			correct = false;
			System.out.println("Un zombi te muerde. Has Muerto.\n");
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