package zcy.sort;

public class Bubble<E extends Comparable<E>> {
	public E[] sort(E[] array, boolean positiveSequence) {
		E temp;
		boolean ok;
		for (int first = 0; first < array.length; first++) {
			ok = true;
			for (int second = first; second < array.length; second++) {
				if (positiveSequence ? array[first].compareTo(array[second]) > 0
						: array[first].compareTo(array[second]) < 0) {
					temp = array[second];
					array[second] = array[first];
					array[first] = temp;
					ok = false;
				}
			}
			if (ok) {
				break;
			}
		}
		return array;
	}
}
