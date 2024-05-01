package Otros;

public class Coche2 {
    private int velocidad=0;
    
    public void acelerar(){
        velocidad++;
    }

    //Sobrecarga de metodos
    public void frenar(){
        frenar(1);
    }

    /*Frena el coche uma cierta cantidad
    @param v cantidad de velocidad a frenasr*/
    //Sobrecarga de metodos
    public void frenar(int v){
        velocidad -= v;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
}

class ImplementarClaseCoche{
    public static void main(String[] args){
        Coche2 coche = new Coche2();
        coche.acelerar();
        System.out.println("La velocidad es: " + coche.getVelocidad());
        coche.acelerar();
        coche.acelerar();
        coche.acelerar();
        System.out.println("La velocidad es: " + coche.getVelocidad());
        coche.frenar();
        System.out.println("La velocidad es: " + coche.getVelocidad());
    }
}