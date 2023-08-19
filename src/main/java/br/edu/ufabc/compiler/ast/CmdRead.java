package br.edu.ufabc.compiler.ast;

import br.edu.ufabc.compiler.exception.SemanticException;
import br.edu.ufabc.compiler.symbols.DataType;
import br.edu.ufabc.compiler.symbols.Identifier;

import javax.swing.JOptionPane;


public class CmdRead implements Command {

    private Identifier id;

    public CmdRead(Identifier id) {
        super();
        this.id = id;
    }
    public CmdRead() {
        super();
    }


    @Override
    public String generateCode() {
        return "Scanner sc = new Scanner(System.in);\n" +
        switch (id.getType()){
            case INTEIRO -> id.getName() + " = " + "sc.nextInt();\n";
            case REAL -> id.getName() + " = " + "sc.nextDouble();\n";
            case TEXTO -> id.getName() + " = " + "sc.nextLine();\n";
            case LOGICO -> throw new SemanticException(
                    "Nao é possível utilizar o comando leia para variáveis do tipo LOGICO");
        }
        + "sc.close();\n";
    }
    @Override
    public void run() {
//        id.setValue(Integer.parseInt(JOptionPane.showInputDialog("Type Your Input")));
    }

}
