package BMS.MovieService;

import java.util.List;
import java.util.Optional;

public class QueryMovieByGenre implements QueryMovie{
    @Override
    public Optional<List<Movie>> query(List<Movie> movieList) {
        //Query movie list by genre
        return Optional.ofNullable(movieList);
    }
}
