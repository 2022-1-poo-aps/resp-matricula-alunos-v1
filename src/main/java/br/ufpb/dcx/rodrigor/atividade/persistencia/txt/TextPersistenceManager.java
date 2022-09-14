package br.ufpb.dcx.rodrigor.atividade.persistencia.txt;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;

public class TextPersistenceManager {

    private static Path workingDir;



    public TextPersistenceManager(){
    }

    public static void main(String[] args) throws IOException {
        workingDir = Paths.get("").toAbsolutePath().normalize();

        try(FileWriter fileWriter = new FileWriter(workingDir.resolve("teste.txt").toFile());
            PrintWriter printWriter = new PrintWriter(fileWriter);){
            printWriter.print("teste");
            printWriter.printf("Blog name is %s", "howtodoinjava.com");
        }
        //BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);

    }
}
