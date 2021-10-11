package BMS.MovieService;

import java.util.List;
import java.util.Optional;

public class QueryMovieByCity implements QueryMovie{

    @Override
    public Optional<List<Movie>> query(List<Movie> movieList) {
        //Query movie list by City name
        return Optional.ofNullable(movieList);
    }
}
