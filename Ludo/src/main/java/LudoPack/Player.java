package LudoPack;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

@Builder
@Getter
public class Player extends Observable implements Observer {
    private String playerId;
    private Piece.Color playerColor;
    private boolean checkComplete;
    @Override
    public void update(Observable o, Object arg) {
        this.validate((BoardCheck)arg);
    }

    public void validate(BoardCheck check){
        boolean validated =  false;
        //validate the current board , final board with the no. of moves and update the validated
        if(validated)
            this.checkComplete = true;
        else
            this.checkComplete = false;
    }

    public LudoBoard setMove(int moves, List<Move> moveList, LudoBoard initialBoard){
        LudoBoard finalBoard = new LudoBoard();
        initialBoard.copy(finalBoard);
        moveList.forEach(move -> {
            finalBoard.updateBoard(move.getPieceId(),move.getMoves());
        });
        BoardCheck checkObj = BoardCheck.builder()
                .initialBoard(initialBoard)
                .moves(moves)
                .finalBoard(finalBoard)
                .build();
        setChanged();
        notifyObservers(checkObj);
        return finalBoard;
    }

    @Builder
    @Setter
    private static class BoardCheck{
        private LudoBoard initialBoard;
        private LudoBoard finalBoard;
        private int moves;
    }
}
