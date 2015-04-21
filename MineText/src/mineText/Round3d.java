package mineText;
import java.util.Scanner;
public class Round3d {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round3d(int puntaje){
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
			System.out.println("En el aeropuerto comienza a encenderse y apagarse la luz, como si alguien estuviera ahi así que decides ir al cuarto electrico a investigar\n encuentras a una persona pero no se da cuenta que estas ahi. Entonces:");
			System.out.println("1) La saludas esperando que se vuelvan amigos ");
			System.out.println("2) La matas ahorcandola ");
			System.out.println("3) Sales rapidamente del cuarto y escapas ");
			System.out.println("4) La matas a golpes ");
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
			System.out.println("En el aeropuerto te encuentras solo, hasta que escuchas fuertes gritos desde un cuarto electrico, te metes a investigar que es pues estas asustado y descubres una persona que no se da cuenta que estas ahi, entonces:");
			System.out.println("1) La saludas esperando que se vuelvan amigos ");
			System.out.println("2) La matas ahorcandola ");
			System.out.println("3) Sales rapidamente del cuarto y escapas ");
			System.out.println("4) La matas a golpes ");
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
			System.out.println("Al entrar al aeropuerto te das cuenta que eres el ˙nico ahi. Comienzas a explorar y de repente escuchas musica desde un cuarto electrico. La musica hace eco en todo el aeropuerto de \n de manera tenebrosa, por lo que decides ir a checar. Dentro del cuarto te encuentras una persona que no \n se da cuenta que estas ahi.");
			System.out.println("1) La saludas esperando que se vuelvan amigos ");
			System.out.println("2) La matas ahorcandola ");
			System.out.println("3) Sales rapidamente del cuarto y escapas ");
			System.out.println("4) La matas a golpes ");
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
			System.out.println("En el aeropuerto, se comienzan a escuchar sonidos horribles, golpes fuertes y todos parecen provenir del mismo lugar: El cuarto electrico. Al entrar ves una persona, pero la persona no se da cuenta que entraste, por lo que:");
			System.out.println("1) La saludas esperando que se vuelvan amigos ");
			System.out.println("2) La matas ahorcandola ");
			System.out.println("3) Sales rapidamente del cuarto y escapas ");
			System.out.println("4) La matas a golpes ");
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
			System.out.println("Despues de darle varias vueltas al aeropuerto en busca de algun recurso interesante te das cuenta de que no hay nada. Sin embargo comienzas a escuchar risas desde un cuarto electrico. Vas a explorar y descubres a una persona sentada de espaldas\n a ti, te le acercas sigilosamente por detras y:");
			System.out.println("1) La saludas esperando que se vuelvan amigos ");
			System.out.println("2) La matas ahorcandola ");
			System.out.println("3) Sales rapidamente del cuarto y escapas ");
			System.out.println("4) La matas a golpes ");
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
			System.out.println("La persona asustada te comienza a disparar pues no esta dispuesta a tomar riesgos, EN EL MUNDO ZOMBI NO DEBES CONFIAR EN NADIE, NADIE!");
			break;
		case 2:
			correct = true;
			score = score+5;
			System.out.println("La persona agoniza, se forza y te comienza a golpear, pero sus intentos son inutiles. Da unos ultimos intentos en vano para quitartele de encima pero muere.");
			break;
		case 3:
			correct = false;
			System.out.println("Al salir corriendo la persona te escucha y rapidamente se voltea y te dispara, para despues matarte y eitar tomar riesgos.");
			break;
		case 4:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("La comienzas a golpear, pero la persona da batalla. Despues de una sangrienta batalla le das un golpe mortal en sus genitales, los cuales lo dejan en una posicion \n vunerable, donde procedes a romperle el cuello y matarlo");
			}
			else{
				System.out.println("La comienzas a golpear, pero la persona da batalla. Despues de una sangrienta batalla te da un golpe mortal en tus genitales, los cuales te dejan en una posicion \n vunerable, donde procede a romperte el cuello y matarte");
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
