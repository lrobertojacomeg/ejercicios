package Serial;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserializar {
    public static void main(String[] args) {
        Persona persona = null;

        try (FileInputStream fileIn = new FileInputStream("persona.ser");
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            persona = (Persona) in.readObject();
            System.out.println("La persona deserializada es: " + persona);
        } catch (IOException | ClassNotFoundException i) {
            i.printStackTrace();
        }
    }
}
