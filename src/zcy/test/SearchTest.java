package zcy.test;

import zcy.search.BinarySearch;

public class SearchTest {
	public static void test() {
		BinarySearch binarySearch = new BinarySearch();
		double[] arr = { 9.5, 8.3, 7.6 };
		int index = binarySearch.search(arr, 7.5);
		System.out.println(index);
	}
}
