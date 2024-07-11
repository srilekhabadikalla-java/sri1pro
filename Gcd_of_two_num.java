package sri.com;
import java.util.*;
public class Gcd_of_two_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int num,den,rem;
		if (n1<n2)
		{
			num=n2;
		    den=n1;
		}
		else
		{
		    num=n1;
		    den=n2;
		}
		rem=num%den;
		while (rem!=0)
		{
			num=den;
			den=rem;
			rem=num%den;
		}
		  System.out.println("GCD of two num is="+den);  
	}

}
