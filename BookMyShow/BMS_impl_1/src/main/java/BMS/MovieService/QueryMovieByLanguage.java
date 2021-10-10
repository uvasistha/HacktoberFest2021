package BMS.MovieService;

import java.util.List;
import java.util.Optional;

public class QueryMovieByLanguage implements QueryMovie{
    @Override
    public Optional<List<Movie>> query(List<Movie> movieList) {
        //query movie list by language
        return Optional.ofNullable(movieList);
    }
}
