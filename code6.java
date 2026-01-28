package day2;
import java.util.Scanner;
public class code6 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("sum= "+(a+b)+"\n");
		System.out.println("difference= "+(a-b)+"\n");
		System.out.println("product= "+(a*b)+"\n");
		System.out.println("quotient= "+(a/b)+"\n");
	}

}
