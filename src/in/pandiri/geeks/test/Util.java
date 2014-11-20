package in.pandiri.geeks.test;

import java.util.Random;

public class Util {

	private static Random rand = new Random();

	public static void printArray(int[] arr) {

		if (arr != null) {
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i] + " , ");
			}
			System.out.println();
		}
	}

	public static int[] createRandomArray() {
		int len = rand.nextInt(100);
		return createRandomArray(len);
	}

	public static int[] createRandomArray(int len) {
		int[] arr = new int[len];
		for (int i = 0; i < len; i++) {
			arr[i] = rand.nextInt(1000);
		}
		return arr;
	}
}