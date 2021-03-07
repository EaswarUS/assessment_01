package learnjava;

public class GradingByIf_Else {

	public static void main(String[] args) {
		int grade = 80;
		if(grade<=25) {
			System.out.println("F");
		}
		else if (grade<=45 && grade>=25) {
			System.out.println("E");
		}
		else if (grade<=50 && grade>=45) {
			System.out.println("D");
		}
		else if (grade<=60 && grade>=50) {
			System.out.println("C");
		}
		else if (grade<=80 && grade>=60) {
			System.out.println("B");
		}
		else{
			System.out.println("A");
			
		}
	}

}
