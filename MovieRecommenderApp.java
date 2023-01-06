import java.util.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class MovieRecommenderApp {

   // 1. create movie object (this will require a class for movie)
   // 2. add movie into movieList(ArrayList)
   // 3. get user input (name, phone number, movie genre)
   // 4. (before sorting) iterate movieList and filter movie by input genre and
   // display movie detail
   // 5. sort movieList using BubbleSort() method
   // 6. repeat step 4
   // 7. call showPopUP() method from review class

   // this list contain string of genre allowed to create movie genre. If you want
   // to add more just add new genre(string) in the list
   private static final List<String> ALLOWED_GENRES = Arrays.asList("action", "romance", "fiction", "horror", "family");

   // sorting method for movieList
   public static List<Movie> bubbleSort(List<Movie> movieList) {
      for (int i = 0; i < movieList.size() - 1; i++) {
         for (int j = 0; j < movieList.size() - i - 1; j++) {
            if (movieList.get(j).getTitle().compareTo(movieList.get(j + 1).getTitle()) > 0) {
               // Swap movies[j] and movies[j+1]
               Movie temp = movieList.get(j);
               movieList.set(j, movieList.get(j + 1));
               movieList.set(j + 1, temp);
            }
         }
      }
      return movieList;
   }

   // setup comparator for binary search
   static Comparator<Movie> c = new Comparator<Movie>() {
      public int compare(Movie m1, Movie m2)
      {
          return m1.getTitle().compareTo(m2.getTitle());
      }
  };

   // binary search of movie list of type Movie by provided movie title in string
   public static int binarySearch(ArrayList<Movie> movieList, String movieTitle) {
      int index = Collections.binarySearch(movieList, new Movie(movieTitle), c);
      return index;
   }

   //this is main entry point
   public static void main(String[] args) {

      // this code is required to enable JOptionPanel to run
      JFrame f = new JFrame();
      f.setVisible(true);
      SwingUtilities.invokeLater(() -> f.setVisible(false));

      Scanner input = new Scanner(System.in);
      ArrayList moviesArrayList = new ArrayList();
      String name, phoneNum, movieTitle;
      String selectedCategory, MovieTitle;
      double Rating;
      ArrayList<Movie> movieList = new ArrayList<>();

      // create movie and add into movie list
      // when creating the movie object, it will call the constructor method which
      // taking required parameter of the movie

      // action movies
      Movie Skyscrapper = new Movie("Skyscrapper", "action", 2000, 0, "movieDescription", 20.00);
      Movie Venom = new Movie("Venom", "action", 2000, 0, "movieDescription", 20.00);
      Movie TheHungerGame = new Movie("The Hunger Game", "action", 2000, 0, "movieDescription", 20.00);
      Movie Peninsula = new Movie("Peninsula", "action", 2000, 0, "movieDescription", 20.00);
      Movie TopGunMaverick = new Movie("Top Gun:Maverick", "action", 2000, 0, "movieDescription", 20.00);
      // add action movies created to movie list
      movieList.add(Skyscrapper);
      movieList.add(Venom);
      movieList.add(TheHungerGame);
      movieList.add(Peninsula);
      movieList.add(TopGunMaverick);

      // romance movies
      Movie Emansipation = new Movie("Emansipation", "romance", 2000, 0, "movieDescription", 20.00);
      Movie Greyhound = new Movie("Greyhound", "romance", 2000, 0, "movieDescription", 20.00);
      Movie Hunt = new Movie("Hunt", "romance", 2000, 0, "movieDescription", 20.00);
      // add romance movies created to movie list
      movieList.add(Emansipation);
      movieList.add(Greyhound);
      movieList.add(Hunt);

      // fiction movies
      Movie TheAdamProject = new Movie("The Adam Project", "fiction", 2000, 0, "movieDescription", 20.00);
      Movie Lucy = new Movie("Lucy", "fiction", 2000, 0, "movieDescription", 20.00);
      Movie Transformers = new Movie("Transformers", "fiction", 2000, 0, "movieDescription", 20.00);
      Movie PacificRim = new Movie("Pacific Rim", "fiction", 2000, 0, "movieDescription", 20.00);
      Movie Mute = new Movie("Mute", "fiction", 2000, 0, "movieDescription", 20.00);
      // add fiction movies created to movie list
      movieList.add(TheAdamProject);
      movieList.add(Lucy);
      movieList.add(Transformers);
      movieList.add(PacificRim);
      movieList.add(Mute);

      // horror movies
      Movie TheConjuring = new Movie("The Conjuring", "horror", 2000, 0, "movieDescription", 20.00);
      Movie TheVisit = new Movie("The Visit", "horror", 2000, 0, "movieDescription", 20.00);
      Movie AnnebelleComesHome = new Movie("Annebelle Comes Home", "horror", 2000, 0, "movieDescription", 20.00);
      Movie AQuietPlace = new Movie("A Quiet Place", "horror", 2000, 0, "movieDescription", 20.00);
      Movie It = new Movie("It", "horror", 2000, 0, "movieDescription", 20.00);
      // add horror movies created to movie list
      movieList.add(TheConjuring);
      movieList.add(TheVisit);
      movieList.add(AnnebelleComesHome);
      movieList.add(AQuietPlace);
      movieList.add(It);

      // family movies
      Movie TheBossBaby = new Movie("The Boss Baby", "family", 2000, 0, "movieDescription", 20.00);
      Movie CorpseBride = new Movie("Corpse Bride", "family", 2000, 0, "movieDescription", 20.00);
      Movie Cinderella = new Movie("Cinderella", "family", 2000, 0, "movieDescription", 20.00);
      Movie SonicTheHedgehog = new Movie("Sonic The Hedgehog", "family", 2000, 0, "movieDescription", 20.00);
      Movie HowToTrainYourDragon = new Movie("How To Train Your Dragon: The Hidden World", "family", 2000, 0,
            "movieDescription", 20.00);
      // add family movies created to movie list
      movieList.add(TheBossBaby);
      movieList.add(CorpseBride);
      movieList.add(Cinderella);
      movieList.add(SonicTheHedgehog);
      movieList.add(HowToTrainYourDragon);

      // get user input (name, phone number and genre)
      Print("--------WELCOME TO MOVIE RECOMMENDER--------");
      Print("Please Enter your name: ");
      name = input.nextLine();

      Print("Please enter your phone number: ");
      phoneNum = input.nextLine();

      Print("\t\t-----MOVIE CATEGORY -----");
      Print("\t\t[1] ACTION MOVIE");
      Print("\t\t[2] ROMANCE MOVIE");
      Print("\t\t[3] FICTION MOVIE");
      Print("\t\t[4] HORROR MOVIE");
      Print("\t\t[5] FAMILY MOVIE");
      Print("\t\t-----------END-------------");

      Print("Enter Movie Category (Action/Romance/Fiction/Horror/Family): ");
      selectedCategory = input.nextLine().toLowerCase();

      // this code is to filter the valid genre input by user. if the genre is not in
      // the ALLOWED_GENRE, then throw an error IllegalArgumentException
      if (!ALLOWED_GENRES.contains(selectedCategory)) {
         throw new IllegalArgumentException("Invalid genre: " + selectedCategory);
      }

      // input genre is valid, proceed
      Print("**Before sort**");
      Print("");

      // now iterate movies inside movieList and filter movie by input genre and
      // display the movie detail
      for (Movie movie : movieList) {
         // filter genre
         if (movie.getGenre().equals(selectedCategory)) {
            Print(movie.getMovieDetail());
            Print("");
         }
      }

      Print("**After sort**");
      Print("");

      // sort movieList
      bubbleSort(movieList);

      // reiterate movies inside movieList and filter movie by input genre and display
      // the movie detail
      for (Movie movie : movieList) {
         // filter
         if (movie.getGenre().equals(selectedCategory)) {
            Print(movie.getMovieDetail());
            Print("");
         }
      }

      // search movie using binary search by movie title
      Print("Enter movie title: ");
      movieTitle = input.nextLine();

      // binary search
      int index = binarySearch(movieList, movieTitle);
      Print("");
      if (index >= 0) {
         Print("Movie found at " + index + " : " + movieList.get(index).getTitle());
     } else {
         Print("Movie not found");
     }

      // show JOptionPane from review class
      Review review = new Review();
      review.showPopUp();

      Print("");
      Print("End of code");
   }

   private static void Print(String text) {
      System.out.println(text);
   }
}
