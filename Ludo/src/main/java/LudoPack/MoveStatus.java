package LudoPack;

import lombok.Builder;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Builder
public class MoveStatus {
    String player_id;
    List<Move> moves;
    LocalDateTime timestamp;
}
