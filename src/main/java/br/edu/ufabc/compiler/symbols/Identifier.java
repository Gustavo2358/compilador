package br.edu.ufabc.compiler.symbols;

public class Identifier {
    private final String name;
    private final DataType type;
    private final Integer value;

    public Identifier(String text, DataType type) {
        this.name = text;
        this.type = type;
        this.value = null;
    }

    public Identifier(String text, DataType type, Integer value) {
        this.name = text;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Identifier [name=" + name + ", type=" + type + ", value=" + value + "]";
    }
}
