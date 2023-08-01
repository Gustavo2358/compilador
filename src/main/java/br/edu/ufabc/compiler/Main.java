package br.edu.ufabc.compiler;

import br.edu.ufabc.compiler.exception.SemanticException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.edu.ufabc.compiler.parser.GrammarLexer;
import br.edu.ufabc.compiler.parser.GrammarParser;

public class Main {
    public static void main(String[] args) {
        try {
            GrammarLexer lexer;
            GrammarParser parser;

            // crio o lexer a partir da leitura do arquivo de entrada
            lexer = new GrammarLexer(CharStreams.fromFileName("input.expr"));

            // crio o TokenStream (o fluxo de tokens) a partir do lexer
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // crio o parser a partir do tokenStream
            parser = new GrammarParser(tokenStream);

            parser.prog();
            System.out.println("Compilation Success - Good Job!");
//            parser.exibirTodosTokens();
            parser.exibirSimbolos();
        }
        catch(SemanticException e){
            System.err.println("Compilation Fail");
            System.err.println(e.getMessage());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}