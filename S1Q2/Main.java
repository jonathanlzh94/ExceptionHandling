import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of overs");
		int overs = sc.nextInt();
		
		try {
			int[] runs = new int[overs];
			System.out.println("Enter the number of runs for each over");
			for (int i =0; i < overs; i++) {
				runs[i] = sc.nextInt();
			}
			System.out.println("Enter the over number");
			int over = sc.nextInt();
			System.out.println(runs[over-1]);
		} catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getClass().toString().substring(6));
		}
	}

}
