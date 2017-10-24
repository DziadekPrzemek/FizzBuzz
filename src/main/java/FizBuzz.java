import java.util.Scanner;

public class FizBuzz {
	private static Scanner in;

	public static void main(String[] args) {
		
		System.out.println("Set last number: ");
		in = new Scanner(System.in);				//Read keybord
		int i = in.nextInt();
		int y = 1;
		
		while(y <= i) {								//Count loops
		if(y%3==0) {								// Condition of Fizz
			System.out.println("Fizz");
		}
		else if(y%5==0) {
			System.out.println("Buzz");				//Condition of Buzz
		}
		else 
		{
			System.out.println(y);
		}
		y++;
		}
	}
		

}
