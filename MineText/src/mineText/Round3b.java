package mineText;
import java.util.Scanner;
public class Round3b {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation=true;

	public Round3b(int puntaje){
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
			System.out.println("Llegas a la ciudad y pronto te encuentras con un centro comercial en donde encuentras una tienda deportiva de la cadena 'Academy', un Wal-Mart, una tienda de joyería y un 7 Eleven. Debes elegir a cual entrar, pues escuchas zombis distantes y necesitas reabastecerte, entonces:");
			System.out.println("1) Entras a Wal-Mart");
			System.out.println("2) Entras al Seven Eleven");
			System.out.println("3) Entras a la joyería.");
			System.out.println("4) Entras al Academy");
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
		case 1:
			System.out.println("Al llegar a la ciudad te encuentras con un verdadero caos. Toda la gentes se pelea por provisiones y los zombis rondan por doquier. Ves un cenro comercial con la tienda deportiva 'Academy', una Joyería, un Walmart y un 7 Eleven. Debes entrar a alguno.");
			System.out.println("1) Entras a Wal-Mart");
			System.out.println("2) Entras al Seven Eleven");
			System.out.println("3) Entras a la joyería.");
			System.out.println("4) Entras al Academy");
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
			System.out.println("Cuando llegas a la ciudad la ves infestada de zombis todos te miran y te comienzan a perseguir así que necesitas esconderte en algún lugar. Encuentras un centro comercial y tienes que decidir a cual tienda entrar entonces decide:");
			System.out.println("1) Entras a Wal-Mart");
			System.out.println("2) Entras al Seven Eleven");
			System.out.println("3) Entras a la joyería.");
			System.out.println("4) Entras al Academy");
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
			System.out.println("Llegas a la ciudad y encuentras abierto un centro comercial. Al entrar encuentras un piso central te das cuenta que hay 4 tiendas con capacidad de entrar asi que:");
			System.out.println("1) Entras a Wal-Mart");
			System.out.println("2) Entras al Seven Eleven");
			System.out.println("3) Entras a la joyería.");
			System.out.println("4) Entras al Academy");
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
			System.out.println("En la ciudad es te encuentras con un muy oscuro centro comercial, donde encuentras varias tiendas que probablemente tienen provisiones.\n Escuchas ruidos en varias de las tiendas pero no tienes otra opción asi que:");
			System.out.println("1)Entras a Wal-Mart");
			System.out.println("2)Entras al Seven Eleven");
			System.out.println("3)Entras a la joyería.");
			System.out.println("4)Entras al Academy");
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
					System.out.println("Ingrese un n˙mero entre 1 y 4");
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
			System.out.println("Entras a la tienda y lo primero que ves es un caos, todos los sobrevivientes de la ciudad tuvieron la misma idea y se disparan para conseguir los recursos. Al entrar un grupo armado te mira y te dispara.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("El 7 Eleven está vacío por lo que encuentras nada más que sobras. Así que decides probar el Academy.\n Al ser una tienda deportiva, nadie se intereso en esa tienda, pero está llena de suplementos alimenticios y armas de cacería, buena elección ");
			}
			else{
				System.out.println("Buena elección. Los zombis, sin embargo no están de acuerdo. En el largo camino te ataca una manada.");
			}
			break;
		case 3:
			correct = false;
			System.out.println("La joyeria no tiene algún recurso vital que te ayude a sobrevivir, por lo que al entrar no encuentras nada, mala elección. Un zombie se te avienta encima en la tienda y no tienes tiempo de reaccionar.");
			break;
		case 4:
			correct = true;
			score = score+5;
			System.out.println("Al ser una tienda deportiva, nadie se intereso en esa tienda, pero está llena de suplementos alimenticios y armas de cacería, buena elección");
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



