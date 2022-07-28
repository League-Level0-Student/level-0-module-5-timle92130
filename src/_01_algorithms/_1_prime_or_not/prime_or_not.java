package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class prime_or_not {
public static void main(String[] args) {
	// TODO Auto-generated constructor stub
			String input = JOptionPane.showInputDialog("give me a random number");
			System.out.println(input);
			int number = Integer.parseInt(input);
			for (int i=2; i<number; i++) {
				if(number%i==0) {
					System.out.println("not prime");
					System.exit(0);
				}
				
			}
			System.out.println("prime");
			
}
	public prime_or_not() {
		
	}

}
