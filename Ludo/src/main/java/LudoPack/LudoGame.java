package LudoPack;

import LudoPack.Exception.InvalidMove;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LudoGame {
    private Player[] players;
    private LudoBoard ludoBoard;
    private int player;
    private List<MoveStatus> gameHistory;
    public LudoGame(){
        player = 0;
        players = new Player[4];
        for(int i=0;i<=3;i++){
            //initialize players with info
            for(int j=0;j<=3;j++){
                if(i!=j){
                    players[i].addObserver(players[j]);
                }
            }
        }
        //Initialize the ludoboard;
    }

    public void updateBoard(List<Move> moveList,int moves){
        //Update the board for current player;
        LudoBoard finalBoard = players[player].setMove(moves,moveList,ludoBoard);
        boolean check = true;
        for(int i=0;i<4;i++){
            check&=players[i].isCheckComplete();
        }
        if(check) {
            this.ludoBoard = finalBoard;
            gameHistory.add(MoveStatus.builder()
                    .player_id(players[player].getPlayerId())
                    .timestamp(LocalDateTime.now())
                    .moves(moveList)
                    .build());
        }
        else
            throw new InvalidMove();
        changeTurn();
    }

    private void changeTurn(){
        //change turn
        ++player;
        player %= 4;
    }
}