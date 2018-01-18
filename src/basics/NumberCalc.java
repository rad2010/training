package basics;

public class NumberCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int NumA = 10;
		int NumB = 20;
		System.out.println(addNumbers(NumA, NumB));
	}
	
	 static int addNumbers(int NumberA, int NumberB){
		
		int sum = (NumberA + NumberB);
		System.out.println("sum is equal to " + sum);
		
		int i = 0;
		int n = 0;
		
		String[] people = new String[5];
		people[0] = "ashok";
		people[1] = "Jaynika";
		people[2] = "Shiven";
		people[3] = "Aditya";
		people[4] = "Bob";
		
		while (n < 5) {
			System.out.println("while" + people[n]);
			n++;
		}
		
		
		
		
	do {
	
			System.out.println(people[i]);
		i = i + 1;
	} while (i < 5);
		
		return sum;
		
	
			
	}

}
