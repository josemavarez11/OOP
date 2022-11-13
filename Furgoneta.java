package packageEj1;

public class Furgoneta extends coche {
	
	public Furgoneta(int plazas_extras, int capacidad_carga){
		super(); //Con super llamamos al constructor de la clase padre.
		this.capacidad_carga=capacidad_carga;
		this.plazas_extras=plazas_extras;
	}
	public String getDatosFurgoneta() {
		return "La capacidad de carga es de "+capacidad_carga+" kg. Las plazas extras son "+plazas_extras+".";
	}
	
	private int capacidad_carga;
	private int plazas_extras;
}
