import java.util.Scanner;
public class MovieDriver_Task2 {
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

        char question;
        while (true) {
            System.out.print("\nDo you want to enter information for another movie? (y/n): ");
            question = keyboard.next().charAt(0);
            keyboard.nextLine();

            if (Character.toLowerCase(question) != 'y') {
                System.out.println("Goodbye");
                break;
            }

            movie = new Movie();

            System.out.print("\nEnter the title of the movie: ");
            title = keyboard.nextLine();
            movie.setTitle(title);

            System.out.print("Enter the rating of the movie: ");
            rating = keyboard.nextLine();
            movie.setRating(rating);

            System.out.print("Enter the number of tickets sold: ");
            soldTickets = keyboard.nextInt();
            keyboard.nextLine();
            movie.setSoldTickets(soldTickets);

            System.out.println("Movie Information: " + movie.toString());

        }

        keyboard.close();

    }
    
}
