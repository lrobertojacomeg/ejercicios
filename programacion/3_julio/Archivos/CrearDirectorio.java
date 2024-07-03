package Archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CrearDirectorio {
    public static void main(String[] args) {
        Path directorio = Paths.get("d://tmp/nuevo_directorio");
        try {
            Files.createDirectory(directorio);
            System.out.println("Directorio creado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

