import java.util.Scanner;

public class FizBuzz {
	private static Scanner in;

	public static void main(String[] args) {
		
		System.out.println("Set last number: ");
		in = new Scanner(System.in);
		int i = in.nextInt();
		int y = 1;
		
		while(y < i) {
		if(y%3==0) {
			System.out.println("Fizz");
		}
		else if(y%5==0) {
			System.out.println("Buzz");
		}
		else 
		{
			System.out.println(y);
		}
		y++;
		}
	}
		

}
