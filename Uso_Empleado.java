package packageEj1;

import java.util.*;

public class Uso_Empleado{
	public static void main(String[] args) {
		Empleado[]Empleados=new Empleado[3];
		Empleados[0]=new Empleado("Jose Mavarez", 1000, 2015, 5, 3);
		Empleados[1]=new Empleado("Ana Rangel", 1200, 2016, 6, 4);
		Empleados[2]=new Empleado("Adriana Ramirez", 1300, 2017, 7, 5);
		
		for(int i=0;i<3;i++) {
			Empleados[i].subeSueldo(20);
		}
		for(int i=0;i<3;i++) {
			System.out.println("EMPLEADO "+(i+1)+": "+Empleados[i].dameNombre()+". SUELDO: "+Empleados[i].dameSueldo()+" USD. FECHA DE ALTA: "+Empleados[i].dameAltacontrato());
			System.out.println("------------------------------------------------------------------------------------------------");
		}
	}
}

class Empleado{
	public Empleado(String name, double salary, int year, int month, int day) {
		nombre=name;
		sueldo=salary;
		GregorianCalendar calendario= new GregorianCalendar(year,month-1,day);
		altaContrato=calendario.getTime();
	}
	public String dameNombre() {
		return nombre;
	}
	public void subeSueldo(double porcentaje) {
		double aumento=(sueldo*porcentaje)/100;
		sueldo+=aumento;
	}
	public double dameSueldo() {
		return sueldo;
	}
	public Date dameAltacontrato() {
		return altaContrato;
	}

	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
}
