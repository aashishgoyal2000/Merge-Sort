class Client{
	public static void main(String[] args) {
		Integer[] temp1 = {new Integer(1), new Integer(5), new Integer(8), new Integer(7),new Integer(100), new Integer(11), new Integer(2), new Integer(10)};
		ImprovedMergeSort.sort(temp1);
		for (int i = 0; i < temp1.length; i++) {
			System.out.println(Integer.parseInt(temp1[i]));
		}
	}
}