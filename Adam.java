package sri.com;
import java.util.*;
public class Adam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number");
     int n=sc.nextInt();
     int p1,p2,rem,p3,remm;
     p1=(int)Math.pow(n,2);
     
     int rev=0;
     while (n>0)
     {
    	 rem=n%10;
    	 rev=rev*10+rem;
    	 n=n/10;
     }
     p2=(int)Math.pow(rev,2);
	
	//System.out.println(p1+" "+p2);
     int s=p2;
     int rev1=0;
     while (s>0)
     {
    	 remm=s%10;
    	 rev1=rev1*10+remm;
    	 s=s/10;
     }
     System.out.println(p1+" "+rev1);
     if (p1==rev1)
     {
    	 System.out.println("adam number");
     }
     else
     {
    	 System.out.println("not a adam number");
     }
	}
}
