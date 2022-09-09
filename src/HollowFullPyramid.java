import java.util.Scanner;

public class HollowFullPyramid {

	public static void main(String[] args) {

		String choice = "y";

		while (choice.equals("y")) {

			System.out.println("enter number of rows to print");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				for (int k = i - 1; k <= n; k++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					if (i == n || j == 1 || j == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
			System.out.println("Press y to continue otherwise press any key to end");
			Scanner sc1 = new Scanner(System.in);
			choice = sc1.nextLine();

		}

		System.out.println("------------------END------------------");

	}

}
