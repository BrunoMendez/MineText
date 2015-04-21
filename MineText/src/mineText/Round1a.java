package mineText;
import java.util.Scanner;
public class Round1a {
	public Scanner sc = new Scanner(System.in); 
	public int score, choices;
	public boolean correct, validation = true;

	public Round1a(int puntaje){
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
			System.out.println("Corres a la puerta trasera y la abres. Por suerte no hay ningún zombi a la redonda. Te saltas la barda de tu patio. ¿Qué haces?");
			System.out.println("1) Entras a la casa de tu vecino para ver si hay alguien.");
			System.out.println("2) Vuelves a tu casa en busca de tu pistola.");
			System.out.println("3) Caminas hacia la calle para ver si encuentras algo.");
			System.out.println("4) Corres a la cochera para subirte al carro.");
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
			System.out.println("Corres a la puerta trasera y la intentas abrir. La puerta está cerrada, pero rápidamente encuentras las llaves y la abres. \nPor suerte no hay ningún zombi a la redonda. Te asomas para checar que no haya ningún zombi y te saltas la barda de tu patio. ¿Qué haces?");
			System.out.println("1) Entras a la casa de tu vecino para ver si hay alguien.");
			System.out.println("2) Vuelves a tu casa en busca de tu pistola.");
			System.out.println("3) Caminas hacia la calle para ver si encuentras algo.");
			System.out.println("4) Corres a la cochera para subirte al carro.");
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
			System.out.println("Corres a la puerta trasera y la abres. Por suerte no hay ningún zombi a la redonda, pero escuchas que se están acercando. \nTe saltas la barda de tu patio. ¿Qué haces?");
			System.out.println("1) Entras a la casa de tu vecino para ver si hay alguien.");
			System.out.println("2) Vuelves a tu casa en busca de tu pistola.");
			System.out.println("3) Caminas hacia la calle para ver si encuentras algo.");
			System.out.println("4) Corres a la cochera para subirte al carro.");
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
			System.out.println("Corres a la puerta trasera y la abres, pero antes agarras lo primero de comida que te encuentras, ya que no sabes si vas a \nregresar a tu casa o si vas a tener comida en el futuro. Ya saliendo ves que no hay ningún zombi a la redonda. Te saltas la barda de tu patio. ¿Qué haces?");
			System.out.println("1) Entras a la casa de tu vecino para ver si hay alguien.");
			System.out.println("2) Vuelves a tu casa en busca de tu pistola.");
			System.out.println("3) Caminas hacia la calle para ver si encuentras algo.");
			System.out.println("4) Corres a la cochera para subirte al carro.");
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
			System.out.println("Corres a la puerta trasera y la abres. No hay ningún zombi a la redonda. Te saltas la barda de tu patio y vuelves a checar \nque no haya nadie. ¿Qué haces?");
			System.out.println("1) Entras a la casa de tu vecino para ver si hay alguien.");
			System.out.println("2) Vuelves a tu casa en busca de tu pistola.");
			System.out.println("3) Caminas hacia la calle para ver si encuentras algo.");
			System.out.println("4) Corres a la cochera para subirte al carro.");
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
			System.out.println("Al entrar todo está apagado. No hay ruidos y crees que la casa está vacía, pero de la nada aparece tu vecino en forma de zombi y \nempieza a correr hacia ti. Estás en shock y no alcanzas a defenderte. El zombi te muerde. Has Muerto.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Al volver a entrar a la casa te das cuenta que la puerta ha sido destrozada. Corres hacia donde tenías la pistola, pero antes \nde llegar te sorprende un zombi y te muerte. Has muerto.");
			}
			else{
				System.out.println("Al volver a entrar a la casa te das cuenta que la puerta ha sido destrozada. Corres hacia donde tenías la pistola y al \nagarrarla le disparas a un zombi que estaba atrás de ti. Después te subes al carro y lo prendes. Pasas a la siguiente ronda.");
			}
			break;
		case 3:
			correct = false;
			System.out.println("Al ir caminando por la calle te descubren alrededor de 10 zombis que te empiezan a perseguir. Tu empiezas a correr, pero en eso te \ntropiezas y en menos de 2 segundos un zombi está sobre ti. Éste te muerde. Has Muerto.");
			break;
		case 4:
			correct = true;
			score = score+5;
			System.out.println("Llegas a tu cochera y por suerte habías dejado las llaves adentro del carro. Lo prendes y te sales de tu casa. Pasas a la siguiente ronda.");
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