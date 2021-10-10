package LudoPack;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Move {
    private String pieceId;
    private int moves;
}
