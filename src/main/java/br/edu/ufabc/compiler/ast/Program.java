package br.edu.ufabc.compiler.ast;

import br.edu.ufabc.compiler.symbols.SymbolTable;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class Program {

    private String filename;
    private List<Command> comandos;
    private SymbolTable symbolTable;

    public Program() {
        this.filename = "Main.java";
        this.comandos = new ArrayList<>();
    }

    public void generateTarget() {
        try {
            FileWriter fw = new FileWriter(filename);
            PrintWriter pw = new PrintWriter(fw);
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append(String.format("""
                              import java.util.Scanner;
                              
                              public class %s{
                              public static void main(String[] args){
                              """, filename.split("\\.")[0]));
            comandos.forEach(c -> {
                System.out.print(c.generateCode());
                strBuilder.append(c.generateCode());
            });
            strBuilder.append("""
                    }
                    }
                    """);
            pw.println(strBuilder);
            pw.close();
            fw.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Command> getComandos() {
        return comandos;
    }

    public void setComandos(List<Command> comandos) {
        this.comandos = comandos;
    }

    public SymbolTable getSymbolTable() {
        return symbolTable;
    }

    public void setSymbolTable(SymbolTable symbolTable) {
        this.symbolTable = symbolTable;
    }

    public void run() {
//        RuntimeEntity runtime = new RuntimeEntity();
//        runtime.updateContent(symbolTable.getSymbols().values());
//        comandos.forEach(c -> {
//            c.run();
//            runtime.updateContent(symbolTable.getSymbols().values());
//        });
    }
}