package Ajedrez;

import com.diogonunes.jcolor.Attribute;

public enum PieceColor {
    WHITE(Attribute.TEXT_COLOR(255,255,255)),
    BLACK(Attribute.TEXT_COLOR(0,0,0));

    private Attribute color;

    PieceColor(Attribute color){
        this.color=color;
    }

    public Attribute getAttribute() {
        return color;
    }


    public PieceColor next(){
//        return PieceColor.values()[((ordinal()+1)%PieceColor.values().length)];
        if (ordinal()==0)
            return BLACK;
        else
            return WHITE;
    }
}
