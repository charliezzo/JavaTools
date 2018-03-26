package zcy.search;

public class BinarySearch {

	public static int search(float[] array, float want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}

	public static int search(double[] array, double want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}

	public static int search(byte[] array, byte want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}

	public static int search(char[] array, char want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}

	public static int search(short[] array, short want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}

	public static int search(int[] array, int want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}

	public static int search(long[] array, long want) {
		int left = 0;
		int right = array.length - 1;
		int index = array.length / 2;
		while (left <= right) {
			if (want == array[index]) {
				break;
			} else if (want < array[index] && left != right) {
				if (array[left] <= array[right]) {
					right = index - 1;
				} else {
					left = index + 1;
				}
			} else if (want > array[index] && left != right) {
				if (array[left] <= array[right]) {
					left = index + 1;
				} else {
					right = index - 1;
				}
			} else {
				index = -1;
				break;
			}
			index = (right - left) / 2 + left;
		}
		return index;
	}
}
