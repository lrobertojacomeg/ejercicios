package Ejercicios;

public class Circulo extends FigurasGeometricas{
    private double radio;
    private double PI = 3.14;
    
    public Circulo(double radio){
        this.radio = radio;
    }
    
    public void calcularPerimetro(){
        double perimetro = PI * 2 * this.radio;
        System.out.println("El perimetro de " + this.getNombre() + " es " + perimetro);
    }
    public void calcularArea(){
        double area = PI * this.radio * this.radio ;
        System.out.println("El area de " + this.getNombre() + " es " + area);
    }

    public static void main(String[] args){
        Circulo miCirculo = new Circulo(2.5);        
        miCirculo.setNombre("Circulo2");        
        System.out.println("Nombre: " + miCirculo.getNombre());
        miCirculo.calcularPerimetro();
        miCirculo.calcularArea();
    }
}
