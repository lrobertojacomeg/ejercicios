package Otros;

public class Carro {
    String marca;
    String modelo;
    String placa;
    
    //Esto es un constructor de la clase Carro
    public Carro(){
    }
    
    public Carro(String marca, String modelo, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
    }
    
    public void setMarca(String marca){
        this.marca = marca;
    }
    
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
    public void setPlaca(String placa){
        this.marca = placa;
    }
    
    public String getMarca(){
        return this.marca;
    }
    public String getModelo(){
        return this.modelo;
    }
    public String getPlaca(){
        return this.placa;
    }
    public static void main(String[] args){
        Carro micarro = new Carro();
        
        Carro tucarro = new Carro("Toyota", "Yaris", "GPA-0173");
        System.out.println("Marca: " + tucarro.getMarca());
        System.out.println("Modelo: " + tucarro.getModelo());
        System.out.println("Placa: " + tucarro.getPlaca());
    }
}
