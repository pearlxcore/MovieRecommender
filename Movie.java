import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Movie implements Comparable<Movie>, Comparator<Movie>{

    // this list contain string of genre allowed to create movie genre. If you want
    // to add more just add new genre(string) in the list
    private static final List<String> ALLOWED_GENRES = Arrays.asList("action", "romance", "fiction", "horror", "family");
    private String movieGenre;
    private String movieTitle;
    private int movieRating;
    private String movieDescription;
    private double moviePrice;
    private int year;
    private String movieTitle_;

    // this method will return movie genre
    public String getGenre() {
        return this.movieGenre;
    }

    // this method will return movie title
    public String getTitle() {
        return this.movieTitle;
    }

    // this method will return movie rating
    public int getRating() {
        return this.movieRating;
    }

    // this method will return movie description
    public String getDescription() {
        return this.movieDescription;
    }

    // this method will return movie price
    public double getPrice() {
        return this.moviePrice;
    }

    // this method will return movie year
    public double getYear() {
        return this.year;
    }

    public Movie(String movieTitle){
        this.movieTitle = movieTitle;

    }

    // when creating the movie object, it will call the constructor method which
    // taking required parameter of the movie
    public Movie(String movieTitle, String movieGenre, int year, int movieRating, String movieDescription,
            double moviePrice) {
        // this code is to filter the valid genre input by user before creating movie
        // object. if the genre is not in the ALLOWED_GENRE, then it will throw an error
        // IllegalArgumentException
        if (ALLOWED_GENRES.contains(movieGenre)) {
            // genre valid
            this.movieGenre = movieGenre;
        } else {
            // genre is not valid and program stop
            throw new IllegalArgumentException("Invalid genre: " + movieGenre);
        }
        this.year = year;
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.movieDescription = movieDescription;
        this.moviePrice = moviePrice;
    }

    // this method will return movie detail
    public String getMovieDetail() {
        return "Movie title: " + this.movieTitle + "\nMovie genre: " + this.movieGenre + "\nYear: " + this.year
                + "\nMovie rating: " + this.movieRating + "\nMovie description: " + this.movieDescription
                + "\nMovie price: " + this.moviePrice;
    }

    @Override
    public int compareTo(Movie o) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compare(Movie o1, Movie o2) {
        // TODO Auto-generated method stub
        return 0;
    }
}
