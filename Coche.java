package packageEj1;

public class Coche {

		private int ruedas; //Al escribir private, aplicamos el proceso de encapsulación para limitar el acceso a esas propiedades de mi objeto.
		private int largo;
		private int ancho;
		private int motor;
		private int peso_plataforma;
		//las características anteriores son comunes, es decir, aplican para todos los coches en general.
		
		private String color;
		private int peso_total;
		private boolean asientos_cuero, climatizador;
		//las características anteriores son específicas, es decir aplican dependiendo de cada coche en particular.
		
		public Coche() {//Aquí establecemos "coche" como una clase (METODO CONSTRUCTOR) con las siguientes propiedades comunes:
			ruedas=4;
			largo=2000;
			ancho=300;
			motor=1600;
			peso_plataforma=500;		
		}
	public String dimeLargo() { //METODO GETTER(public+tipo de dato+nombre+()+return(debajo, seguido de la instrucción))
		return "El largo del coche es "+largo;
	}
	/*public void establece_color() { //METODO SETTER(public+void+nombre+()+instrucción)
		color="azul";*/

	public void establece_color(String color_coche) {
		color=color_coche;
	}
	
	public String dimeColor() { //GETTER color
		return "El color establecido para el coche es "+color+".";
	}
	
	public void configura_asientos(String asientos_cuero) { //SETTER asientos
	//Utilizamos la plabra reservada "this." para distinguir entre asientos_cuero.
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos(){ //GETTER asientos.
		if(asientos_cuero==true) {
			return "Se han establecido asientos de cuero para el coche.";
		}else {
			return "No se han establecido asientos de cuero para el coche.";
		}
	}

	public String dimeDatosGenerales() { //GETTER datos generales.
		return "La plataforma del coche tiene "+ruedas+" ruedas,"
				+ " mide "+largo/1000+" metros, con una ancho de "+ancho+" cm, "
				+ "y un peso de plataforma de "+peso_plataforma+"kg.";
	}
	
	public void configura_climatizador(String climatizador) {//SETTER climatizador.
		if(climatizador.equalsIgnoreCase("si")) { //En java nunca utilizar == para comparar strings.
			this.climatizador=true; 
		}else {
			this.climatizador=false;
		}
	}
	
	public String dimeClimatizador() { //GETTER climatizador.
		if(climatizador==true) {
			return "Se le ha incorporado climatizador al coche";
		}else {
			return "No se le ha incorporado climatizador al coche.";
		}
	}
	
	public String dimePesocoche() { //GETTER y SETTER al mismo tiempo.
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true) {
			peso_total=peso_total+20;
		}
		return "El peso del coche es "+peso_total+" kg.";
	}
	
	public int dimePrecio() { //GETTER precio
		int precio_final=10000;
		if(asientos_cuero==true) {
			precio_final=precio_final+2000;
		}
		if(climatizador==true) {
			precio_final=precio_final+1500;
		}
		return precio_final;
	}
}	
