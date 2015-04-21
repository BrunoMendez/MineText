package mineText;
import java.util.Scanner;
public class Round2a {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round2a(int puntaje){
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
			System.out.println("Saliendo de tu cochera ves que se han juntado alrededor de 5 zombis queriendo entrar a tu casa, \ny una vez que te ven corren hacia ti. Tu aceleras y alcanzas atropellar y matar a unos cuentos y después empiezas a manejar en la calle y ves a tu vecina siendo perseguida por zombis. ¿Qué haces?");
			System.out.println("1) Rescatas a tu vecina intentando atropellar todos los zombis.");
			System.out.println("2) Ignoras a tu vecina y sigues tu camino.");
			System.out.println("3) Rescatas a tu vecina parándote en su camino para que se suba al carro.");
			System.out.println("4) Te bajas del carro a distraer a los zombis para que tu vecina pueda escapar.");
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
			System.out.println("Saliendo de tu cochera ves que se han empiezan a correr hacia ti  una vez que te ven. \nTu aceleras y alcanzas atropellar y matar a la mayoría. Después empiezas a manejar en la calle y ves a tu vecina siendo perseguida por zombis. ¿Qué haces?");
			System.out.println("1) Rescatas a tu vecina intentando atropellar todos los zombis.");
			System.out.println("2) Ignoras a tu vecina y sigues tu camino.");
			System.out.println("3) Rescatas a tu vecina parándote en su camino para que se suba al carro.");
			System.out.println("4) Te bajas del carro a distraer a los zombis para que tu vecina pueda escapar.");
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
			System.out.println("Saliendo de tu cochera ves que se han juntado alrededor de 5 zombis queriendo entrar a tu casa, y \nuna vez que te ven corren hacia ti. Tu aceleras y los evades a todos. Después empiezas a manejar en la calle y ves a tu vecina siendo perseguida por zombis. ¿Qué haces?");
			System.out.println("1) Rescatas a tu vecina intentando atropellar todos los zombis.");
			System.out.println("2) Ignoras a tu vecina y sigues tu camino.");
			System.out.println("3) Rescatas a tu vecina parándote en su camino para que se suba al carro.");
			System.out.println("4) Te bajas del carro a distraer a los zombis para que tu vecina pueda escapar.");
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
			System.out.println("Saliendo de tu cochera ves que se han juntado alrededor de 5 zombis queriendo entrar a tu casa, y \nuna vez que te ven corren hacia ti. Tu aceleras y alcanzas atropellar y matar a unos cuantos, y después empiezas a manejar en la calle y ves que tu vecina \nsiendo perseguida por un grupo gigantesco de zombis. ¿Qué haces?");
			System.out.println("1) Rescatas a tu vecina intentando atropellar todos los zombis.");
			System.out.println("2) Ignoras a tu vecina y sigues tu camino.");
			System.out.println("3) Rescatas a tu vecina parándote en su camino para que se suba al carro.");
			System.out.println("4) Te bajas del carro a distraer a los zombis para que tu vecina pueda escapar.");
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
			System.out.println("Saliendo de tu cochera ves que se han juntado varios zombis queriendo entrar a tu casa, y una vez \nque te ven corren hacia ti. Tu aceleras y alcanzas atropellar y matar a algunos de ellos. Después empiezas a alejarte de tu casa y ves a tu vecina siendo \nperseguida por muchos zombis. Te das cuenta que hay muchas probabilidades de que vaya a morir. ¿Qué haces?");
			System.out.println("1) Rescatas a tu vecina intentando atropellar todos los zombis.");
			System.out.println("2) Ignoras a tu vecina y sigues tu camino.");
			System.out.println("3) Rescatas a tu vecina parándote en su camino para que se suba al carro.");
			System.out.println("4) Te bajas del carro a distraer a los zombis para que tu vecina pueda escapar.");
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
			System.out.println("Al intentar atropellar a los zombis sin querer también atropellas a tu vecina. Al ver lo que hiciste te bajas a ayudarla, pero los zombis los alcanzan y muerden. Has Muerto.");
			break;
		case 2:
			correct = true;
			score = score+5;
			System.out.println("Pasas a la siguiente ronda.");
			break;
		case 3:
			correct = false;
			System.out.println("Manejas rápidamente para alcanzarla y abres la puerta para que suba, pero ella, ya muy cansada por haber corrido tanto, se tarda mucho en subirse y deja que se suba un zombi. \nÉste los muerde a los dos. Has Muerto.");
			break;
		case 4:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Tu técnica funciona y, por ahora, has salvado la vida de tu vecina. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("En lo que te bajas uno de los zombis que estaba en tu casa llega por detrás de ti y te muerde. Has Muerto.");
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