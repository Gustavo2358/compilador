package br.edu.ufabc.compiler.symbols;

import java.util.Optional;

public class Identifier{
    private final String name;
    private final DataType type;
    private final String value;

    public Identifier(String name, DataType type, String value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }
    public Identifier(String name, DataType type) {
        this(name, type, null);
    }

    public String getName() {
        return name;
    }

    public DataType getType() {
        return type;
    }

    public Optional<String> getValue() {
        return Optional.ofNullable(value);
    }

    @Override
    public String toString() {
        return "Identifier [name=" + name + ", type=" + type + ", value=" + value + "]";
    }
}
