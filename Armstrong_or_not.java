package sri.com;
import java.util.*;
//import java.lang.*;
public class Armstrong_or_not {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int e[]= {1,121,3,153,12};
		for(int a:e) {
		int n=a;
		int temp=a;
		int rem,sum=0;
		int count=0;
		while (a!=0)
		{
			count++;//count=count+1;
			a=a/10;
		}
		while (n>0)
		{
			rem=n%10;
			int p=(int)Math.pow(rem,count);
			sum=sum+p;
			n=n/10;
		}
		if (sum==temp)
		{
			System.out.println("Number is a armstrong");
		}
		else
		{
			System.out.println("Number is not a armstrong");
		}
		/*Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int temp1=n;
		int temp2=n;
		int count=0;
		int rem;
		while (temp1>0)
		{
			rem=temp1%10;
			count++;	
		}
		int sum=0;
		int x,y;
		while (temp2>0)
		{
			rem=temp2%10;
			x=1;
			y=count;
			while (y>0)
			{
				x=x*rem;
				y--;
			}
				sum=sum+x;
				temp2=temp2/10;
		}
		if (sum==n)
		{
			System.out.println("Number is armstrong");
		}
		else
		{
			System.out.println("Number is not a armstrong");
		}

		*/

	}

}
}
