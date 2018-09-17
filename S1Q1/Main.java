import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the total runs scored");
		String runs = br.readLine();
		System.out.println("Enter the total overs faced");
		String overs = br.readLine();
		try {
			double runRate = Double.parseDouble(runs)/Double.parseDouble(overs);
			if(runRate == Double.POSITIVE_INFINITY)
	            throw new ArithmeticException();
			System.out.println("Current Run Rate : " +  String.format("%.2f", runRate));
		} catch (ArithmeticException | NumberFormatException e) {
			System.out.println(e.getClass().toString().substring(6));
		}
	}

}
