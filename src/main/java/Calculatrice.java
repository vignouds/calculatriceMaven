
public class Calculatrice {
	int nombre1, nombre2;
	
	public Calculatrice(int n1, int n2){
		this.nombre1=n1;
		this.nombre2=n2;
	}
	
	public int	additioner() {
		return nombre1+nombre2;
	}
	
	public int	soustraire() {
		return nombre1-nombre2;
	}
	
	public int	multiplier() {
		return nombre1*nombre2;
	}
	
	public int	diviser() {
		return nombre1/nombre2;
	}
}
