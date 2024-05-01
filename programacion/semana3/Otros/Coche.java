package Otros;

public class Coche {
    //atributos
    String marca;
    double vel_max;
    int potencia;
    String tipo_carburante;
    double velocidad;
    double aceleracion;
    
    void arrancar(){
        System.out.println("Arrancando el coche");
    }
    
    void frenar(){
        System.out.println("Frenando el coche");
    }
    
    void acelerar(){
        System.out.println("Acelerando el coche");
    }
    
    void girar_derecha(){
        System.out.println("Girando a la derecha");
    }
    
    public static void main(String[] args){
        Coche c = new Coche();
        c.arrancar();
        c.acelerar();
        c.girar_derecha();
        c.frenar();
    }
}
