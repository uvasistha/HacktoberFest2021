package LudoPack;

import lombok.Builder;
import lombok.Setter;

import java.util.List;
import java.util.Map;

@Builder
@Setter
public class LudoBoard {
    private List<Piece> pieces;
    private Map<Integer, Piece> pieceMap;

    public LudoBoard(){
        //initialise the pieces with initial value
        //initialize the map
    }

    public void copy(LudoBoard board){
        //deep copy of pieces and the current state of the map
    }

    public void updateBoard(String pieceId,int moves){
        //update the pieceIdth Piece pos with the map value checking.
        //updating the position of previous piece to initial if the map
        //has a piece at that position
    }

}
