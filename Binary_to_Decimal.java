package sri.com;
import java.util.*;
import java.lang.*;
public class Binary_to_Decimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*int n=sc.nextInt();
		int sum=0;
		int p;
		int i=0;
		int rem;
		while (n>0)
		{
			rem=n%10;
			n=n/10;
			p=(int)Math.pow(2,i);
			sum=(rem*p)+sum;
			i++;		
		}
		System.out.println(sum);*/
		int bnum,dnum=0,rem,base=1;
		bnum=sc.nextInt();
		while (bnum>0)
		{
			rem=bnum%10;
			dnum=dnum+rem*base;
			bnum=bnum/10;
			base=base*2;
		}
		System.out.println(dnum);
		
		

	}
}
