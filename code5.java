package day2;
import java.util.Scanner;
public class code5 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length and width: ");
		int length = sc.nextInt();
		int width = sc.nextInt();
		int area = length * width;
		System.out.println("\nThe area of the rectangle = "+area);
	}

}
