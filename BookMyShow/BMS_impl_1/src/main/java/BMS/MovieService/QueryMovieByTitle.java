package BMS.MovieService;

import java.util.List;
import java.util.Optional;

public class QueryMovieByTitle implements QueryMovie{
    @Override
    public Optional<List<Movie>> query(List<Movie> movieList) {
        //query the list by Title
        return Optional.ofNullable(movieList);
    }
}
