package Archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class CopiarArchivo {
    public static void main(String[] args) {
        Path origen = Paths.get("d://tmp/archivo.txt");
        Path destino = Paths.get("d://tmp/archivo_copia.txt");
        try {
            Files.copy(origen, destino);
            System.out.println("Archivo copiado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
