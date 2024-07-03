package Archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class EliminarArchivo {
    public static void main(String[] args) {
        Path archivo = Paths.get("d://tmp/archivo.txt");
        try {
            Files.delete(archivo);
            System.out.println("Archivo eliminado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
