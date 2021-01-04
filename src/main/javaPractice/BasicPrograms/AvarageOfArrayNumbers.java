package BasicPrograms;

public class AvarageOfArrayNumbers {

	public static void main(String[] args) {
		
		int[] arrayNumbers = {1, 2, 3, 4, 5};
		int sum=0;
		int avg=0;
		int arrayLeangth = arrayNumbers.length;
		for(int i=0;i<arrayLeangth; i++) {
			sum=sum+arrayNumbers[i];
		}
		avg= sum/arrayLeangth;
		System.out.println("Avarage of array Numbers is " + avg);

	}

}
