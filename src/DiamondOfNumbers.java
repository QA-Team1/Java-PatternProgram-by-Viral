import java.util.Scanner;

public class DiamondOfNumbers {

	public static void main(String[] args) {

		String choice = "y";

		while (choice.equals("y")) {
			System.out.println("enter number of rows to print");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			
			for (int i = 1; i <= n; i++) {
				for (int k = n - i; k >= 1; k--) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(i+" ");
					
				}
				System.out.println("");
				
			}
			for (int i = n - 1; i >= 1; i--) {
				for (int k = i + 2; k <= n; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(" "+i);
				}
				System.out.println("");
				
			}
			System.out.println("Press y to continue otherwise press any key to end");
			Scanner sc1 = new Scanner(System.in);
			choice = sc1.nextLine();

		}

		System.out.println("------------------END--------------");

	}
}
