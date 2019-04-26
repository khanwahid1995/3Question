package minimumArea;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author - wahid -date : 26-Apr-2019 10:45:01 pm
 *
 */
public class MinimumArea {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size of array x : ");
		int n = sc.nextInt();
		int[] x = inputOp(sc, n, 'x');

		System.out.print("Enter size of array y : ");
		int ny = sc.nextInt();
		if (ny != n) {
			System.out.println("size of arrays are not matched");
		} else {
			int[] y = inputOp(sc, n, 'y');

			System.out.println(Arrays.toString(x));
			System.out.println(Arrays.toString(y));

			System.out.print("Enter value of k : ");
			int k = sc.nextInt();
			if (k < 1 || k > n)
				System.out.println("Outside Contraints");
			else if(k!=n) {
				System.out.println("k should match with number of points provided");
			}
			else {
				System.out.println(k);
				operation(x,y,k);
			}

		}

	}

	private static void operation(int[] x, int[] y, int k) {
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println(Arrays.toString(x));
		System.out.println(Arrays.toString(y));
		
		int min =x[0];
		int max=y[y.length-1];
		int result=(max+1)-(min-1);
		System.out.println(result);
		System.out.println("Output : " + (result*result));
		
		
		
	}

	private static int[] inputOp(Scanner sc, int n, char ch) {
		if (2 <= n && n <= 100) {
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Enter the " + ch + "[" + i + "] : ");
				int temp = sc.nextInt();
				if (temp < Math.pow(-10, 9) || temp > Math.pow(10, 9)) {
					System.out.println("Outside Contraints ,retry");
					i--;
				} else {
					arr[i] = temp;
				}
			}
			return arr;
		} else {
			System.out.println("Outside Contraints");
			return new int[n];
		}
	}

}
