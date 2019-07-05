
public class GCD {
	
	public static int gcd(int first,int second) {
		int remainder = 1;
		
		while (remainder > 0) {
			remainder = first % second;
			first = second;
			second = remainder;
		}
		
		return(first);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(gcd(12,20));
	}

}
