class ImprovedMergeSort{
	public static void sort(Comparable[] a){
		Comparable[] aux = new Comparable[a.length];
		sort(a, aux, 0, a.length-1);
		// a = aux;
	}
	public static void sort(Comparable[] a,Comparable[] aux,int lo, int hi){
		if(hi <= lo) return;
		if (hi - lo <= 7) {
			InsertionFromAtoB.sort(a,lo,hi);
		}
		int mid = lo + (hi - lo) / 2;
		sort(a, aux, lo, mid);
		sort(a, aux, mid + 1, hi);
		if (a[mid + 1].compareTo(a[mid]) >= 0) {
			return;
		}
		merge(a, aux, lo, mid, hi);
	}
	public static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi){
		assert isSorted(a, lo, mid); // precondition a[lo..mid] sorted
		assert isSorted(a, mid + 1, hi); // precondition a[mid+1..hi] sorted

		for (int i = lo; i <= hi; i++) {
			aux[i] = a[i];
		}
		int i = lo, j = mid + 1;
		for (int k = lo; k <= hi; k++) {
			if (i > mid) a[k] = aux[j++];
			else if (j > hi) a[k] = aux[i++];
			else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
			else a[k] = aux[i++];
		}
		assert isSorted(a,lo,hi); // postcondition a[li..hi] sorted
	}
	public static boolean isSorted(Comparable[] a, int lo,int hi){
		for (int i = lo; i <= hi; i++) {
			if(!(a[i].compareTo(a[i]) >= 0)){
				assert false;
			}
		}
		return true;
	}

}