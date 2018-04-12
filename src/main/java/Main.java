import java.util.Scanner;
import org.apache.commons.lang3.StringUtils;
public class Main {

	public static void main(String[] args) {
		String nombre1 = " ", operateur = " ", nombre2 = " ";
		boolean test;
		float x=0, y=0, result=0;
		
		Scanner scan = new Scanner(System.in);
		
		// On rentre l'opération et on fait les tests
		do
		{
			System.out.println("Veuillez saisir un premier nombre");
			nombre1 = scan.nextLine();
		} while (StringUtils.isNumeric(nombre1)==false);
					
		do
		{
			System.out.println("Veuillez saisir un opérateur(+ - * /)");
			operateur = scan.nextLine();
			test = operateur.equals("+")||operateur.equals("-")||operateur.equals("*")||operateur.equals("/");
		} while (test == false);

		do
		{
			System.out.println("Veuillez saisir un second nombre");
			nombre2 = scan.nextLine();
		} while (StringUtils.isNumeric(nombre2)==false);
		
		x = Integer.parseInt(nombre1);
		y = Integer.parseInt(nombre2);
		
		Calculatrice calculatrice = new Calculatrice(x,y);
		
		//On réalise le calcul
		if(operateur.equals("+")) {
			result = calculatrice.additioner();
		}
		else if(operateur.equals("-")) {
			result = calculatrice.soustraire();
		}
		else if(operateur.equals("*")) {
			result = calculatrice.multiplier();
		}
		else if(operateur.equals("/")) {
			result = calculatrice.diviser();
		}
		else {
			System.out.println("Erreur");
		}	
		
		System.out.println("Résultat : " + result);
	}
}
