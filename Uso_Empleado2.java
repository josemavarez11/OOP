package packageEj1;

import java.util.*;

public class Uso_Empleado2{
	public static void main(String[] args){
		Jefatura jefe_RRHH=new Jefatura("Andres Perez", 5000, 2008, 7, 7);
		jefe_RRHH.setIncentivo(1500);
		
		Empleado[]Empleados=new Empleado[6];
		Empleados[0]=new Empleado("Jose Mavarez", 1000, 2015, 5, 3);
		Empleados[1]=new Empleado("Ana Rangel", 1200, 2016, 6, 4);
		Empleados[2]=new Empleado("Adriana Ramirez", 1300, 2017, 7, 5);
		Empleados[3]=new Empleado("Eli Mora", 2000, 2009, 11, 24);
		Empleados[4]=jefe_RRHH; //PRINCIPIO DE SUSTITUCION.
		Empleados[5]=new Jefatura("Paola Rojas", 3500, 2019, 2, 15);
		
		Jefatura jefe_Finanzas=(Jefatura)Empleados[5];
		jefe_Finanzas.setIncentivo(7000);
			
		for(Empleado e:Empleados){
			e.subeSueldo(5);
		}
		
		for(Empleado e:Empleados){
			System.out.println("Nombre: "+e.dameNombre()+ ". SUELDO: "+e.dameSueldo()+" USD. FECHA DE ALTA: "+e.dameAltacontrato());
			System.out.println("------------------------------------------------------------------------------------------------");
		}
	}
}

class Empleado{
	public Empleado(String name, double salary, int year, int month, int day){
		nombre=name;
		sueldo=salary;
		GregorianCalendar calendario= new GregorianCalendar(year,month-1,day);
		altaContrato=calendario.getTime();
		IdSiguiente++;
		Id=IdSiguiente;
	}
	
	public Empleado(String nombre){
		this(nombre, 30000, 2022, 1, 1);
	}
	
	public String dameNombre(){
		return nombre+". ID: "+Id;
	}
	public void subeSueldo(double porcentaje){
		double aumento=(sueldo*porcentaje)/100;
		sueldo+=aumento;
	}
	public double dameSueldo(){
		return sueldo;
	}
	public Date dameAltacontrato(){
		return altaContrato;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int Id;
	private static int IdSiguiente;
}

class Jefatura extends Empleado{
	
	public Jefatura(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
	}
	
	public void setIncentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo() {
		double sueldojefe=super.dameSueldo();
		return sueldojefe+incentivo;
	}
	
	private double incentivo;
}

