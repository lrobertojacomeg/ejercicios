package Ejercicios;

public class FigurasGeometricas {
    private String nombre;    

    public FigurasGeometricas(){
        //
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public FigurasGeometricas(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }    
    public void calcularPerimetro(){
        System.out.println("El perimetro es: ");
    }    
    public void calcularArea(){
        System.out.println("El area es: ");
    }
}


