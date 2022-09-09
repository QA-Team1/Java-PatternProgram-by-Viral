import java.util.Scanner;
public class HollowInvertedHalfPyramid {

	public static void main(String[] args) {
		
		System.out.println("enter number of rows to print");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = n; i>=1; i--) {
			for (int j=1; j<=n; j++) {
				System.out.print("* ");
			}System.out.println("");
		}

	}

}
