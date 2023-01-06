import java.util.Arrays;
import java.util.List;

public class Movie {
    
    private static final List<String> ALLOWED_GENRES = Arrays.asList("action", "romance", "fiction", "horror", "family");
    private String movieGenre;
    private String movieTitle;
    private int movieRating;
    private String movieDescription;
    private double moviePrice;
    private int year;

    public String getGenre(){
        return this.movieGenre;
    }

    public String getTitle(){
        return this.movieTitle;
    }
    public int getRating(){
        return this.movieRating;
    }
    public String getDescription(){
        return this.movieDescription;
    }
    public double getPrice(){
        return this.moviePrice;
    }
    public double getYear(){
        return this.year;
    }


    public Movie(String movieTitle,String movieGenre, int year, int movieRating, String movieDescription, double moviePrice) {
        this.year = year;
        if (ALLOWED_GENRES.contains(movieGenre)) {
            this.movieGenre = movieGenre;
          } else {
            throw new IllegalArgumentException("Invalid genre: " + movieGenre);
          }
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.movieDescription = movieDescription;
        this.moviePrice = moviePrice;
    }

    public String getMovieDetail(){
        return "Movie title: " + this.movieTitle + "\nMovie genre: " + this.movieGenre + "\nYear: " + "\nMovie rating: " + this.movieRating + "\nMovie description: " + this.movieDescription + "\nMovie price: " + this.moviePrice;
    }
}
