package sri.com;
import java.util.*;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1;
		int sum1=0;
		int sum2=0;
		int a=10;
		while (i<=a)
		{
			if (i%2==0)
			{
			sum1=sum1+i;
			}
			else
			{
			sum2=sum2+i;
			}
		i++;
		}
		System.out.println(sum1);
		System.out.println(sum2);
	}
}
