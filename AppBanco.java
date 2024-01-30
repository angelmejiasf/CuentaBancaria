package CuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;

public class AppBanco {
	ArrayList<Cliente> Clientes;

	public AppBanco(ArrayList<Cliente> clientes) {
		super();
		Clientes = clientes;
	}

	public ArrayList<Cliente> getClientes() {
		return Clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		Clientes = clientes;
	}

	@Override
	public String toString() {
		return "AppBanco [Clientes=" + Clientes + "]";
	}

	public void nuevoCliente() {
		String nombre;
		String apellido;
		String dni;
		String codigo;
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduce el nombre del cliente: ");
		nombre = sc.next();
		System.out.println("Introduce el apellido del cliente: ");
		apellido = sc.next();
		System.out.println("Introduce el dni: ");
		dni = sc.next();
		System.out.println("Introduce el codigo del cliente: ");
		codigo = sc.next();

		Cliente newcli = new Cliente(codigo, dni, nombre, apellido);

		if (Clientes == null) {
			Clientes = new ArrayList<>();
		}

		Clientes.add(newcli);

		System.out.println("CLIENTE AÑADIDO!!!!");

	}

	public void mostrarClientes() {
		System.out.println(Clientes);
	}
	
	public void accesoClientes() {
		Scanner sc=new Scanner(System.in);
		String codigo;
		System.out.println("Introduce el codigo del cliente: ");
		codigo=sc.next();
		
		boolean clienteencontrado=false;
		for(Cliente clientes:Clientes) {
			if(clientes.getCodigoCliente().equals(codigo)) {
				System.out.println(clientes);
				clienteencontrado=true;
				clientes.mostrarcuentas();
			}else {
				System.out.println("El cliente no existe");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		Cuenta c1=new Cuenta("ES234211", "Nomina", "B123", "A123", 1000);
		Cuenta c2=new Cuenta("ES234212", "Ahorro", "B123", "A125", 10000);
		Cliente cli=new Cliente("B123", "123H", "Francisco", "Álvarez",new ArrayList<>());
		cli.getCuentas().add(c1);
		cli.getCuentas().add(c2);
		Cuenta c3=new Cuenta("ES234211", "Ahorro Boda", "B124", "A128", 14200);
		Cuenta c4=new Cuenta("ES234212", "Compartida", "B124", "A129", 17000);
		Cliente cli2=new Cliente("B124", "11111J", "Marta", "López", new ArrayList<>());
		cli2.getCuentas().add(c4);
		cli2.getCuentas().add(c3);
		
		
		
		
		int opcion=0;
		Scanner sc=new Scanner(System.in);
		
		AppBanco appBanco = new AppBanco(new ArrayList<>());
		appBanco.getClientes().add(cli);
		appBanco.getClientes().add(cli2);

		
		do {
			System.out.println("Selecciona una opcion");
			System.out.println("1.Alta Cliente");
			System.out.println("2.Mostrar Clientes");
			System.out.println("3.Acceso Cliente");
			System.out.println("4.Salir");
			opcion=sc.nextInt();
			
			switch(opcion) {
			case 1:
				appBanco.nuevoCliente();
				break;
			case 2:
				appBanco.mostrarClientes();
				break;
			case 3:
				appBanco.accesoClientes();
			}
			
			}while(opcion!=4);

	}

}
