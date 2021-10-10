package BMS.CinemaService;

import BMS.MovieService.Movie;
import jdk.nashorn.internal.objects.annotations.Constructor;

import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class CinemaService {
    private List<Cinema> cinemas;
    private HashMap<String,List<Cinema>> cinemaPerCity;
    HashMap<String,Cinema> cinemaMap;

    public CinemaService(){

    }
    public void updateCinemas(){
        //update cinema list and CinemaPerCity Map and cinemamap
    }

    public Set<String> getCities(){
        return cinemaPerCity.keySet();
    }

    public HashMap<Cinema,List<Show>> getCinemaWithShowsForaMovieAtACity(Movie movie,String City){
        HashMap<Cinema,List<Show>> showsPerCinema = new HashMap<>();
        cinemaPerCity.get(City).forEach(cinema -> {
            showsPerCinema.put(cinema,cinema.getCinemaWithShows(movie));
        });
        return showsPerCinema;
    }

    public HashMap<Cinema,List<Show>> getCinemaWithShowsForaMovie(Movie movie){
        HashMap<Cinema,List<Show>> showsPerCinema = new HashMap<>();
        cinemas.forEach(cinema -> {
            showsPerCinema.put(cinema,cinema.getCinemaWithShows(movie));
        });
        return showsPerCinema;
    }

    public void bookAShow(Cinema cinema,Show show,int row, int col){
        cinemaMap.get(cinema.getCinemaId()).getShowMap().get(show.getShowId()).bookSeat(row,col);
    }
}
