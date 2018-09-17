import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		List<Player> playerList = new ArrayList();
		boolean capFlag = false;
		
		System.out.println("Enter the number of players");
		int numPlayers = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Do you know the details of the captain? Type Yes / No");
		String knowCap = sc.nextLine();
		
		try {
			if (knowCap.equals("Yes")) {
				System.out.println("Enter name of the captain");
				String name = sc.nextLine();
				System.out.println("Enter country of the captain");
				String country = sc.nextLine();
				System.out.println("Enter skillset of the captain");
				String skill = sc.nextLine();
				Player captain = new Player();
				captain.setName(name);
				captain.setCountry(country);
				captain.setSkill(skill);
				capFlag = true;
				playerList.add(captain);
				
				
			} 
			for (int i = 1; i <= numPlayers; i++) {
				System.out.println("Enter name of player " + i);
				String pName = sc.nextLine();
				System.out.println("Enter country of player " + i);
				String pCountry = sc.nextLine();
				System.out.println("Enter skillset of player " + i);
				String pSkill = sc.nextLine();
				Player player = new Player();
				player.setName(pName);
				player.setCountry(pCountry);
				player.setSkill(pSkill);
				
				playerList.add(player);
			}
			
			if (knowCap.equals("No"))
				throw new NullPointerException();
			
		} catch (NullPointerException e) {
			System.out.println("Exception Occured : " + e.getClass().toString().substring(6));
		} finally {
			for (int i = 0; i < playerList.size(); i++) {
				if (!capFlag && i == 0) {
					System.out.println("Captain details not available");
				}
				if (capFlag && i == 1){
					System.out.println("Player Details");
				}
				if (!capFlag && i == 0) {
					System.out.println("Player Details");
				}
				playerList.get(i).displayPlayerDetails();
			}
		}
		
		
	}

}
