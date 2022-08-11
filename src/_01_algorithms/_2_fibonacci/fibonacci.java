package _01_algorithms._2_fibonacci;

public class fibonacci {
public static void main(String[] args) {


int secondLast = 0 ; 
 int last = 1;
System.out.println(secondLast);
System.out.println(last);
for (int i = 0; i < 9; i++) {
	int next = secondLast + last;
	System.out.println(next);
	secondLast = last;
	last = next; 

}
}
}
