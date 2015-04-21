package mineText;
import java.util.Scanner;
public class Round4b {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round4b(int puntaje){
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
			System.out.println("En el Academy, encuentras la suficiente cantidad de comida en suplementos alimenticios, y en la área de cacería encuentras una ballesta, la cual te llevas, junto con sus flechas. De repente escuchas un tumulto de zombis entrando a la tienda, escuchas al menos 50, más de los que jamás te has enfrentado, entras en pánico y entonces:");
			System.out.println("1) Te escondes bajo una de las cajas registradoras, no hay rastro de ti.");
			System.out.println("2) Corres a la parte de atrás de la tierra, para ver si hay una salida de emergencia, arriesgándote a que no haya y quedes atrapado.");
			System.out.println("3) Decides escalar uno de los estantes y comienzas a disparar desde arriba.");
			System.out.println("4) Decides enfrentárteles, creyendo que tienes suficientes flechas para todos y es la única manera de salir vivo.");
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
			System.out.println("En el Academy te encuentras con muchísimas posibilidades, pues encuentras muchas armas, agarras un arco y flecha con los que puedes eciclar las flechas. Escuchas que la puerta se estremece de manera increiblemente fuerte, ves a cientos de zombies, más de los que jamás te has enfrentado y decides:");
			System.out.println("1) Te escondes bajo una de las cajas registradoras, no hay rastro de ti.");
			System.out.println("2) Corres a la parte de atrás de la tierra, para ver si hay una salida de emergencia, arriesgándote a que no haya y quedes atrapado.");
			System.out.println("3) Decides escalar uno de los estantes y comienzas a disparar desde arriba.");
			System.out.println("4) Decides enfrentárteles, creyendo que tienes suficientes flechas para todos y es la única manera de salir vivo.");
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
			System.out.println("En el Academy encuentras muchos alimentos y suplementos. También encuentras una resortera con balines de acero de cacería y es perfecto porque puedes usar los balines muchas veces. De repente la puerta se estremece y cientos de zombis entras, jamás habías visto tantos juntos así que ");
			System.out.println("1) Te escondes bajo una de las cajas registradoras, no hay rastro de ti.");
			System.out.println("2) Corres a la parte de atrás de la tierra, para ver si hay una salida de emergencia, arriesgándote a que no haya y quedes atrapado.");
			System.out.println("3) Decides escalar uno de los estantes y comienzas a disparar desde arriba.");
			System.out.println("4) Decides enfrentárteles, creyendo que tienes suficientes flechas para todos y es la única manera de salir vivo.");
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
			System.out.println("Al llegar al Academy una persona que trabaja ahí te da un arco y flecha, dice que es el último sobreviviente y que en la tienda ese arco es el último. De repente cientos de zombis entran a la tienda y se devoran a tu único amigo. Debes reaccionar rápido y: ");
			System.out.println("1) Te escondes bajo una de las cajas registradoras, no hay rastro de ti.");
			System.out.println("2) Corres a la parte de atrás de la tierra, para ver si hay una salida de emergencia, arriesgándote a que no haya y quedes atrapado.");
			System.out.println("3) Decides escalar uno de los estantes y comienzas a disparar desde arriba.");
			System.out.println("4) Decides enfrentárteles, creyendo que tienes suficientes flechas para todos y es la única manera de salir vivo.");
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
			System.out.println("En el academy encuentras varias armas incluyendo una ballesta con flechas explosivas. También encuentras mucha comida en suplementos alimenticios. De repente entran miles de zombies a la tienda, más de los que jamás has visto. Matas a miles con tus flechas explosivas pero cientos más se dirigen a ti. Entonces:");
			System.out.println("1) Te escondes bajo una de las cajas registradoras, no hay rastro de ti.");
			System.out.println("2) Corres a la parte de atrás de la tierra, para ver si hay una salida de emergencia, arriesgándote a que no haya y quedes atrapado.");
			System.out.println("3) Decides escalar uno de los estantes y comienzas a disparar desde arriba.");
			System.out.println("4) Decides enfrentárteles, creyendo que tienes suficientes flechas para todos y es la única manera de salir vivo.");
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
			System.out.println("Los zombis se guían por olfato, entonces te encuentran casi instantaneamente y te hacen pedazos.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Sí hay puerta por lo que te salvas y te logras escapar.");
			}
			else{
				System.out.println("Si hay puerta trasera pero está cerrada con llave, por lo que todos los zombis te persiguen sin cesar.");
			}
			break;
		case 3:
			correct = false;
			System.out.println("Las flechas explosivas se te acaban rápido y los zombis comienzan a escalar.");
			break;
		case 4:
			correct = true;
			score = score+5;
			System.out.println("Al enfrentarteles los matas a todos, gracias a tus flechas explosivas.");
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

