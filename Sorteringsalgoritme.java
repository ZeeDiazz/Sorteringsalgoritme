class Sorteringsalgoritme {
	public static void main(String[] args) {
 		int [] num = {5,2,47,7,23,13,41,29,53,11};

		sort(num);
		printArray(num);
 }

	public static int[] sort(int[] arr){
		for (int i = 1; i <  arr.length; i++) {
				int key = arr[i];
				int j = i-1;

				while ( j >= 0 && arr[j] > key ) {
						arr [j+1] = arr[j];
						j--;
				}
				arr[j+1] = key;
		}
		return arr;
	}

	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}

	}
}
