package mineText;
import java.util.Scanner;
public class Round5b {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct, validation=true;

	public Round5b(int puntaje){
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
			System.out.println("Al salir de la tienda, con tu nueva arma se acerca un grupo de mujeres que te piden que las protejas. Dicen que perdieron a sus esposos cuando estos salieron juntos por alimentos y fueron emboscados. Las\n mujeres te ofrecen donde dormir así que tú:");
			System.out.println("1) Huyes pensando que en realidad te quieren asaltar y quitar tus armas y provisiones. ");
			System.out.println("2) Aceptas la oferta y decides vivir con ellas a cambio de refugio y comida. ");
			System.out.println("3) Aceptas la oferta pero en la noche las asesinas a todas y te quedas con sus artefactos ");
			System.out.println("4) Les dices que no confías en ellas y que no aceptas la oferta ");
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
			System.out.println("Cuando escapas de la tienda un grupo de mujeres bellísimas armadas se acercan a invitarte a unirte a su grupo, pues necesitan más miembros para que la comunidad siga entonces:");
			System.out.println("1) Huyes pensando que en realidad te quieren asaltar y quitar tus armas y provisiones. ");
			System.out.println("2) Aceptas la oferta y decides vivir con ellas a cambio de refugio y comida. ");
			System.out.println("3) Aceptas la oferta pero en la noche las asesinas a todas y te quedas con sus artefactos ");
			System.out.println("4) Les dices que no confías en ellas y que no aceptas la oferta ");
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
			System.out.println("Después de ese incidente en Academy encuentras a un grupo armado de gente, niños y niñas incluidos. Te preguntan que si quieres unirte a su grupo, pues necesitan más gente para seguir vivos. Por eso:");
			System.out.println("1) Huyes pensando que en realidad te quieren asaltar y quitar tus armas y provisiones. ");
			System.out.println("2) Aceptas la oferta y decides vivir con ellas a cambio de refugio y comida. ");
			System.out.println("3) Aceptas la oferta pero en la noche las asesinas a todas y te quedas con sus artefactos ");
			System.out.println("4) Les dices que no confías en ellas y que no aceptas la oferta ");
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
			System.out.println("Cuando sales de la tienda te encuentras a un grupo armado de latinos. Al enterarse que eres colombiano te ofrecen unirte a su grupo, confiando en ti. Miras que están armados hasta los dientes por lo que tienen ventajas de supervivencia, para lo cual:");
			System.out.println("1) Huyes pensando que en realidad te quieren asaltar y quitar tus armas y provisiones. ");
			System.out.println("2) Aceptas la oferta y decides vivir con ellas a cambio de refugio y comida. ");
			System.out.println("3) Aceptas la oferta pero en la noche las asesinas a todas y te quedas con sus artefactos ");
			System.out.println("4) Les dices que no confías en ellas y que no aceptas la oferta ");
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
			System.out.println("Cuando sales miras a lo lejos un campamento armado de gente y piensas si la mejor alternativa es unirteles, uno de ellos te ve y viene hacia ti preguntandote que si deseas entrar al grupo, por lo que tú: ");
			System.out.println("1) Huyes pensando que en realidad te quieren asaltar y quitar tus armas y provisiones. ");
			System.out.println("2) Aceptas la oferta y decides vivir con ellas a cambio de refugio y comida. ");
			System.out.println("3) Aceptas la oferta pero en la noche las asesinas a todas y te quedas con sus artefactos ");
			System.out.println("4) Les dices que no confías en ellas y que no aceptas la oferta ");
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
			System.out.println("Sí te querían asaltar, entonces te persigen. Cuando te encuentran te asesinas y mueres.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+25;
				System.out.println("Permaneces con el grupo y te salvas, vives el resto de tu vida en una comunidad que te mantiene a salvo, lo lograste.");
			}
			else{
				System.out.println("En la primera noche en tu estancia, deciden que representas mucho peligro para ellos por lo que te cortan la garganta.");
			}
			break;
		case 3:
			correct = true;
			score = score+25;
			System.out.println("Con tantas armas, tus posibilidades se aumentaron increiblemente. Vives el resto de tu vida como un rey y sobrevives. Felicidades.");
			break;
		case 4:
			correct = false;
			System.out.println("Al no haber aceptado te alejas y a las pocas semanas encuentras que hay cada vez más zombies, y tus oportunidades se acaban. Un dia sufres ataque masivo y mueres.");
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
