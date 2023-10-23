package ejerciciofiguras;

public class Figura {
	
	private String nombre;
	private String color;
	private double perimetro;
	private double area;
	//hemos creado dentro de la clase figura los siguientes parametros con las caracteristicas en comun de las figuras a realizar 
	public Figura(String nombre,String color, double perimetro, double area) {
		this.nombre= nombre;
		this.color=color;
		this.perimetro= perimetro;
		this.area= area;
	}
	// vamos a invocar a los metodos getter y set para devolver los valores de las caracteristicas de cada figura
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setColor(String color) {
		this.color=color;
	}
	public String getColor() {
		return this.color;
	}
    public void setPerimetro(double perimetro) {
    	this.perimetro = perimetro;
    }
    public double getPerimetro() { 
    	return this.perimetro;
    }
    public void setArea (double area) {
    	this.area = area;
    }
    public double getArea() {
    	return this.area ;
    }
//en este apartado invocamos el siguiente metodo publico par que nos imprima lo siguiente
    public void dime_caracteristicas(){
    	System.out.println("nombre:" + nombre + " color:" + color + " perimetro" + perimetro + " area"+ area);	
    }
    
    
}
