package calculatrice.main;

/**
 * Classe Calculatrice pour cr�er un objet calculatrice et appliquer les m�thodes de calcul dessus
 * @author S�bastien Vignoud
 *
 */
public class Calculatrice {
	float nombre1, nombre2;
	
	/**
	 * Contructeur de la calcuatrice avec 2 float en param 
	 * @param n1
	 * @param n2
	 */
	public Calculatrice(float n1, float n2){
		this.nombre1=n1;
		this.nombre2=n2;
	}
	
	/**
	 * Fonction qui additionne les 2 float pass�s en param�tre de la calcuatrice
	 */
	public float	additioner() {
		return nombre1+nombre2;
	}
	
	/**
	 * Fonction qui soustrait les 2 float pass�s en param�tre de la calcuatrice
	 */
	public float	soustraire() {
		return nombre1-nombre2;
	}
	
	/**
	 * Fonction qui multiplie les 2 float pass�s en param�tre de la calcuatrice
	 */
	public float	multiplier() {
		return nombre1*nombre2;
	}
	
	/**
	 * Fonction qui divise les 2 float pass�s en param�tre de la calcuatrice
	 */
	public float	diviser() {
		return nombre1/nombre2;
	}
}
