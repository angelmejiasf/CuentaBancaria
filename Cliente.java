package CuentaBancaria;

import java.util.ArrayList;

public class Cliente {
	private String codigoCliente;
	private String dni;
	private String nombre;
	private String apellidos;
	ArrayList<Cuenta> cuentas;

	public Cliente(String codigoCliente, String dni, String nombre, String apellidos, ArrayList<Cuenta> cuentas) {
		super();
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cuentas = cuentas;
	}

	public Cliente(String codigoCliente, String dni, String nombre, String apellidos) {
		super();
		this.codigoCliente = codigoCliente;
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	public String getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public ArrayList<Cuenta> getCuentas() {
		return cuentas;
	}

	public void setCuentas(ArrayList<Cuenta> cuentas) {
		this.cuentas = cuentas;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", dni=" + dni + ", nombre=" + nombre + ", apellidos="
				+ apellidos + "]";
	}

	public void mostrarcuentas() {
		  System.out.println("Cuentas del cliente " + nombre + " " + apellidos + ":");
		    if (cuentas.isEmpty()) {
		        System.out.println("El cliente no tiene cuentas.");
		    } else {
		        for (Cuenta cuenta : cuentas) {
		            System.out.println("Tipo de cuenta: " + cuenta.getCuenta());
		            System.out.println("Saldo: " + cuenta.getSaldo() + " €");
		            System.out.println("--------------------------");
		        }
		    }
	}

	public double totalCuentas() {
		double total = 0.0;
		for (Cuenta cuenta : cuentas) {
			total += cuenta.getSaldo();
		}
		return total;
	}
	
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES3456UI","Nomina","B123","A123",1000);
		Cuenta c2=new Cuenta("ES89785Y","Ahorro","B234","A234",10000);
		Cliente cli1=new Cliente("B123","123H","Francisco","Alvarez");
		cli1.setCuentas(new ArrayList<>());
		cli1.getCuentas().add(c1);
		cli1.getCuentas().add(c2);
		System.out.println(cli1);
		System.out.println("Cuentas bancarias: ");
		cli1.mostrarcuentas();
		System.out.println("Total: "+cli1.totalCuentas()+" €");
	}
}
