package BMS;

import BMS.CinemaService.Cinema;
import BMS.CinemaService.CinemaService;
import BMS.CinemaService.Show;
import BMS.MovieService.Movie;
import BMS.MovieService.MovieService;
import BMS.MovieService.QueryMovieByLanguage;
import BMS.MovieService.QueryMovieByTitle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class BookMyShowService {
    MovieService movieService;
    CinemaService cinemaService;
    public BookMyShowService(){
        movieService = new MovieService();
        movieService.updateMovies();// use scheduler task to perform this periodically
        cinemaService = new CinemaService();
        cinemaService.updateCinemas();// use scheduler task to perform this periodically
    }

    public List<Movie> getMovies(List<SearchCriteria> criterias){
        int i= 0;
        List<Movie> movies = new ArrayList<>();
        for(SearchCriteria criteria:criterias){
            Optional<List<Movie>> movieList = null;
            switch (criteria){
                case TITLE:
                    if(i == 0){
                        movieList = movieService.QueryMovieBy(new QueryMovieByTitle());
                        if(movieList.isPresent())
                            movies = movieList.get();
                    }
                    else{
                        movieList = movieService.QueryMovieBy(new QueryMovieByTitle(),movies);
                        if(movieList.isPresent())
                            movies = movieList.get();
                    }
                    break;
                case LANGUAGE:
                    if(i == 0){
                        movieList = movieService.QueryMovieBy(new QueryMovieByLanguage());
                        if(movieList.isPresent())
                            movies = movieList.get();
                    }
                    else{
                        movieList = movieService.QueryMovieBy(new QueryMovieByLanguage(),movies);
                        if(movieList.isPresent())
                            movies = movieList.get();
                    }
                    break;
                    //likewise for other enums
            }
            i++;
        }
        return movies;
    }

    public List<String> getAllCities(){
        return new ArrayList<>(cinemaService.getCities());
    }

    public HashMap<Cinema, List<Show>> getAllShowsForAMovie(Movie movie){
       return cinemaService.getCinemaWithShowsForaMovie(movie);
    }

    public HashMap<Cinema, List<Show>> getAllShowsForAMovieAtACity(Movie movie,String city){
        return cinemaService.getCinemaWithShowsForaMovieAtACity(movie,city);
    }

    public void bookAMovie(User user,Cinema cinema,Show show,int row, int col){
        cinemaService.bookAShow(cinema,show,row,col);
        user.setShowId(show.getShowId());
        user.setCinemaId(cinema.getCinemaId());
        user.setMovie(show.getMovie().movieDesc());
    }
    private static enum SearchCriteria{
        TITLE,LANGUAGE,GENRE,RELEASE_DATE,CITY_NAME;
    }
}
