package jd2section1project;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.UUID;



public class Movie {
	
private final  String movieId;
private String movieTitle;
private  String director;
private String[] actor;
private String dateTime;
private String  description;
private MovieType movieType;



public Movie(String movieTitle, String director, String[] actor, String date, String description,
		MovieType movieType) {
	super();
	this.movieId = UUID.randomUUID().toString();;
	this.movieTitle = movieTitle;
	this.director = director;
	this.actor = actor;
	this.dateTime = date;
	this.description = description;
	this.movieType = movieType;
}


public String getMovieId() {
	return movieId;
}

public String getMovieTitle() {
	return movieTitle;
}

public void setMovieTitle(String movieTitle) {
	this.movieTitle = movieTitle;
}


public String getDirector() {
	return director;
}


public void setDirector(String director) {
	this.director = director;
}

public String[] getActor() {
	return actor;
}

public void setActor(String[]actor) {
	this.actor = actor;
}

public String getDateTime() {
	return dateTime;
}


public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}



public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}


public MovieType getMovieType() {
	return movieType;
}



@Override
public String toString() {
	return "Movie [movieId=" + movieId + '\''+
			", movieTitle=" + movieTitle +'\''+
			", director=" + director+'\''+
			", actor=" + Arrays.toString(actor) +'\''+
			", date=" + dateTime +'\''+
			", description=" + description +'\''+
			", movieType=" + movieType + "]"+ '\n';
}

	
}
