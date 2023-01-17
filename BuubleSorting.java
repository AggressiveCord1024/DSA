package sorting;

public class BuubleSorting {

	public static void main(String[] args) {

		int[] arr = {6,5,4,3,2,1};
		int swap = 0;
		
		for(int turn =0;turn<arr.length-1;turn++) {
			for(int j = 0;j<arr.length-1-turn;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swap++;
				}
			}
		}
		System.out.println(swap);
		
//		for(int i =0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
		
	}

}
