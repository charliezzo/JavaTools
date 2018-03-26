package zcy.sort;

public class Fast {

	public static float[] sort(float[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = right;
		float temp;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						temp = array[now];
						array[now] = array[right];
						array[right] = temp;
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						temp = array[now];
						array[now] = array[right];
						array[right] = temp;
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						temp = array[now];
						array[now] = array[left];
						array[left] = temp;
						now = left;
					}
				} else {
					if (array[now] < array[left]) {
						temp = array[now];
						array[now] = array[left];
						array[left] = temp;
						now = left;
					}

				}
				left++;
			}
		}
		if (array.length > 1) {
			float[] arr1 = new float[now];
			float[] arr2 = new float[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}

	public static double[] sort(double[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = right;
		double temp;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						temp = array[now];
						array[now] = array[right];
						array[right] = temp;
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						temp = array[now];
						array[now] = array[right];
						array[right] = temp;
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						temp = array[now];
						array[now] = array[left];
						array[left] = temp;
						now = left;
					}
				} else {
					if (array[now] < array[left]) {
						temp = array[now];
						array[now] = array[left];
						array[left] = temp;
						now = left;
					}

				}
				left++;
			}
		}
		if (array.length > 1) {
			double[] arr1 = new double[now];
			double[] arr2 = new double[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}

	public static byte[] sort(byte[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = left;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				} else {
					if (array[now] > array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				}
				left++;
			}
		}
		if (array.length > 1) {
			byte[] arr1 = new byte[now];
			byte[] arr2 = new byte[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}

	public static short[] sort(short[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = left;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				} else {
					if (array[now] > array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				}
				left++;
			}
		}
		if (array.length > 1) {
			short[] arr1 = new short[now];
			short[] arr2 = new short[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}

	public static int[] sort(int[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = right;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				} else {
					if (array[now] > array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				}
				left++;
			}
		}
		if (array.length > 1) {
			int[] arr1 = new int[now];
			int[] arr2 = new int[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}

	public static long[] sort(long[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = left;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				} else {
					if (array[now] > array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				}
				left++;
			}
		}
		if (array.length > 1) {
			long[] arr1 = new long[now];
			long[] arr2 = new long[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}

	public static char[] sort(char[] array, boolean positiveSequence) {
		int left = 0;
		int right = array.length - 1;
		int now = left;
		while (left <= right) {
			if (now == left - 1) {
				if (positiveSequence) {
					if (array[now] > array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				} else {
					if (array[now] < array[right]) {
						array[now] ^= array[right];
						array[right] ^= array[now];
						array[now] ^= array[right];
						now = right;
					}
				}
				right--;
			} else {
				if (positiveSequence) {
					if (array[now] < array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				} else {
					if (array[now] > array[left]) {
						array[now] ^= array[left];
						array[left] ^= array[now];
						array[now] ^= array[left];
						now = left;
					}
				}
				left++;
			}
		}
		if (array.length > 1) {
			char[] arr1 = new char[now];
			char[] arr2 = new char[array.length - now - 1];
			for (int i = 0; i < now; i++) {
				arr1[i] = array[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				arr2[i - now - 1] = array[i];
			}
			arr1 = sort(arr1, positiveSequence);
			arr2 = sort(arr2, positiveSequence);
			for (int i = 0; i < now; i++) {
				array[i] = arr1[i];
			}
			for (int i = now + 1; i < array.length; i++) {
				array[i] = arr2[i - now - 1];
			}
		}
		return array;
	}
}
