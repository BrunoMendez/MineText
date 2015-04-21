package mineText;
import java.util.Scanner;
public class Round2b {
	public Scanner sc = new Scanner(System.in);//Este objeto funciona igual que el primero, donde se explica todo.
	public int score, choices;
	public boolean correct,validation=true;

	public Round2b(int puntaje){
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
			System.out.println("Al haberte deshecho del zombi piensas que es hora de cambiar de plan, recuerdas que estás en un suburbio alejado, donde no hay nada de provisiones. Hace dos días una mujer \nte dijo que la ciudad estaba hecha un cáos pero que habían provisiones. Entonces decides:");
			System.out.println("1) Regresar a tu casa, donde te encerrarás y esperarás ayuda.");
			System.out.println("2) Decides ir a la ciudad más lejana, pero con mayor probabilidad de encontrar provisiones.");
			System.out.println("3) Trataras de ir hacia el campo, donde esperas encontrar alguna granja en donde puedas esconderte.");
			System.out.println("4) Te diriges hacia la ciudad más cercana, donde esperas encontrar provisiones.");
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
			System.out.println("Después de haberte deshecho de el zombi, estás fuera de peligro. Evalúas tus opciones. Estás en un suburbio, alejado de la ciudad, donde no hay supermercados o centros de abastecimiento, entonces decides:");
			System.out.println("1) Regresar a tu casa, donde te encerrarás y esperarás ayuda.");
			System.out.println("2) Decides ir a la ciudad más lejana, pero con mayor probabilidad de encontrar provisiones.");
			System.out.println("3) Trataras de ir hacia el campo, donde esperas encontrar alguna granja en donde puedas esconderte.");
			System.out.println("4) Te diriges hacia la ciudad más cercana, donde esperas encontrar provisiones.");
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
			System.out.println("Vives en Roswell, un suburbio cercano a la ciudad de Atlanta. Sabes que tus posibilidades están en Atlanta, pero el riesgo de que haya gente peleándose por recursos te hace dudar. Recuerdas haber visto en las noticias que el campo era uno de los lugares más seguros en los cual esconderse:");
			System.out.println("1) Regresar a tu casa, donde te encerrarás y esperarás ayuda.");
			System.out.println("2) Decides ir a la ciudad más lejana, pero con mayor probabilidad de encontrar provisiones.");
			System.out.println("3) Trataras de ir hacia el campo, donde esperas encontrar alguna granja en donde puedas esconderte.");
			System.out.println("4) Te diriges hacia la ciudad más cercana, donde esperas encontrar provisiones.");
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
			System.out.println("Habiendo acabado de matar al zombi empieza a llover, y te das cuenta que necesitas comer pronto pues llevas una semana sin comer,  así que consideras salir de tu suburbio. Después de pensarlo un largo rato decides:");
			System.out.println("1) Regresar a tu casa, donde te encerrarás y esperarás ayuda.");
			System.out.println("2) Decides ir a la ciudad más lejana, pero con mayor probabilidad de encontrar provisiones.");
			System.out.println("3) Trataras de ir hacia el campo, donde esperas encontrar alguna granja en donde puedas esconderte.");
			System.out.println("4) Te diriges hacia la ciudad más cercana, donde esperas encontrar provisiones.");
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
			System.out.println("Llevas algunas semanas sin comer y te empieza a gruñir el estomago, sí que decides cambiar tu estrategia y hacer algo más. Consideras tus opciones, ya que son limitadas en el suburbio que vives, sin embargo tu casa sí ofrece algo de protección. Después de pensarlo decides:");
			System.out.println("1) Regresar a tu casa, donde te encerrarás y esperarás ayuda.");
			System.out.println("2) Decides ir a la ciudad más lejana, pero con mayor probabilidad de encontrar provisiones.");
			System.out.println("3) Trataras de ir hacia el campo, donde esperas encontrar alguna granja en donde puedas esconderte.");
			System.out.println("4) Te diriges hacia la ciudad más cercana, donde esperas encontrar provisiones.");
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
			System.out.println("La casa te ofrece un buen refugio y no sufres ni un solo ataque. Sin embargo mueres de hambre pues no tienes provisiones.");
			break;
		case 2:
			correct = chances();
			if(correct = true){
				score = score+15;
				System.out.println("Lo lograste, te arriesgaste a ir a una ciudad más lejana y no viste a un solo zombi.");
			}
			else{
				System.out.println("Buena elección. Los zombis, sin embargo no están de acuerdo. En el largo camino te ataca una manada.");
			}
			break;
		case 3:
			correct = false;
			System.out.println("El campo está infestado de zombis, y al llegar todos te huelen y mueres, pues ya no tienes energia para huir.");
			break;
		case 4:
			correct = true;
			score = score+5;
			System.out.println("Te diriges a la ciudad y no encuentras resistencia en el camino, lo lograste.");
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
