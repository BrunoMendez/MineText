package mineText;
import java.util.Scanner;
public class Round4d {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round4d(int puntaje){
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
			System.out.println("Despues de haber asesinado a esa inocente persona encuentras varias fotos de su familia y sus hijos, pero eso no te importa, a ti te interesa los recursos\n encuentras una escopeta llena de balas. Justo en ese momento escuchas una cantidad \n enorme de ruido, son miles de zombis en el aeropuerto.");
			System.out.println("1) Corres, buscas alguna manera de salvarte en las salas de abordar sabiendo que no hay manera de enfrentarte a tantos zombis ");
			System.out.println("2) Vas enfrentarlos, por supuesto que puedes, es una escopeta y cada tiro matara a almenos a 5 de ellos. ");
			System.out.println("3) Decides tomar la ruta larga para llegar a uno de los aviones de 2 pisos. ");
			System.out.println("4) Te encierras en el cuarto electrico ");
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
			System.out.println("Despues de haberlo asesinado a sangre fria, descubres que dejo una escopeta de petardos, pero de repente escuchas el sonido de trillones de zombis en el aeropuerto \n llamaste su atencion con la pelea, entonces:");
			System.out.println("1) Corres, buscas alguna manera de salvarte en las salas de abordar sabiendo que no hay manera de enfrentarte a tantos zombis ");
			System.out.println("2) Vas enfrentarlos, por supuesto que puedes, es una escopeta y cada tiro matara a almenos a 5 de ellos. ");
			System.out.println("3) Decides tomar la ruta larga para llegar a uno de los aviones de 2 pisos. ");
			System.out.println("4) Te encierras en el cuarto electrico ");
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
			System.out.println("Cuando ya te aseguraste que lo mataste encuentras en sus pertenencias una escopeta. La puerta principal del aeropuerto se abre porque le picas al boton por accidente y cientos de millones de zombis \n entran por lo que: ");
			System.out.println("1) Corres, buscas alguna manera de salvarte en las salas de abordar sabiendo que no hay manera de enfrentarte a tantos zombis ");
			System.out.println("2) Vas enfrentarlos, por supuesto que puedes, es una escopeta y cada tiro matara a almenos a 5 de ellos. ");
			System.out.println("3) Decides tomar la ruta larga para llegar a uno de los aviones de 2 pisos. ");
			System.out.println("4) Te encierras en el cuarto electrico ");
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
			System.out.println("Checas su pulso, efectivamente esta muerto, gracias a dios. Respiras y coges la escopeta que esta en el piso. De repente una manada increiblemente rapida de zombis entra al aeropuerto pues \n hiciste mucho ruido en la batalla. Decide rápido!");
			System.out.println("1) Corres, buscas alguna manera de salvarte en las salas de abordar sabiendo que no hay manera de enfrentarte a tantos zombis ");
			System.out.println("2) Vas enfrentarlos, por supuesto que puedes, es una escopeta y cada tiro matara a almenos a 5 de ellos. ");
			System.out.println("3) Decides tomar la ruta larga para llegar a uno de los aviones de 2 pisos. ");
			System.out.println("4) Te encierras en el cuarto electrico ");
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
			System.out.println("Checas sus pertenencias, tal vez hay armas. Encuentras una escopeta de alto calibre, y justo en el momento una manada de 10 zombis entran al aeropuerto por lo que:");
			System.out.println("1) Corres, buscas alguna manera de salvarte en las salas de abordar sabiendo que no hay manera de enfrentarte a tantos zombis ");
			System.out.println("2) Vas enfrentarlos, por supuesto que puedes, es una escopeta y cada tiro matara a almenos a 5 de ellos. ");
			System.out.println("3) Decides tomar la ruta larga para llegar a uno de los aviones de 2 pisos. ");
			System.out.println("4) Te encierras en el cuarto electrico ");
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
			correct = true;
			score = score+5;
			System.out.println("Llegas a la sala de abordaje donde sigues teniendo el mismo problema, pero ahora tienes mas opciones y mas tiempo");
			break;
		case 2:
			correct = false;
			System.out.println("Son demasiados, mala eleccion, jamas podrias con tantos zombis al mismo tiempo con esa arma.");
			break;
		case 3:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Tomaste el camino con mas riesgo, sin embargo tu velocidad supera la de los zombis y llegas sano y salvo a la sala de abordar de un A-380");
			}
			else{
				System.out.println("Tomaste el camino con mas riesgo, te alcanzan y mueres");
			}
			break;
		case 4:
			correct = false;
			System.out.println("Pronto los zombis derriban la puerta, por su increiblemente grande deseo de sangre, te arrancan la cabeza y se la comen.");
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
