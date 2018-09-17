import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException  {
    	
    	Scanner sc = new Scanner(System.in);
    	Map<Integer, String> hm = new HashMap();
    	System.out.println("Enter the team name");
		String team = sc.nextLine();
		System.out.println("Enter the number of players suggested");
		int num = sc.nextInt();
		
		try {
			for (int i = 1; i <= num; i++) {
				System.out.println(String.format("Enter player %s details", i));
				int id = sc.nextInt();
				sc.nextLine();
				String name = sc.nextLine();
				if (!hm.containsKey(id))
					hm.put(id, name);
				else 
					throw new DuplicateIdException("Player Id must be unique");
			}
			hm.forEach((k, v) -> {
				System.out.println(k + " " + v);
			});
		} catch (DuplicateIdException e) {
			System.out.println(e.getClass().toString().substring(6) + ": " + e.getMessage());
		}
    }
}

