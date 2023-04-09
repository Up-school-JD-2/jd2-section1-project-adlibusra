package jd2section1project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class MovieService {

	public static final List<Movie> MOVIE_LIST=new ArrayList<>();
	public static final List<Actors> ACTORS = new ArrayList<>();
	
	
	public static void generateMovie(){
	
		
		String[] filmActors= {"Vin Diesel\r\n", "Jason Statham\r\n","Michelle Rodriguez\r\n"};
		String[] filmActors3= {"Neve Campbell\r\n", "David Arquette\r\n","Courteney Cox\r\n"};
		String[] filmActors4= {"Ata Demirer\r\n", "Selçuk Borak\r\n","Demet Akbağ\r\n"};
		String[] filmActors5= {"Gupse Özay\r\n", "Barış Arduç\r\n","Cihan Ercan\r\n"};
		
		MOVIE_LIST.add(new Action("Hızlı ve Öfkeli 10 ", " Louis Leterrier", filmActors, "2023","lkfdfdlkfdas"));
		MOVIE_LIST.add(new Action("Hızlı ve Öfkeli 8", " Louis Leterrier", filmActors, "2017","lkfdfdlkfdas"));
		MOVIE_LIST.add(new Comedy("Eyvah Eyvah 1", " Ata Demirer ", filmActors4, "2010","Hüseyin ve ona kucak açan Firuzan'ın hayatı anlatılmaktadır."));
		MOVIE_LIST.add(new Comedy("Deliha", " Gupse Özay ", filmActors5, "2014","Delihanın Hayatı"));
		MOVIE_LIST.add(new Horror("Çığlık", "  Tyler Gillett", filmActors3, "1996","Amerikan slasher filmidir"));
		
		ACTORS.add(new Actors("Vin Diesel"));
		ACTORS.add(new Actors("Ata Demirer"));
		ACTORS.add(new Actors("Neve Campbell"));

		

	} 
	public  static void remove(String  movieName) {
		// TODO Auto-generated method stub
		for(var movie: MOVIE_LIST) {
	
			if(movie.getMovieTitle().equalsIgnoreCase(movieName)) {
				 MOVIE_LIST.remove(movie);
				System.out.println("Girilen  film silinmiştir.");
			break;
			}	
	}
		System.out.println("Film silindi");
		}
	
	
		public  static void add(Movie movie) {
			MOVIE_LIST.add(movie);
			System.out.println("Film eklendi");
		}
		
	public static List<Movie> listMovie(){
		List<Movie> movieList=new ArrayList();
		
		for(Movie  movie: MOVIE_LIST) {
			
			movieList.add(movie);
			}
		return movieList;
			
		} 
	

	 public Movie searchMovie(String movieName) {
		    Movie searchMovie=null;
		 for(var movie:MOVIE_LIST ) {
			 if(movie.getMovieTitle().equalsIgnoreCase(movieName)) {
				 searchMovie=movie;
				 System.out.println(searchMovie);
				 break;
			 }
		 }
		    return searchMovie;
		  }

	}

