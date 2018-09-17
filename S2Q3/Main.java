import java.io.IOException;
import java.util.*;

class Main {

    public static void main(String[] args)throws IOException  {
    	
    	Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter the total runs scored");
			int score = sc.nextInt();
			System.out.println("Enter the total overs faced");
			int overs = sc.nextInt();
			if ( overs < 1 || overs > 20) throw new OverRangeException("Over is not in the specified range");
			System.out.println("Current Run Rate :" + String.format("%.2f", (double)score/overs));
		} catch (OverRangeException e) {
			System.out.println(e.getClass().toString().substring(6) + ": " + e.getMessage());
		}
    }
}

