package in.pandiri.geeks.algos;

import in.pandiri.geeks.ds.IStack;
import in.pandiri.geeks.ds.impl.ArrayStack;

public class StackAlgos {

	public static void nextGreaterElementElement(int[] arr)
			throws Exception {

		if (arr == null || arr.length < 1) {
			return;
		}

		IStack<Integer> stk = new ArrayStack<Integer>();
		for (int i = 0; i < arr.length; i++) {
			while (!stk.isEmpty() && arr[i] > stk.top()) {
				System.out.println(stk.pop() + "  => " + arr[i]);
			}
			stk.push(arr[i]);
		}
		while (!stk.isEmpty()) {
			System.out.println(stk.pop() + "  => " + -1);
		}
	}
}