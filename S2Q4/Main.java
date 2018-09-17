import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException  {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	
    	try {
    		System.out.println("Enter the player name");
        	String name = sc.nextLine();
        	System.out.println("Enter the player age");
    		int age = sc.nextInt();
    		if (age < 19) throw new CustomException("InvalidAgeRangeException");
    		System.out.println("Player name : " + name);
    		System.out.println("Player age : " + age);
    	} catch (CustomException e) {
    		System.out.println(e.getClass().toString().substring(6) + ": " +e.getMessage());
    	} 
    }
}

