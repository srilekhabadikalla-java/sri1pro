package sri.com;
import java.util.*;
public class finfmiddlenum_odd_even_separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		
		n=n/10;//removing the last digit
		while (n>9)
		{
			rem=n%10;
			
			n=n/10;
			if (rem%2==0)
				System.out.println("even"+rem+" ");
			else
				System.out.println("odd"+rem+" ");
		}
		

	}

}
