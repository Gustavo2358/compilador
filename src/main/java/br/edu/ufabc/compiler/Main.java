package br.edu.ufabc.compiler;

import br.edu.ufabc.compiler.error.CollectingErrorListener;
import br.edu.ufabc.compiler.exception.SemanticException;
import br.edu.ufabc.compiler.exception.TypeException;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

import br.edu.ufabc.compiler.parser.GrammarLexer;
import br.edu.ufabc.compiler.parser.GrammarParser;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            GrammarLexer lexer;
            GrammarParser parser;

            //Error listener customizado para coletar os erros.
            CollectingErrorListener errorListener = new CollectingErrorListener();

            // crio o lexer a partir da leitura do arquivo de entrada
            lexer = new GrammarLexer(CharStreams.fromFileName("input.expr"));
            lexer.removeErrorListeners(); // Remove the default ConsoleErrorListener from the lexer
            lexer.addErrorListener(errorListener);

            // crio o TokenStream (o fluxo de tokens) a partir do lexer
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);

            // crio o parser a partir do tokenStream
            parser = new GrammarParser(tokenStream);
            parser.removeErrorListeners(); // Remove the default ConsoleErrorListener
            parser.addErrorListener(errorListener);

            parser.prog();

            //TODO lançar excessoes com todos os erros para ser enviado para a API
            List<String> errors = errorListener.getErrors();
            if (!errors.isEmpty()) {
                for (String error : errors) {
                    System.out.println(error);
                }
            }

            System.out.println("Compilation Success - Good Job!");
//            parser.exibirTodosTokens();
            parser.exibirSimbolos();
        }
        catch(SemanticException | TypeException  e){
            System.err.println("Compilation Fail");
            System.err.println(e.getMessage());
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}