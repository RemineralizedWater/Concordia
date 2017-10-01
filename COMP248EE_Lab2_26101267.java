
import java.util.Scanner;

public class COMP248EE_Lab2_26101267 {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		final int K = 4;
		int a = 0, b = 0, c = 0, d = 0;
		System.out.print("Input 'a': ");
		a = keyboard.nextInt();
		System.out.print("Input 'b': ");
		b = keyboard.nextInt();
		System.out.print("Input 'c': ");
		c = keyboard.nextInt();
		System.out.print("Input 'd': ");
		d = keyboard.nextInt();
		
		int modNumerator = 0, modDenominator = 0;
		
		modNumerator = (a % d + c % b) * K;
		modDenominator = b * d * K;
		
		keyboard.close();
		
		System.out.println("\nModified numerator is: " + modNumerator + ", and the modified denominator is: " + modDenominator);
	}

}
