package BMS.MovieService;

import java.util.List;
import java.util.Optional;

public interface QueryMovie {
    public Optional<List<Movie>> query(List<Movie> movieList);
}
