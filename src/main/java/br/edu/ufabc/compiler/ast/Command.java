package br.edu.ufabc.compiler.ast;

public interface Command {
    String generateCode();
    void run();
}
