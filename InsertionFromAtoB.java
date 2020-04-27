class InsertionFromAtoB {

	public static void sort(Comparable[] arr, int a,int b) {
		for (int i = a; i < b; i++) { 
			for (int j = i ; j > a; j--) {
				if (arr[j].compareTo(arr[j - 1]) < 0) {
					exch(arr, j, j - 1);
				}
			}
		}
	}

	public static void exch(Comparable[] arr, int a,int b){
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}	

}