package Archivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivo {
    public static void main(String[] args) {
        String rutaArchivo = "d://tmp/archivo.txt";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaArchivo))) {
            bw.write("Hola, mundo!");
            bw.newLine();
            bw.write("Escribiendo en un archivo de texto.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
