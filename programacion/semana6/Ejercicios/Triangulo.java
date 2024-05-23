package Ejercicios;
public class Triangulo extends FigurasGeometricas{
    private int base;
    private int altura;
    private int lado1;
    private int lado2;
    private int lado3;   
    //constructor para inicar los valores
    public Triangulo(int base, int altura, int lado1, int lado2, int lado3){
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;                        
    }    
    public void calcularPerimetro(){
        int perimetro = lado1 + lado2 + lado3;
        System.out.println("El perimetro de " + this.getNombre() + " es " + perimetro);
    }
    public void calcularArea(){
        double area = base * altura /2;
        System.out.println("El area de " + this.getNombre() + " es " + area);
    }
    public static void main(String[] args){
        Triangulo miTriangulo = new Triangulo(3, 5, 4, 5, 4);        
        miTriangulo.setNombre("Triangulo3");        
        System.out.println("Nombre: " + miTriangulo.getNombre());
        miTriangulo.calcularPerimetro();
        miTriangulo.calcularArea();
    }
}
