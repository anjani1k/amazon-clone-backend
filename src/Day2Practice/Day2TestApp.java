package Day2Practice;
import java.util.Scanner;

public class Day2TestApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = input.nextInt();
		
		while(num>5) {
			
			if(num%2==0) {
				System.out.println("Am even number at :"+num);
			}
			else if(num%3==0) {
				System.out.println("Am odd at :" + num);
			}
			else {
				System.out.println("Am prime king at :" + num);
				break;
			}
			num--;
		}
		
		int val = 0;
		
		do {
			System.out.println("Enter another num :");
			val = input.nextInt();
		}
		while(val  != 0 && val%5 != 0);
		
		System.out.println("Am relative of num5");
			
	}
}
