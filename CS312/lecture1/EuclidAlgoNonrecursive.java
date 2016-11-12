package lecture1;

public class EuclidAlgoNonrecursive {
	public static void main(String[] args){
		int m=30,n=5,r=0;
		while(n!=0){
			r=m%n;
			m=n;
			n=r;
		}
		System.out.println("The gcd is" +m);
	}

}
