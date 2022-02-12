package Day2Practice;

import java.util.Scanner;

public class arrays_switches {
	public static void main (String args[]) {
		
		String[] fruits = {"Apple","Mango","Lichi"};
		
		for(int i=0;i<fruits.length;i++) {
			
			switch(fruits[i].toLowerCase()) {
			case "apple":
				System.out.println("Am Winter fruit,am go well with Custard salad!!");
				break;
				
			case "mango":
				System.out.println("Am Summer fruit,You love me to have as a juice!!");
			break;
			
			default:
				System.out.println("Am an unknown fruit, and am :" + fruits[i]);
			}
			
		}
		
		// Example for arrays -- starts from here
		
		int[] values;
		values = new int[5];
		
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("add data to array: ");
			values[count] = input.nextInt();
			count++;
		}
		while(count!=5);
		
		System.out.println("----------- This is reverse order printng----------");
		
		for(int i=values.length-1;i>=0;--i) {
			
			System.out.print(values[i]+" , ");
		}
		
		System.out.println("----------- Printing in ascending Order----------");
		
		int[] sort_asc = new int[5];
		
		for(int i=0;i<values.length;i++) {
			
			int val = values[i];
			int counter = i+1;
			while(counter < values.length) {
				if(val > values[counter] ) {
					int a= val;
					int b= values[counter];
					values[counter]=a;
					values[i]=b;
					counter++;		
				}
				else {
					break;
				}
				
			}
			System.out.print(values[i]+" , ");
		}
		
	}

}
