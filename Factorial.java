package sri.com;
import java.util.*;
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		/*int fact=1;
		if (n==0)
				{
			System.out.println(fact);
				}
		else
		{
			while (n>0)
			{
				fact=fact*n;
				n=n-1;
			}
            System.out.println(fact);
		}*/
		int fact=1;
		if( n==0)
				System.out.println(fact);
		else
		{
			int i=1;
			while (i<=n)
			{
				fact=fact*i;
				i++;
			}
		
		System.out.println(fact);
		}
	}

}
