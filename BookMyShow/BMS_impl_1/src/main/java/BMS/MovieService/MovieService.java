package BMS.MovieService;

import lombok.Builder;

import java.util.List;
import java.util.Optional;

@Builder
public class MovieService {
    private List<Movie> moviesList;

    public MovieService(){

    }

    public void updateMovies() {
        //update movies List
    }

    public Optional<List<Movie>> QueryMovieBy(QueryMovie queryMovie,List<Movie> movies){

        return queryMovie.query(movies);
    }
    public Optional<List<Movie>> QueryMovieBy(QueryMovie queryMovie){

        return queryMovie.query(this.moviesList);
    }
}
