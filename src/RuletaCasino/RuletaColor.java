package RuletaCasino;

public enum RuletaColor {
    RED(Color.RED),
    BLACK(Color.BLACK),
    GREEN(Color.GREEN);

    private final Color color;

    RuletaColor(Color color) {
        this.color = color;
    }

    public String toString() {
        return color.toString();
    }
}
