package LudoPack;

import lombok.Builder;

@Builder
public class Piece {
    private String pieceId;
    private Color pieceColor;
    private int piecePos;

    public void updatePosition(int pos){
        this.piecePos = pos;
    }

    static enum Color{
        RED,BLUE,GREEN,YELLOW;
    }
}
