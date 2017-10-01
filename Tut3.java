import java.util.Scanner;

public class Tut3 {

	public static void main(String[] args) {
		
		//Q1
		
		int k = 5;
		System.out.println(k++); //5
		System.out.println(++k + "\n"); //7
		
		//Q2
		
		System.out.println((5+6)*2-1); //21
		
		int i = 5, j = 3;
		j -= 1;
		k = ++i /j--;
		System.out.println("i = " + i + ", j = " + j + ", & k = " + k); //6, 1, 3
		
		k = 5;
		k = -k * --k;
		System.out.println("k = " + k); //-20

		boolean test;
		test = 10 * 3 < 300 / 10 || 13 > 12;
		System.out.println(test); //true
		
		test = true || false && true;
		System.out.println(test + "\n"); //true, since L>R, also true || false = true, true && true = true
		
		//Q3
		
		int iResult, num1 = 25, num2 = 40, num3 = 17, num4 = 5;
		double fResult, val1 = 17.0, val2 = 12.78;
		
		fResult = (double) num1 / num2;
		System.out.println(fResult); //0.625
		
		fResult = num1 / (double) num2;
		System.out.println(fResult); //0.625
		
		fResult = (double) (num1 / num2);
		System.out.println(fResult); //0.0
		
		iResult = (int) (val1 / num4);
		System.out.println(iResult); //3
		
		fResult = (int) (val1 / num4);
		System.out.println(fResult); //3.0
		
		fResult = (int) ((double)num1 / num2);
		System.out.println(fResult); //0.0
		
		iResult = num3 % num4;
		System.out.println(iResult); //2
		
		iResult = num2 % num3;
		System.out.println(iResult); //6
		
		iResult = num3 % num2;
		System.out.println(iResult); //17
		
		iResult = num2 % num4;
		System.out.println(iResult + "\n"); //0
		
		//Q4
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("We will compute the area of a rectangle");
		System.out.print("Please input the length: ");
		double length = 0.0;
		length = kb.nextDouble();

		System.out.print("Please input the width: ");
		double width = 0.0;
		width = kb.nextDouble();
		
		kb.close();
		
		double area = 0.0;
		area = length * width;
		System.out.println("The area of a rectangle of length: " + length + " and width: " + width + " is: " + area +"\n");
		
		//Q5
		
		int x = 10;
		int y = 12;
		iResult = 0;
		float w = 4.5f;
		float z = 8.2F;
		float dResult;
		
		iResult = (int) (z / w); //1
		dResult = y * x; //120.0
		System.out.println("iResult now is: " + iResult + " and dResult is: " + dResult);
		x = 2;
		dResult = z / x;
		System.out.println("dResult now is: " + dResult);
		x = 10;
		y = 4;
		
		//Notice that the following casting will be useless (too late)
		dResult = (float) (x / y);
		System.out.println("dResult now is: " + dResult);
		//The proper way to do so would be as follows
		dResult = (float) x / y;
		System.out.println("dResult now is: " + dResult);
		
		
		//Output:
		//iResult now is: 1 and dResult is: 120.0
		//dResult now is: 4.1
		//dResult now is: 2.0
		//dResult now is: 2.5
	}

}
