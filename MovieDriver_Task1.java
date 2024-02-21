import java.util.Scanner;
public class MovieDriver_Task1 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Movie movie = new Movie();

        System.out.print("Enter the title of the movie: ");
        String title = keyboard.nextLine();
        movie.setTitle(title);

        System.out.print("Enter the rating of the movie: ");
        String rating = keyboard.nextLine();
        movie.setRating(rating);

        System.out.print("Enter the number of tickets sold for this movie: ");
        int soldTickets = keyboard.nextInt();
        movie.setSoldTickets(soldTickets);

        System.out.println("Movie Info: " + movie.toString());

    }
}
