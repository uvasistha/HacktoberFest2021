package BMS.CinemaService;

import BMS.MovieService.Movie;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Builder
@Getter
public class Show {
    private String ShowId;
    private Movie movie;
    private Audi audi;
    private LocalDateTime time;

    public void bookSeat(int row, int col){
        if(!audi.setSeat(row,col))
            throw new RuntimeException();
    }

    @Getter
    static class Audi{
        String AudiNo;
        int size;
        boolean seats[][];

        Audi(int size,String AudiNo){
            this.AudiNo = AudiNo;
            this.size = size;
            seats = new boolean[size][size];
        }

        public boolean setSeat(int row,int col){
            if(!seats[row][col]){
                seats[row][col] = true;
                return true;
            }
            else
                return false;
        }
    }
}
