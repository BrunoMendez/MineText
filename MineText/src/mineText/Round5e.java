package mineText;
import java.util.Scanner;
public class Round5e {
	public static Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero en donde se explica todo.
	public int score, choices;
	public boolean correct;

	public Round5e(int puntaje){
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
			System.out.println("La ultima pelea! Estas ahora en un grupo enorme de zombis");
			System.out.println("Los ultimos humanos del mundo estan en una prision. Tu siguiente jugada es:");
			System.out.println("1) Atacar la prision por la puerta pricipal");
			System.out.println("2) Esperar hasta que las puertas se abran y atacar");
			System.out.println("3) Atacar la prision por todos lados");
			System.out.println("4) Dejarlos en paz");
			choices = sc.nextInt();
			break;
		case 1:
			System.out.println("La ultima pelea! Estas ahora en un grupo enorme de zombis");
			System.out.println("Los ultimos humanos del mundo estan en un bunker. Tu siguiente jugada es:");
			System.out.println("1) Esperar hasta que salgan");
			System.out.println("2) Forzar la puerta hasta que se abra");
			System.out.println("3) Dejarlos en paz");
			System.out.println("4) Ir a comer humanos muertos");
			choices = sc.nextInt();
			break;
		case 2:
			System.out.println("La ultima pelea! Estas ahora en un grupo enorme de zombis");
			System.out.println("Los ultimos humanos del planeta estan en una casa");
			System.out.println("1) Atacar la casa por atras");
			System.out.println("2) Atacar la casa por adelante");
			System.out.println("3) Esperar hasta que salgan");
			System.out.println("4) Dejarlos en paz");
			choices = sc.nextInt();
			break;
		case 3:
			System.out.println("La ultima pelea! Estas ahora en un grupo enorme de zombis");
			System.out.println("Los ultimos humanos estan en una guarida en una montaña. Tu plan es:");
			System.out.println("1) Subir la montaña y atacarlos");
			System.out.println("2) Dejarlos en paz");
			System.out.println("3) Esperar a que bajen y matarlos");
			System.out.println("4) Ir a comer humanos muertos");
			choices = sc.nextInt();
			break;
		case 4:
			System.out.println("La ultima pelea! Estas ahora en un grupo enorme de zombis");
			System.out.println("Los ultimos humanos estan en un pequeño pueblo con paredes protectoras. Tu plan es:");
			System.out.println("1) Atacar hasta derribar las puertas");
			System.out.println("2) Esperar hasta que salgan para atacar");
			System.out.println("3) Dejarlos en paz");
			System.out.println("4) Escalar las paredes");
			choices = sc.nextInt();
			break;
		default:
			System.out.println("Escoge un numero del 1-5");
		}
		return choices;	
	}


	public boolean checkAnswer (int scenario3, int choices2){
		switch(scenario3){
		case 0:
			switch(choices2){
			case 4:
				correct = true;
				score = score+25;
				System.out.println("Felicidades! Los zombis ganaron! Tienes 25 puntos extra por ganar el juego");
				break;
			case 2:
				System.out.println("Los humanos te mataron");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score +35;
					System.out.println("Los humanos te mataron");
				}
				else{
					System.out.println("Los humanos te mataron");
				}
				break;
			case 1:
				System.out.println("Felicidades! Los zombis ganaron! Tienes 35 puntos extra por ser valiente y ganar el juego");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 1:
			switch(choices2){
			case 1:
				correct = true;
				score = score+25;
				System.out.println("Los humanos salieron y los mataste. Felicidades! Los zombis ganaron. \nTienes 25 puntos extra por ganar el juego");
				break;
			case 2:
				System.out.println("Los humanos te mataron");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score +35;
					System.out.println("Felicidades! Los zombis ganaron y tienes 35 puntos extra ganar el juego");
				}
				else{
					System.out.println("Los humanos salieron y te mataron");
				}
				break;
			case 4:
				System.out.println("Los humanos salieron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 2:
			switch(choices2){
			case 2:
				correct = true;
				score = score+25;
				System.out.println("Felicidades! Los zombis ganaron. Tienes 25 puntos extra por ganar el juego ");
				break;
			case 4:
				System.out.println("Los humanos salieron y te mataron");
				correct = false;
				break;
			case 3:
				correct = chances();
				if(correct){
					score = score +35;
					System.out.println("Felicidades! Los humanos salieron y los zombis ganaron. \nTienes 35 puntos extra por ganar el juego");
				}
				else{
					System.out.println("Los humanos salieron y los mataron");
				}
				break;
			case 1:
				correct = false;
				System.out.println("Los humanos te mataron");
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 3:
			switch(choices2){
			case 3:
				correct = true;
				score = score+25;
				System.out.println("Felicidades! Los humanos bajaron y los zombis ganaron. \nTienes 25 puntos extra por ganar el juego");
				break;
			case 2:
				System.out.println("Los humanos bajaron y te mataron");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +35;
					System.out.println("Felicidades! El ataque fue exitoso y los zombis ganaron. \nTienes 35 puntos extra por ganar el juego");
				}
				else{
					System.out.println("Los humanos te mataron durante el ataque");
				}
				break;
			case 4:
				System.out.println("Los humanos bajaron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 4:
			switch(choices2){
			case 4:
				correct = true;
				score = score+5;
				System.out.println("Felicidades! El ataque fue exitoso y los zombis ganaron. \nTienes 25 puntos extra por ganar el juego");
				break;
			case 3:
				System.out.println("Los humanos salieron y te mataron");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +35;
					System.out.println("Felicidades! El ataque fue exitoso y los zombis ganaron. \nTienes 35 puntos extra por ganar el juego");
				}
				else{
					System.out.println("Los humanos te mataron durante el ataque");
				}
				break;
			case 2:
				System.out.println("Los humanos salieron y te mataron");
				correct = false;
				break;
			default:
				System.out.println("Intente de nuevo");
				break;
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


	public int getScore() {
		return score;
	}
}