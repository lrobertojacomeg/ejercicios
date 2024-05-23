package Ejercicios;

public class Cuadrado extends FigurasGeometricas{
    private int lado;
    
    public Cuadrado(int lado){
        this.lado = lado;
    }
    
    public void calcularPerimetro(){        
        int perimetro = this.lado * 4;
        System.out.println("El perimetro de " + this.getNombre() + " es " + perimetro);
    }
    
    public void calcularArea(){        
        int area = this.lado * this.lado;
        System.out.println("El area de " + this.getNombre() + " es " + area);
    }
    
    public static void main(String[] args){
        Cuadrado miCuadrado = new Cuadrado(7);        
        miCuadrado.setNombre("Cuadrado 1");        
        System.out.println("Nombre: " + miCuadrado.getNombre());
        miCuadrado.calcularPerimetro();
        miCuadrado.calcularArea();
    }
}
