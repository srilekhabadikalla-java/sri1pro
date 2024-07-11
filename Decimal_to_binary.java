package sri.com;
import java.util.*;
public class Decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int dnum,bnum=0,rem,base=1;
		dnum=sc.nextInt();
		while (dnum>0)
		{
			rem=dnum%2;
			bnum=bnum+rem*base;
			dnum=dnum/2;
			base=base*10;
		}
		System.out.println(bnum);
		
		

	}

}
