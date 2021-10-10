package BMS.MovieService;

import lombok.Builder;

import java.util.List;

@Builder
public class Movie {
    String title;
    String language;
    String genre;
    String releaseDate;
    List<String> cities;

    public String movieDesc(){
        return title+language+genre+releaseDate;
    }
}
