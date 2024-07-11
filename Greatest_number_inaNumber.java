package sri.com;
import java.util.*;
public class Greatest_number_inaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0,rem;
		while (n>0)
		{
			rem=n%10;
			if (rem>a)
			{
				a=rem;
			}
			n=n/10;
		}
		System.out.println(a);

	}
}
