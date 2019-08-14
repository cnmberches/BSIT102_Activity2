/**
 *Charles Nicholas M. Berches
 *BSIT 102
 *Activity3
 * 
 */
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Student_Info 
{
	public static void main(String []ae) throws IOException
	{
		String [] info = new String[5];
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Input your name: ");
		info[0] = sc.readLine();
		
		System.out.print("Input your course: ");
		info[1] = sc.readLine();
		
		System.out.print("Input your section: ");
		info[2] = sc.readLine();
		
		System.out.print("Input your address: ");
		info[3] = sc.readLine();
		
		System.out.print("Input your contact number: ");
		info[4] = sc.readLine();
		
		System.out.println("My name is " + info[0] + ", " + info[1] + info[2] + ". I am from " + info[3] + ". My contact number is " + info[4] +".");
		
	}
}