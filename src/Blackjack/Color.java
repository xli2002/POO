package Blackjack;

public enum Color {
    RED("\u001b[1;91m"),
    BLACK("\u001b[1;30m"),
    RESET("\u001b[0m");

    private final String color;
    Color(String color){
        this.color=color;
    }

    public String toString() {
        return  color ;
    }
}
