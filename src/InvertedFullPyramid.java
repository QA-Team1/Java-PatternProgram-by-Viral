import java.util.Scanner;

public class InvertedFullPyramid {

	public static void main(String[] args) {
		
		System.out.println("enter number of rows to print");
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();

		for (int i=row; i>=1; i--) 
		{
			for (int k=i; k<=row; k++){
				System.out.print(" ");
			}
			for (int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
		System.out.println("Press y to continue otherwise end");
	}

}
