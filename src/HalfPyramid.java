import java.util.Scanner;

public class HalfPyramid {

	public static void main(String[] args) {
		String choice = "y";
		while (choice.equals("y")) {
			System.out.println("enter number of rows to print");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					if (i == j || i == n || j == 1) {
						System.out.print(" *");
					} else {
						System.out.print("  ");
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


// Option 2


/*for (int i=1; i<=n; i++) {
	for (int j=1; j<=n; j++) {
		if (j==1 || i+j ==n+1 || i==1) {
		System.out.print(" *");
	} else {
		System.out.print("  ");
		}
	}
	System.out.println("");*/