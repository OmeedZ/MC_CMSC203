import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
	
		char choice='y';
		while(choice=='y')
		{
		Movie m=new Movie();
		System.out.println("Enter the name of the movie ");
		String title=scanner.nextLine();
		m.setTitle(title);
		System.out.println("Enter the rating of the movie ");
		String rating=scanner.next();
		m.setRating(rating);
		System.out.println("Enter the number of tickets sold for this movie ");
		int soldTickets=scanner.nextInt();
		m.setSoldTickets(soldTickets);
		System.out.println(m.toString());
		System.out.println("Do you want to enter another ?(y or n)");
		choice = scanner.next().charAt(0);
		scanner.nextLine();
		}
		
		
		System.out.println("Goodbye");
		scanner.close(); 
		
	}

}
