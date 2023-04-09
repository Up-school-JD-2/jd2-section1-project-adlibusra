package jd2section1project;

import java.util.EnumSet;

public enum MovieType {

	ACTION(),
	COMEDY(),
	HORROR();
	
	
	
	public static MovieType getMovieType(String type) {
	    var movieTypes = EnumSet.allOf(MovieType.class);
	    for (MovieType movieType : movieTypes) {
	      if (movieType.name().equalsIgnoreCase(type)) {
	        return movieType;
	      }
	    }
	    return null;
	  }
}



