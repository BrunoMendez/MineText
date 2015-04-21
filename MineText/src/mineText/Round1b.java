package mineText;
import java.util.Scanner;
public class Round1b {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round1b(int puntaje){
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
			System.out.println("Sales por la puerta principal, con una pistola ya cargada. Tu miedo, amplificados por los gritos que se escuchan afuera, te hace entrar en un estado de adrenalina. Así que golpeas la puerta para salir y disparas a todos los zombis que encuentras. Debido al miedo, gastas todas tus balas y uno comienza a correr hacia ti. Entonces:");
			System.out.println("1) No te mueves, acordándote que habías leído que los zombis se guían por el movimiento. ");
			System.out.println("2) Tratas de correr, confiado que eres más veloz que él.");
			System.out.println("3) Te armas de valor y lo tacleas, en el suelo le destruyes el cráneo a golpes.");
			System.out.println("4) Usas la pistola para golpear al zombi.");
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
			System.out.println("Sales por la puerta principal decidido. Tomas la pistola fuertemente porque sabes el peligro que estás apunto de correr. Al abrirla decenas de zombis se acercan a ti y para matarlos utilizas todo el cartucho, sin embargo todavía queda un zombi bastante grande y se acerca a ti entonces decides:");
			System.out.println("1) No te mueves, acordándote que habías leído que los zombis se guían por el movimiento. ");
			System.out.println("2) Tratas de correr, confiado que eres más veloz que él.");
			System.out.println("3) Te armas de valor y lo tacleas, en el suelo le destruyes el cráneo a golpes.");
			System.out.println("4) Usas la pistola para golpear al zombi.");
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
			System.out.println("Al dirigirte a la puerta principal te llenas de valor y cargas tu pistola. Decides llevarte pocas balas porque pesan mucho, y harán que moverte rápido no sea fácil. Al salir por la puerta le disparas a todos los zombis que es pero pronto no tienes balas. Mataste a la mayoría, pero un último se dirige a ti: entonces:");
			System.out.println("1) No te mueves, acordándote que habías leído que los zombis se guían por el movimiento. ");
			System.out.println("2) Tratas de correr, confiado que eres más veloz que él.");
			System.out.println("3) Te armas de valor y lo tacleas, en el suelo le destruyes el cráneo a golpes.");
			System.out.println("4) Usas la pistola para golpear al zombi.");
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
			System.out.println("Coges la pistola y le cargas con balas de petardos. La pistola es ultra efectiva pues al salir por la puerta, matas a todos los zombis de un balazo, pero como son tan caras no tienes tantas por lo que se te acaban. Un último zombi se dirige a ti entonces:");
			System.out.println("1) No te mueves, acordándote que habías leído que los zombis se guían por el movimiento. ");
			System.out.println("2) Tratas de correr, confiado que eres más veloz que él.");
			System.out.println("3) Te armas de valor y lo tacleas, en el suelo le destruyes el cráneo a golpes.");
			System.out.println("4) Usas la pistola para golpear al zombi.");
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
			System.out.println("Coges tu Glock fuertemente, derriba la puerta principal de manera contundente. Cientos de zombis se te acercan y los matas a todos, por lo que se te acaban las balas de manera rápida. Un último zombi se dirige a ti y decides:");
			System.out.println("1) No te mueves, acordándote que habías leído que los zombis se guían por el movimiento. ");
			System.out.println("2) Tratas de correr, confiado que eres más veloz que él.");
			System.out.println("3) Te armas de valor y lo tacleas, en el suelo le destruyes el cráneo a golpes.");
			System.out.println("4) Usas la pistola para golpear al zombi.");
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
			System.out.println("Los zombis no se guían por movimiento, te come.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("No eres más veloz que él, pero en el proceso lo confundes corriendo en circulos \n para marearlo, y lo pierdes.");
			}
			else{
				System.out.println("No eres más veloz que él, te come.");
			}
			break;
		case 3:
			correct = false;
			System.out.println("El zombi muere, pero en el proceso de golpearlo te cortas, causando una infección y \nconvirtiéndote en zombi, ya que la infección se transmite por contacto.");
			break;
		case 4:
			correct = true;
			score = score+5;
			System.out.println("La cabeza del zombi es destruida y su cuerpo se desploma al piso.");
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