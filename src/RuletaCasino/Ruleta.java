package RuletaCasino;

public class Ruleta {

    private Number[] cells;

    public Ruleta(){
        cells = new Number[37];
        for (int i=0;i< cells.length;i++)
            cells[i] = new Number(i);
    }

    public Number getRandomNUmber(){
        return cells [(int)(Math.random()*37)];
    }
}
