public class IntegerMAxValueUC1 {
	public static void main(String[] args) {

		Integer[] a = {4, 8, 5}; 
		toPrint(a);
		System.out.println("print maximum Value");
		System.out.println(max(a));

	}
	public static <E extends Comparable<E>> E max(E... elements) {
		E max = elements[0];
		for (E element : elements) {
			if (element.compareTo(max) > 0) {
				max = element;
			}
		}
		return max;
	}
	private static <E> void toPrint(E[] a) {

		for (E i:a) {
			System.out.println(i);  
		}
	}
}
