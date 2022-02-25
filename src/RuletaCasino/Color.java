package RuletaCasino;

public enum Color {
    RED("\u001B[1;41m"),
    BLACK("\u001B[1;40m"),
    RESET("\u001B[0m"),
    GREEN("\u001B[42m");

    private final String color;
    Color(String color){
        this.color=color;
    }

    public String toString() {
        return  color ;
    }
}

