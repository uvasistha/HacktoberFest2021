package BMS.CinemaService;

import BMS.MovieService.Movie;
import lombok.Builder;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Builder
@Getter
public class Cinema {
    private String cinemaId;
    private List<Show> Shows;
    private Map<String,Show> showMap;
    public void updateShowMap(){
        //update showmap as the show ends
        //periodic task scheduler
    }
    public List<Show> getCinemaWithShows(Movie movie){
        return Shows.stream().filter(show -> show.getMovie().equals(movie)).collect(Collectors.toList());
    }
}
