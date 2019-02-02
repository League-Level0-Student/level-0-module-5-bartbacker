package algorithms;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		boolean isprime=true;
		String num = JOptionPane.showInputDialog("number?");
		int numb = Integer.parseInt(num);
		
		if(numb % 2 == 0) {
			isprime=false;
		}
		else {
			for(int i = 3; i<numb;i+=2) {
				if(numb % i == 0) {
					isprime=false;
					break;
				}
			}
		}
		
		if(isprime) {
			System.out.println("PRIME");
		}
		else {
			System.out.println("NOT PRIME");

		}
		
		}
	}

