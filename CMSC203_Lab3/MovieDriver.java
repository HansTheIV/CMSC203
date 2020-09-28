import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieDriver {
    private static String Title;
    public static void main(String[] args)
    {

     //Object declarations
     Scanner sc = new Scanner(System.in);
     Movie movie = new Movie();
     String rerun = "nullValue";


     while(rerun.equals("yes") || rerun.equals("nullValue"))
     {
         boolean pass = false;
         int tickets = -1;
         System.out.println("Enter the title of a movie: ");
         movie.setTitle(sc.nextLine());
         System.out.println("Enter the movie's rating: ");
         movie.setRating(sc.nextLine());

         while(tickets < 0)
         {
             try {
                 System.out.println("enter the amount of tickets sold");
                 tickets = sc.nextInt();
             }
             catch(InputMismatchException temp)
             {
                 System.out.println("Invalid input. you must enter a number greater than or equal to zero.");
                 sc.nextLine();
             };
         }
         sc.nextLine();
         movie.setSoldTickets(tickets);
         System.out.println(movie.toString());

         System.out.println("If you would like to enter another movie, enter 'y' now. if not, enter 'n'.");
         rerun = sc.nextLine();
         while(!pass)
         {
             if(rerun.equals("y"))
             {
                 rerun = "yes";
                 pass = true;
                 sc.reset();
             } else if(rerun.equals("n"))
             {
                 //this doesn't matter since the loop only checks to see if rerun equals yes or not,
                 // but it's extra readability
                rerun = "no";
                pass = true;
                System.out.println("Thanks for using this tool");
             } else
             {
                 System.out.println("Invalid input.");
                 rerun = sc.nextLine();
             }
         }


     }

    }
}
