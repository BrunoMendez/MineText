package mineText;
import java.util.Scanner;
public class Round4c {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round4c(int puntaje){
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
			System.out.println("Vas caminando por la calle al noroeste y te encuentras a un grupo de gente que también está \nescapando de los zombis. Te invitan a unirte a su grupo. ¿Qué haces?");
			System.out.println("1) Te unes al grupo.");
			System.out.println("2) Los ignoras y sigues caminando.");
			System.out.println("3) Te unes al grupo y les robas sus cosas en la noche.");
			System.out.println("4) Los matas a todos y te quedas con sus cosas.");
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
			System.out.println("Vas caminando por la calle al noroeste y te encuentras a un grupo de gente que también está \nescapando de los zombis. Empiezas a hablar con ellos y te invitan a unirte a su grupo. ¿Qué haces?");
			System.out.println("1) Te unes al grupo.");
			System.out.println("2) Los ignoras y sigues caminando.");
			System.out.println("3) Te unes al grupo y les robas sus cosas en la noche.");
			System.out.println("4) Los matas a todos y te quedas con sus cosas.");
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
			System.out.println("Vas caminando por la calle al noroeste y te encuentras a un grupo de gente que también está \nescapando de los zombis. Empiezas a hablar con ellos y se sientan a comer. Te comparten de su comida y te invitan a unirte a su grupo. ¿Qué haces?");
			System.out.println("1) Te unes al grupo.");
			System.out.println("2) Los ignoras y sigues caminando.");
			System.out.println("3) Te unes al grupo y les robas sus cosas en la noche.");
			System.out.println("4) Los matas a todos y te quedas con sus cosas.");
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
			System.out.println("Vas caminando por la calle al noroeste y te encuentras a un grupo de gente que también está \nescapando de los zombis. Te das cuenta que tienen muchas armas y comida. Te invitan a unirte a su grupo. ¿Qué haces?");
			System.out.println("1) Te unes al grupo.");
			System.out.println("2) Los ignoras y sigues caminando.");
			System.out.println("3) Te unes al grupo y les robas sus cosas en la noche.");
			System.out.println("4) Los matas a todos y te quedas con sus cosas.");
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
			System.out.println("Vas caminando por la calle al noroeste y te encuentras a un grupo de gente que también está \nescapando de los zombis. Después de platicar un rato te invitan a unirte a su grupo. ¿Qué haces?");
			System.out.println("1) Te unes al grupo.");
			System.out.println("2) Los ignoras y sigues caminando.");
			System.out.println("3) Te unes al grupo y les robas sus cosas en la noche.");
			System.out.println("4) Los matas a todos y te quedas con sus cosas.");
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
			System.out.println("Te unes a ellos pero nadie sabía que uno estaba infectado, pero los efectos del veneno del zombi no se habían presentado. \nEn la noche se convierte y muerde a todos los del grupo. Has Muerto.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Te salvas, ya que nadie sabía que uno de los miembros estaba infectado y se \niba a convertir en zombi. Pasas a la siguiente ronda.");
			}
			else{
				System.out.println("Sigues caminando y no te das cuenta que de la nada te empieza a perseguir un zombi que estaba escondido. \nTe logra morder antes de que reaccionas. Has Muerto.");
			}
			break;
		case 3:
			correct = false;
			System.out.println("Te esperas a que todos duerman y empiezas a robarte una pistola, pero el de alado se da cuenta y te dispara. Has Muerto.");
			break;
		case 4:
			correct = true;
			score = score+5;
			System.out.println("Te unes a su grupo y después de un rato los matas a todos con la pistola que habías agarrado de tu casa. Ahora \ntienes comida y armas. Pasas a la siguiente ronda.");
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