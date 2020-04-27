import java.lang.Comparable;
class Integer implements Comparable<Integer> {
	
	int x;
	Integer(int x){
		this.x = x;
	}
	
	@Override
	public int compareTo(Integer temp){
		return compare(this.x,temp.x);
	}
	
	public int compare(int x,int y){
		if(x > y) return 1;
		else if(y == x) return 0;
		else return -1;
	}
	
	public static int parseInt(Integer temp){
		return temp.x;
	}
}