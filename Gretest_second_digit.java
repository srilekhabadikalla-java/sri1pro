package sri.com;
import java.util.*;
public class Gretest_second_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int temp;
		temp=n;
		int rem;
		System.out.println("Enter the digit");
		int d=sc.nextInt();
		while (n>0)
		{
		 rem=n%10;
		 if (rem==d)
		 {
			 temp=temp-1;
			 n=temp;
		 }
		 else
		 {
			 n=n/10;
		 }
		 
		}
		System.out.println(temp);
	}

}
