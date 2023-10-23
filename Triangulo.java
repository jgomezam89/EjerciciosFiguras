package ejerciciofiguras;

		public class Triangulo extends Figura {
	private double lado1;
	private double lado2;
	private double lado3;
	private double altura;
	//realiamos mediante el siguiente metodo get y set que nos devuelva los valores mencionados 
		public Triangulo() {
			super("Triangulo", "rojo", 10, 20);
			lado1= 8;
			lado2= 8;
			lado3=8;
			altura=6.93;
		}
		
		
		
		public void setLado1(double lado1) {
			this.lado1 = lado1;
		}
		
		public double getLado1() {
			return this.lado1;}
		
		public void setLado2(double lado2) {
		     this.lado2 =lado2;
		}
		public double getLado2() {
		 return this.lado2;
		}
		public void setLado3(double lado3) {
			this.lado3= lado3;
		}
		public double getLado3() {
			return this.lado3;
			}
		public void setAltura(double altura) {
			this.altura =altura;
		}
		public double getAltura() {
			return this.altura;
		}
		public void getTipoTriangulo () {
			System.out.println("es un triangulo isosceles");
		}
		
		
}

