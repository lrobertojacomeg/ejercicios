package Archivos;

import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class ListarArchivos {
    public static void main(String[] args) {
        Path directorio = Paths.get(".");
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directorio)) {
            for (Path archivo : stream) {
                System.out.println(archivo.getFileName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

