public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings) {
		boolean swap = true;
		for (int i = 0; i < strings.length - 1 && swap; i++) {
			swap = false;
			for (int e = 0; e < strings.length - 1 - i; e++) {
				if (strings[e].compareToIgnoreCase(strings[e + 1]) > 0) {
					String temp = strings[e + 1];
					strings[e + 1] = strings[e];
					strings[e] = temp;
					swap = true;
				}
			}
		}
	}
}
