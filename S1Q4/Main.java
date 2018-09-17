import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		try {
			Player p = Player.class.newInstance();
			
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("Trying to invoke a no-argument constructor (that is not available) using newInstance method");
			System.out.println("Exception Occured : " + e.getClass().toString().substring(6));
		} finally {
			System.out.println("Enter name of the player");
			String name = sc.nextLine();
			System.out.println("Enter country of the player");
			String country = sc.nextLine();
			System.out.println("Enter skillset of the player");
			String skill = sc.nextLine();
			Player p2 = new Player(name, country, skill);
			p2.displayPlayerDetails();
		}
		
	}

}
