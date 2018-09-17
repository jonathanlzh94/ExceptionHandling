import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException  {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<String> teamList = new ArrayList();
    	teamList.add("Chennai Super Kings");
    	teamList.add("Deccan Chargers");
    	teamList.add("Delhi Daredevils");
    	teamList.add("Kings XI Punjab");
    	teamList.add("Kolkata Knight Riders");
    	teamList.add("Mumbai Indians");
    	teamList.add("Rajasthan Royals");
    	teamList.add("Royal Challengers Bangalore");
    	
    	try {
    		System.out.println("Enter the expected winner team of IPL Season 4");
        	String winner = sc.nextLine();
        	if (!teamList.contains(winner)) throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
        	System.out.println("Enter the expected runner Team of IPL Season 4");
    		String runner = sc.nextLine();
    		if (!teamList.contains(runner)) throw new TeamNameNotFoundException("Entered team is not a part of IPL Season 4");
    		System.out.println("Expected IPL Season 4 winner: " + winner);
    		System.out.println("Expected IPL Season 4 runner: " + runner);
    	} catch (TeamNameNotFoundException e) {
    		System.out.println(e.getClass().toString().substring(6) + ": " +e.getMessage());
    	} 
    }
}

