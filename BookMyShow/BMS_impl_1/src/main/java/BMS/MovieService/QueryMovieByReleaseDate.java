package BMS.MovieService;

import java.util.List;
import java.util.Optional;

public class QueryMovieByReleaseDate implements QueryMovie{
    @Override
    public Optional<List<Movie>> query(List<Movie> movieList) {
        //query Movielist by releasedate
        return Optional.ofNullable(movieList);
    }
}
