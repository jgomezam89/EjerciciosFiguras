package ejerciciofiguras;
//ponemos el siguiente metodo dentro de la clase rectangulo con la extension a clase de figura que es donde tenemos todas las caracteristicas comunes de ambos
public class Rectangulo extends Figura {
	// invocamos al metodo double para obtener los datos tanto del ancho como de alto
	private double ancho;
	private double alto;
	//realiamos mediante el siguiente metodo get y set que nos devuelva los valores mencionados y que sea verdadero o falso si el ancho es igual que el alto
	public Rectangulo() {
		super("Rectangulo", "azul", 20, 10);
		ancho=0;
		alto=0;
	}
	public void setAncho(double ancho) {
		this.ancho=ancho;
	}
	public double getAncho () {
		return this.ancho;
	}
	public void setAlto(double alto) {
		this.alto =alto;
	}
	public double getAlto() {
		return this.alto;
	}
	
	public boolean comprobarCuadrado() {
		if(ancho == alto) {
			return true;
		}else {
			return false;
		}
	}
	
	
	
}
