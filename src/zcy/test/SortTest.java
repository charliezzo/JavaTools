package zcy.test;

import java.util.Random;

import zcy.sort.Bubble;
import zcy.sort.Fast;

public class SortTest {
	public static void test() {
		Bubble bubble = new Bubble<>();
		Fast fastRow = new Fast();
		int length = 80;
		Random random = new Random();
//		int[] arr = { 0, 0, 5, 1, 7, 8, 11, 6, 0, 0, 1, 1, 3, 9, 14, 4 };
		// char[] arr = { 'a', 'c', 'h', 'b', 'j', 'g' };
		 int[] arr = new int[length];
		 for (int count = 0; count < arr.length; count++) {
		 arr[count] = random.nextInt(length);
		 }
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		long t1 = System.currentTimeMillis();
		// arr = (Integer[]) bubble.sort(arr, true);
		arr = fastRow.sort(arr, true);
		long t2 = System.currentTimeMillis();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println(t2 - t1);
	}
}
