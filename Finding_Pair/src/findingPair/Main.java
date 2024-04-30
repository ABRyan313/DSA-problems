package findingPair;

public class Main {

	public static void main(String[] args) {
		int [] arr = { 8, 7, 2, 5, 3, 1};
		int target = 10;
		System.out.println("Array length: " + arr.length);
		findPair(arr, target);
		
	}
	
	public static void findPair(int [] arr, int target) {
		
		for (int i = 0; i < arr.length - 1; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if (arr [i] + arr[j] == target) {
					System.out.println("Pair found:" + arr[i] +"," + arr[j] );
				}
				
			}
		}
		
	}
		

	

}