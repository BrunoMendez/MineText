
package mineText;
import java.util.Scanner;
public class Round1d {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;
	
	public Round1d(int puntaje){
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
			System.out.println("Sales por la ventana de tu cuarto e instantaneamente cientos de zombis vienen hacia ti, entonces decides:");
			System.out.println("1) Golpearlos con una roca que ves en tu techo. ");
			System.out.println("2) Tratar de esquivarlos arriesgandote que de equivoques y mueras. ");
			System.out.println("3) No moverte con la premisa de que los zombis se guían por movimiento. ");
			System.out.println("4) Corres de manera impresionantemente rápida para tratar de escapar. ");
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
			System.out.println("Al salir por tu ventana descubres que un par de zombis horrorosos y apestosos se acercan a ti. Son zombis de niÒos pequeÒos y por lo tanto vomitas del asco. Entonces decides:");
			System.out.println("1) Golpearlos con una roca que ves en tu techo. ");
			System.out.println("2) Tratar de esquivarlos arriesgandote que de equivoques y mueras. ");
			System.out.println("3) No moverte con la premisa de que los zombis se guían por movimiento. ");
			System.out.println("4) Corres de manera impresionantemente rápida para tratar de escapar. ");
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
			System.out.println("Sales rapidamente por la ventana y ves un trio de zombis enormes y fortachones. Tienen pinta de ser r·pidos por lo que correr no es tan prometedor. Entonces decides:");
			System.out.println("1) Golpearlos con una roca que ves en tu techo. ");
			System.out.println("2) Tratar de esquivarlos arriesgandote que de equivoques y mueras. ");
			System.out.println("3) No moverte con la premisa de que los zombis se guían por movimiento. ");
			System.out.println("4) Corres de manera impresionantemente rápida para tratar de escapar. ");
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
			System.out.println("Cuando sales de tu cuarto por la ventana el riudo atrae a docenas de zombis hambrientos que desean destruirte los huesos. Con mucho miedo decides:");
			System.out.println("1) Golpearlos con una roca que ves en tu techo. ");
			System.out.println("2) Tratar de esquivarlos arriesgandote que de equivoques y mueras. ");
			System.out.println("3) No moverte con la premisa de que los zombis se guían por movimiento. ");
			System.out.println("4) Corres de manera impresionantemente rápida para tratar de escapar. ");
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
			System.out.println("Esta lloviendo y sales por la ventana rapidamente. Ves que un par de zombis extremadamente fuertes te quieren comer y por lo tanto tienes que reaccionar de manera rapida, por lo que decides:");
			System.out.println("1) Golpearlos con una roca que ves en tu techo. ");
			System.out.println("2) Tratar de esquivarlos arriesgandote que de equivoques y mueras. ");
			System.out.println("3) No moverte con la premisa de que los zombis se guían por movimiento. ");
			System.out.println("4) Corres de manera impresionantemente rápida para tratar de escapar. ");
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
				System.out.println("Son demasiados para tratar de matarlos con una roca, por lo que has muerto.");
				break;
			case 2:
				correct = chances();
				if(correct = true){
					score = score+15;
					System.out.println("Lograste esquivarlos a todos y has logrado escaparte.");
				}
				else{
					System.out.println("Te caes y en el piso trillones de zombis devoran tu cerebro.");
				}
				break;
			case 3:
				correct = false;
				System.out.println("LOS ZOMBIS NO SE GUIAN POR MOVIMIENTO, NO SON DINOSAURIOS, SE GUIAN POR OLFATO");
				break;
			case 4:
				correct = true;
				score = score+5;
				System.out.println("Pasas a la siguiente ronda.");
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
