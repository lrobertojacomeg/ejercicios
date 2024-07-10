package Serial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializar {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);

        try (FileOutputStream fileOut = new FileOutputStream("persona.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(persona);
            System.out.println("La persona se ha serializado en persona.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }
    }
}
