package learnjava;

public class Average {

	public static void main(String[] args) {
		double[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		double total = 0;
		for (int i = 0; i < num.length; i++) {
			total = total + num[i];
		}
		double avg = total / num.length;

		System.out.println(avg);
	}

}
