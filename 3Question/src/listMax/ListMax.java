package listMax;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author - wahid -date : 26-Apr-2019 10:20:17 pm
 *
 */
public class ListMax {

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of the array (n) : ");
		int n = sc.nextInt();

		if (n < 3 || n > Math.pow(10, 7)) {
			System.out.println("Outside Constraints");
		} else {
			long[] arr = new long[n];
			System.out.print("Enter number of operations : ");
			long o = sc.nextLong();

			if (o < 1l || o > 2 * Math.pow(10, 5)) {
				System.out.println("Outside Constraints");
			} else {
				System.out.print("Enter number 3 : ");
				int numberOfElements = sc.nextInt();
				if (numberOfElements != 3) {
					System.out.println("Outside Constraints");
				} else {
					BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // due to some problem , was not able to use scanner
					for (int i = 0; i < o; i++) {
						System.out.print("Enter 3 space seperated integers (" + (i + 1) + "):");
						String[] strArr = br.readLine().split(" ");
						if (strArr.length != 3)
							System.out.println("Outside Contraints");
						else {
							try {
								int a = Integer.parseInt(strArr[0]);
								int b = Integer.parseInt(strArr[1]);
								long k = Long.parseLong(strArr[2]);
								System.out.println("a : " + a + " , b : " + b + " , k : " + k);

								if (1 <= a && a <= b && b <= n) {
									operation(arr, a, b, k);
								} else {
									System.out.println("Outside Contraints");
									i--;
									System.out.println("Retry");
								}

							} catch (Exception e) {
								System.out.println("Please provide the correct input ");
								i--;
							}
						}
					}
					Arrays.sort(arr);
					System.out.print("Output : ");
					System.out.print(arr[arr.length-1]);
					br.close();
				}

			}

		}
		sc.close();

	}

	private static void operation(long[] arr, int a, int b, long k) {

		for (int i = a - 1; i < b; i++) {
			arr[i] = arr[i] + k;
		}
		System.out.println(Arrays.toString(arr));

	}

}
