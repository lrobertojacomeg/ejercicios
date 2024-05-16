class Empleado{
	private String nombre;
    private String direccion;
    private String telefono;
    private double sueldo;
    
    public void setNombre(String nombre){
    	this.nombre = nombre;
    }
    public String getNombre(){
    	return this.nombre;
    }
    public void setDireccion(String direccion){
    	this.direccion = direccion;
    }
    public String getDireccion(){
    	return this.direccion;
    }
    public void setTelefono(String telefono){
    	this.telefono = telefono;
    }
    public String getTelefono(){
    	return this.telefono;
    }
    public void setSueldo(double sueldo){
    	this.sueldo = sueldo;
    }
    public double getSueldo(){
    	return this.sueldo;
    }
    
    public Empleado(String nombre){
    	this.nombre = nombre;
    }
    public Empleado(String nombre, double sueldo){
    	this.nombre = nombre;
        this.sueldo = sueldo;
    }
    public Empleado(String nombre, String direccion, String telefono, double sueldo){
    	this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.sueldo = sueldo;    
    }    
    
    
    public double calcularRolDePagos(double horasExtras, double descuentos){
    	double totalAPagar = 0;
        totalAPagar = this.sueldo + horasExtras - descuentos;
        return totalAPagar;
    }
}

public class Main {
	
  public static void main(String[] args) {
	Empleado e = new Empleado("Pedro");    
    e.setDireccion("10 de agosto");
    e.setTelefono("098747474");
    e.setSueldo(1000);
    
    System.out.println("*************************************");
    System.out.println("****SISTEMA DE ROL DE PAGOS***");
    System.out.println("*************************************");
    
    System.out.println("\n\nLos datos del empleado son: ");
    System.out.println("Nombre: " + e.getNombre());
    System.out.println("Direccion: " + e.getDireccion());
    System.out.println("Telefono: " + e.getTelefono());
    System.out.println("Sueldo: " + e.getSueldo());
    System.out.println("Valor a pagar: " + e.calcularRolDePagos(10, 350));

	Empleado e2 = new Empleado("Andrea", "Calle Bolivar", null, 2000);          
    System.out.println("\n\nLos datos del empleado son: ");
    System.out.println("Nombre: " + e2.getNombre());
    System.out.println("Direccion: " + e2.getDireccion());
    System.out.println("Telefono: " + e2.getTelefono());
    System.out.println("Sueldo: " + e2.getSueldo());
    System.out.println("Valor a pagar: " + e2.calcularRolDePagos(5, 600));


	Empleado e3 = new Empleado("Luis", "Acacias", "098373737", 750);          
    System.out.println("\n\nLos datos del empleado son: ");
    System.out.println("Nombre: " + e3.getNombre());
    System.out.println("Direccion: " + e3.getDireccion());
    System.out.println("Telefono: " + e3.getTelefono());
    System.out.println("Sueldo: " + e3.getSueldo());
    System.out.println("Valor a pagar: " + e3.calcularRolDePagos(30, 250));

  }
  
  
}
