package CuentaBancaria;

public class Cuenta {
	private String IBAN;
	private String cuenta;
	private String codigotitular;
	private String codigoautorizado;
	double saldo;
	
	public Cuenta(String iBAN, String cuenta, String codigotitular, String codigoautorizado, double saldo) {
		super();
		IBAN = iBAN;
		this.cuenta = cuenta;
		this.codigotitular = codigotitular;
		this.codigoautorizado = codigoautorizado;
		this.saldo = saldo;
	}
	public String getIBAN() {
		return IBAN;
	}
	public void setIBAN(String iBAN) {
		IBAN = iBAN;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	public String getCodigotitular() {
		return codigotitular;
	}
	public void setCodigotitular(String codigotitular) {
		this.codigotitular = codigotitular;
	}
	public String getCodigoautorizado() {
		return codigoautorizado;
	}
	public void setCodigoautorizado(String codigoautorizado) {
		this.codigoautorizado = codigoautorizado;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	double retirarsaldo(double cantidad) {
		  if (cantidad <= saldo) {
	            saldo -= cantidad;
	        }else {
	        	System.out.println("Saldo insuficiente");
	        }
	        return saldo;
		
	}
	
	public void ingresar(double cantidad) {
        saldo += cantidad;
    }
	@Override
	public String toString() {
		return "Cuenta [IBAN=" + IBAN + ", cuenta=" + cuenta + ", codigotitular=" + codigotitular
				+ ", codigoautorizado=" + codigoautorizado + ", saldo=" + saldo + "]";
	}
	
	public static void main(String[] args) {
		Cuenta c=new Cuenta("ES3456YY67654","Nomina","B123","A123",1000);
		System.out.println(c);
		c.ingresar(200);
		System.out.println("Has ingresado 200 €");
		System.out.println("Saldo actual: "+c.getSaldo()+" €");
		System.out.println("Quieres retirar 1600 €");
		c.retirarsaldo(1300);
		c.retirarsaldo(300);
		
		System.out.println("Saldo actual: "+c.getSaldo()+" €");
		
	}
}
