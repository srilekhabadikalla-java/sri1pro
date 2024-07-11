package sri.com;
import java.util.*;
public class Count_no_ofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0;
		while (a!=0)
		{
			count++;//count=count+1;
			a=a/10;
		}
		System.out.println(count);
	}

}
