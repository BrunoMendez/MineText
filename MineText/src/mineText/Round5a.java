package mineText;
import java.util.Scanner;
public class Round5a {
	public Scanner sc = new Scanner(System.in); //Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation = true;

	public Round5a(int puntaje){
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
			System.out.println("Muy apenas llegas al barco y al subirte inmediatamente empieza su partida. Una vez arriba ves que tu vecina había sobrevivido \ny logras identificar a algunas personas. De la nada sale un mensaje en las teles explicando la situación del país y la causa de los \nzombis. Por ahora estás a salvo, pero no sabes lo que pasará en el futuro. Has Sobrevivido. ¿Qué haces?");
			System.out.println("1) Llorar de felicidad.");
			System.out.println("2) Abrazar al primero que te encuentres.");
			System.out.println("3) Saltar del barco de la emoción.");
			System.out.println("4) Dormir porque estás muy cansado.");
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
			System.out.println("Vas corriendo y justo antes de que el barco parte logras saltar y lograr subirte. Por suerte ninguno de los zombis siguió ese paso \ny, los que no se cayeron al agua, se quedaron en la tierra. Una vez arriba ves que tu vecina había sobrevivido y logras identificar a algunas personas. De la nada sale un mensaje en las teles \nexplicando la situación del país y la causa de los zombis. Por ahora estás a salvo, pero no sabes lo que pasará en el futuro. Has Sobrevivido. ¿Qué haces?");
			System.out.println("1) Llorar de felicidad.");
			System.out.println("2) Abrazar al primero que te encuentres.");
			System.out.println("3) Saltar del barco de la emoción.");
			System.out.println("4) Dormir porque estás muy cansado.");
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
			System.out.println("Muy apenas llegas al barco y al subirte inmediatamente sale del puerto. Una vez arriba ves que tu vecina había sobrevivido y logras \nidentificar a algunas personas, entre ellas tu mejor amigo, por lo cual te pones muy feliz. De la nada sale un mensaje en las teles explicando la situación del país y la causa de los zombis. \nEsto te preocupa mucho ya que no sabes cómo le vas a hacer para sobrevivir en un barco, pero por ahora estás a salvo. Has Sobrevivido. ¿Qué haces?");
			System.out.println("1) Llorar de felicidad.");
			System.out.println("2) Abrazar al primero que te encuentres.");
			System.out.println("3) Saltar del barco de la emoción.");
			System.out.println("4) Dormir porque estás muy cansado.");
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
			System.out.println("Vas corriendo y justo antes de que el barco parte logras saltar y lograr subirte. Por suerte ninguno de los zombis siguió ese paso y, \nlos que no se cayeron al agua, se quedaron en la tierra. Una vez arriba ves que tu vecina había sobrevivido y logras identificar a algunas personas. Una vez que todos \nestaban reunidos en el comedor sale un video en las teles explicando la situación \ndel país y la causa del virus que crea a los zombis. Por ahora estás a salvo, pero no qué vas a hacer en el futuro cercano. \nHas Sobrevivido. ¿Qué haces?");
			System.out.println("1) Llorar de felicidad.");
			System.out.println("2) Abrazar al primero que te encuentres.");
			System.out.println("3) Saltar del barco de la emoción.");
			System.out.println("4) Dormir porque estás muy cansado.");
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
			System.out.println("Muy apenas llegas al barco y al subirte inmediatamente empieza su partida. Una vez arriba ves que tu vecina había sobrevivido y logras \nidentificar a algunas personas. Una vez que todos estaban reunidos en el comedor sale un video en las teles explicando la situación del país y la causa del \nvirus que crea a los zombis. Por ahora estás a salvo, pero no qué vas a hacer en el futuro cercano. Has Sobrevivido. ¿Qué haces?");
			System.out.println("1) Llorar de felicidad.");
			System.out.println("2) Abrazar al primero que te encuentres.");
			System.out.println("3) Saltar del barco de la emoción.");
			System.out.println("4) Dormir porque estás muy cansado.");
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
			score = score+25;
			System.out.println("Felicidades, has sobrevivido.\n");
			break;
		case 2:
			correct = true;
			score = score+25;
			System.out.println("Felicidades, has sobrevivido.\n");
			break;
		case 3:
			correct = true;
			score = score+25;
			System.out.println("Al saltar te avientan un salvavidas y te vuelven a subir al barco. Felicidades, has sobrevivido.\n");
			break;
		case 4:
			correct = true;
			score = score+25;
			System.out.println("Felicidades, has sobrevivido.\n");
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