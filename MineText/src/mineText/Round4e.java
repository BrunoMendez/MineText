package mineText;
import java.util.Scanner;
public class Round4e {
	public static Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round4e(int puntaje){
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
			System.out.println("Te topaste con un grupo de zombis comiendo humanos y te les unes");
			System.out.println("Un grupo de humanos con pistolas viene hacia a ti. Hay mas zombis que humanos pero como quiera los quieren matar");
			System.out.println("Tu reaccion es: ");
			System.out.println("1) Unirteles a los zombis y pelear contra los humanos");
			System.out.println("2) Esconderte hasta que se acabe la pelea");
			System.out.println("3) Salir corriendo");
			System.out.println("4) Tratar de aliarte con los humanos");
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
			System.out.println("Te topaste con un grupo de zombis comiendo humanos y te les unes");
			System.out.println("Un grupo pequeño de policias esta disparandole a tu grupo. Tu reaccion es:");
			System.out.println("1) Pelear contra los policias");
			System.out.println("2) Esconderte en el bosque");
			System.out.println("3) Salir corriendo");
			System.out.println("4) Rendirte");
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
			System.out.println("Te topaste con un grupo de zombis comiendo humanos y te les unes");
			System.out.println("Es una trampa! Aparecen humanos con cuchillos y los empiezan a atacar. Tu reacion es:");
			System.out.println("1) Pelear contra ellos");
			System.out.println("2) Esconderte en el bosque");
			System.out.println("3) Salir corriendo");
			System.out.println("4) Atacarlos por detras");
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
			System.out.println("Te topaste con un grupo de zombis comiendo humanos y te les unes");
			System.out.println("Rick, Carl y Daryl de The Walking Dead aparecen y atacan a tu grupo. Tu reaccion es:");
			System.out.println("1) Atacarlos");
			System.out.println("2) Esconderte hasta que se acabe el ataque");
			System.out.println("3) Salir corriendo");
			System.out.println("4) Esconderte y atacar por atras");
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
			System.out.println("Te topaste con un grupo de zombis comiendo humanos y te les unes");
			System.out.println("Un grupo de humanos viene hacia ti... Son tus amigos! pero te estan atacando. Tu reacción es:");
			System.out.println("1) Atacarlos y comertelos");
			System.out.println("2) Resistirte el hambre y salir corriendo");
			System.out.println("3) Atacar a los zombis");
			System.out.println("4) Esconderte hasta que se acabe el ataque");
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
			System.out.println("Escoge un numero del 1-5");
		}
		return choices;	
	}


	public boolean checkAnswer (int scenario3, int choices2){
		switch(scenario3){
		case 0:
			switch(choices2){
			case 1:
				correct = true;
				score = score+5;
				System.out.println("Los zombis ganaron la batalla");
				break;
			case 3:
				System.out.println("Te mataron los humanos");
				correct = false;
				break;
			case 2:
				correct = chances();
				if(correct){
					score = score +15;
					System.out.println("Los zombis ganaron la batalla");
				}
				else{
					System.out.println("Te encontraron los humanos y te mataron");
				}
				break;
			case 4:
				System.out.println("Te mataron los humanos");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 1:
			switch(choices2){
			case 2:
				correct = true;
				score = score+5;
				System.out.println("Los zombis ganaron la batalla");
				break;
			case 4:
				System.out.println("Te mataron los humanos");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +15;
					System.out.println("Los zombis ganaron la batalla");
				}
				else{
					System.out.println("Te mataron los humanos");
				}
				break;
			case 3:
				System.out.println("Te encontraron y te mataron los humanos");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
				break;
			}
			break;
		case 2:
			switch(choices2){
			case 4:
				correct = true;
				score = score+5;
				System.out.println("Los zombis ganaron la batalla");
				break;
			case 2:
				System.out.println("Te encontraron y te mataron los humanos");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +15;
					System.out.println("Los zombis ganaron la batalla");
				}
				else{
					System.out.println("Te encontraron y te mataron los humanos");
				}
				break;
			case 3:
				correct = false;
				System.out.println("Te encontraron y te mataron los humanos");
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
				score = score+5;
				System.out.println("Sobreviviste pero fuiste el unico... No te metas con ellos");
				break;
			case 1:
				System.out.println("Te mataron... No te metas con ellos");
				correct = false;
				break;
			case 2:
				correct = chances();
				if(correct){
					score = score +15;
					System.out.println("Apenas sobreviviste... No te metas con ellos");
				}
				else{
					System.out.println("Te encontraron y te mataron");
				}
				break;
			case 4:
				System.out.println("Te mataron... No te metas con ellos");
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
				System.out.println("Los zombis ganaron y sobreviviste");
				break;
			case 3:
				System.out.println("Te mataron tus amigos");
				correct = false;
				break;
			case 1:
				correct = chances();
				if(correct){
					score = score +15;
				}
				else{
					System.out.println("Te atraparon... Estas muerto");
				}
				break;
			case 2:
				System.out.println("Te mataron tus amigos");
				correct = false;
				break;
			default:
				System.out.println("Intenta de nuevo");
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
