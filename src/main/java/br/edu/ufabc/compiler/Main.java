package br.edu.ufabc.compiler;

import br.edu.ufabc.compiler.error.CollectingErrorListener;
import br.edu.ufabc.compiler.exception.SemanticException;
import br.edu.ufabc.compiler.exception.TypeException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.edu.ufabc.compiler.parser.GrammarLexer;
import br.edu.ufabc.compiler.parser.GrammarParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String filePath = "input.isi";  // Replace with your file path
        try {
            String content = new String(Files.readAllBytes(Paths.get(filePath)));
            generateTarget(new App().compileToJava(content), "Main.java");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void generateTarget(String source, String filename) {
        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(source);
            pw.close();
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}