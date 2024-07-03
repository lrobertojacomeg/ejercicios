package Archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class MoverArchivo {
    public static void main(String[] args) {
        Path origen = Paths.get("d://tmp/archivo.txt");
        Path destino = Paths.get("d://tmp/archivo_movido.txt");
        try {
            Files.move(origen, destino);
            System.out.println("Archivo movido o renombrado exitosamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
