package algorithms;

public class Fibonacci {
	public static void main(String[] args) {

		int f0 = 0;
		int f1 = 1;
		int f2 = 0;
		while(f2<144) {
		f2=f1+f0;
		f0=f1;
		f1=f2;		
		System.out.println(f2);
		}
		
	}
}
