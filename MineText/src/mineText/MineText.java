package mineText;
import java.util.Scanner;
public class MineText {
	public static Scanner sc = new Scanner(System.in);
	public static int score, record1, record2, record3, record4, record5;
	public static String nombre1, nombre2, nombre3, nombre4, nombre5;
	public static boolean correct, validation = true;
	public static void main(String[] args) {
		menu();
	}

	public static void newGame(){ //esta es la situación inicial de la cual se derivan las 5 historias
		int option = 0;
		int continuar;
		System.out.println("Despiertas por un golpeteo en la puerta y te levantas a checar qué es. Cuando abres la puerta ves que hay una criatura, \ncon apariencia humana pero sin vida, que está intentando morderte. Rápidamente cierras la puerta y:");
		System.out.println("1) Sales por la puerta trasera.");
		System.out.println("2) Agarras una pistola y sales por la puerta principal.");
		System.out.println("3) Te escondes en el sótano.");
		System.out.println("4) Te sales por la ventana de tu cuarto.");
		System.out.println("5) Abres la puerta y no haces nada");
		while(option != 1 || option != 2 || option != 3 || option != 4 || option != 5){ //validación
			try{
				option = sc.nextInt();
			}
			catch (Exception e){
				option = 0;
				sc.nextLine();
				System.out.println("Por favor ingrese un número válido.");
				option = sc.nextInt();
			}

			switch(option){ //este switch llama a los diferentes objetos dependiendo de la opción que se escogió al principio
			case 1:
				Round1a roundOneA = new Round1a(score);//Actualiza las variables del objeto
				correct = roundOneA.randomScenario();//Corre el randomScenario y regresa el correct
				score = roundOneA.getScore();//regresa el score
				records(score);

				Round2a roundTwoA = new Round2a(score);//Actualiza las variables del objeto
				if(correct){//Si la respuesta esta bien
					continuar = continuar(correct);//Corre el metodo que pregunta si deseas continuar
					if(continuar == 1 && correct){//Si escoges que si
						correct = roundTwoA.randomScenario();//hace lo mismo el el round pasado
						score = roundTwoA.getScore();
						records(score);
					}
				}
				else{//Sino se imprime esto y se actualiza el score
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();//Te regresa al menu principal.
					break;
				}
				Round3a roundThreeA = new Round3a(score);//Hace lo mismo que el round pasado
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundThreeA.randomScenario();
						score = roundThreeA.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round4a roundFourA = new Round4a(score);//Hace lo mismo que el round pasado
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFourA.randomScenario();
						score = roundFourA.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round5a roundFiveA = new Round5a(score);//Hace lo mismo que el round pasado
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFiveA.randomScenario();
						score = roundFiveA.getScore();
						records(score);
						menu();
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}
				break;

			case 2://Hace lo mismo que el case 1
				Round1b roundOneB = new Round1b(score);
				correct = roundOneB.randomScenario();
				score = roundOneB.getScore();
				records(score);

				Round2a roundTwoB = new Round2a(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1 && correct){
						correct = roundTwoB.randomScenario();
						score = roundTwoB.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}


				Round3a roundThreeB = new Round3a(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundThreeB.randomScenario();
						score = roundThreeB.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round4a roundFourB = new Round4a(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFourB.randomScenario();
						score = roundFourB.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round5a roundFiveB = new Round5a(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFiveB.randomScenario();
						score = roundFiveB.getScore();
						records(score);
						menu();
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}
				break;

			case 3://Hace lo mismo que el case 1
				Round1c roundOneC = new Round1c(score);
				roundOneC = new Round1c(score);
				correct = roundOneC.randomScenario();
				score = roundOneC.getScore();
				records(score);

				Round2c roundTwoC = new Round2c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1 && correct){
						correct = roundTwoC.randomScenario();
						score = roundTwoC.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}
				Round3c roundThreeC = new Round3c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundThreeC.randomScenario();
						score = roundThreeC.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round4c roundFourC = new Round4c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFourC.randomScenario();
						score = roundFourC.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round5c roundFiveC = new Round5c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFiveC.randomScenario();
						score = roundFiveC.getScore();
						records(score);
						menu();
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}
				break;

				//case 4: //Hace lo mismo que el case 1
				//Round1d roundOneD = new Round1d(score);

			case 5://Hace lo mismo que el case 1
				Round1e roundOneE = new Round1e(score);
				correct = roundOneE.randomScenario();
				score = roundOneE.getScore();
				records(score);

				Round2c roundTwoE = new Round2c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1 && correct){
						correct = roundTwoE.randomScenario();
						score = roundTwoE.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}
				Round3c roundThreeE = new Round3c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundThreeE.randomScenario();
						score = roundThreeE.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round4c roundFourE = new Round4c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFourE.randomScenario();
						score = roundFourE.getScore();
						records(score);
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}

				Round5c roundFiveE = new Round5c(score);
				if(correct){
					continuar = continuar(correct);
					if(continuar == 1){
						correct = roundFiveE.randomScenario();
						score = roundFiveE.getScore();
						records(score);
						menu();
					}
				}
				else{
					System.out.println("\nBuen intento! Tus puntos acumulados son: "+score+"\n");
					score = 0;
					menu();
					break;
				}
				break;
			default:
				System.out.println("Ingrese un número del 1 al 5");
			}
		}
	}

	private static int continuar(boolean correct) {
		int continuar = 0;
		validation = true;
		System.out.println("Quieres seguir jugando? 1 = Si, 2 = No");
		while(validation){//Validación
			try{
				continuar = sc.nextInt();
			}
			catch(Exception e){
				continuar = 0;
				sc.nextLine();
				System.out.println("Intenta de nuevo");
			}
			if(continuar == 1 || continuar == 2){//Si escoge 1 o 2 sale del loop
				validation = false;
			}
			else{//Sino sale eso
				System.out.println("Ingrese un número entre 1 y 2");
			}
		}//Si escoge no seguir imprime esto y te lleva al menu
		if(continuar == 2){
			System.out.println("\nBuen intento! Tus puntos acumulados son: "+score);
			score = 0;
			menu();
		}
		return continuar;
	}

	public static void records(int score) {
		if(score > record1){//Si es mas grande que el record actual
			record1 = score;//Se guarda la puntuación
			System.out.println("Ingresa tus iniciales: ");
			nombre1 = sc.next();//Se guardan las iniciales
		}
		else if(score > record2 && score < record1){//Lo mismo pero para el segundo lugar
			record2 = score;
			System.out.println("Ingresa tus iniciales: ");
			nombre2 = sc.next();
		}
		else if(score > record3 && score < record2){//Lo mismo pero para el tercer lugar
			record3 = score;
			System.out.println("Ingresa tus iniciales: ");
			nombre3 = sc.next();
		}
		else if(score > record4 && score < record3){//Lo mismo pero para el cuarto lugar
			record4 = score;
			System.out.println("Ingresa tus iniciales: ");
			nombre4 = sc.next();
		}
		else if(score > record5 && score < record4){//Lo mismo pero para el quinto lugar
			record5 = score;
			System.out.println("Ingresa tus iniciales: ");
			nombre5 = sc.next();
		}
	}

	public static void menu() {
		validation = true;
		int menu = 0;
		System.out.println("Menu");
		System.out.println("1. Empezar un nuevo juego");
		System.out.println("2. Checar records");
		System.out.println("3. Salir");
		while(validation){//validacion
			try{
				menu = sc.nextInt();
			}
			catch (Exception e){
				menu = 0;
				sc.nextLine();
				System.out.println("Ingrese un numero del 1-3");
			}
			if(menu >0 && menu < 4){
				validation = false;
			}
		}
		switch(menu){
		case 1:
			newGame();//corre el metodo newgame
			break;
		case 2://Imprime el los records
			System.out.println("Top 5 records:\n#1 "+nombre1+" "+record1+"\n#2 "+nombre2+" "+record2+"\n#3 "+nombre3+" "+record3+"\n#4 "+nombre4+" "+record4+"\n#5 "+nombre5+" "+record5);
			menu();
			break;
		case 3://Se sale de el juego
			break;
		default:
			System.out.println("Ingrese un número del 1 al 3");
		}	
	}
}