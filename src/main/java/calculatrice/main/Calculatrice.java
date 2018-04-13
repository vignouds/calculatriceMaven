package calculatrice.main;

public class Calculatrice {
	float nombre1, nombre2;
	
	public Calculatrice(float n1, float n2){
		this.nombre1=n1;
		this.nombre2=n2;
	}
	
	public float	additioner() {
		return nombre1+nombre2;
	}
	
	public float	soustraire() {
		return nombre1-nombre2;
	}
	
	public float	multiplier() {
		return nombre1*nombre2;
	}
	
	public float	diviser() {
		return nombre1/nombre2;
	}
}
