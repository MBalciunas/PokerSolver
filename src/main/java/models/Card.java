package models;

public class Card {

    private Symbols symbols;
    private Values values;


    public Card(Symbols symbols, Values values) {
        this.symbols = symbols;
        this.values = values;
    }

    public Symbols getSymbols() {
        return symbols;
    }

    public void setSymbols(Symbols symbols) {
        this.symbols = symbols;
    }

    public Values getValues() {
        return values;
    }

    public void setValues(Values values) {
        this.values = values;
    }

    @Override
    public String toString() {
        return String.format("%s of %sS", values, symbols);
    }

    public boolean equalValue(Card card) {
        return card.values.equals(this.values);
    }

    public boolean equalSymbol(Card card) {
        return card.symbols.equals(this.symbols);
    }

    public boolean compareTo(Card card) {
        return card.values.ordinal() > card.values.ordinal();
    }
}
