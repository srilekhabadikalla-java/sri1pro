package sri.com;
import java.util.*;
public class No_to_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rem;
		int rev=0;
	     while (n>0)
	     {
	    	 rem=n%10;
	    	 rev=rev*10+rem;
	    	 n=n/10;
	     }
	     n=rev;
	     while (n>0)
	     {
	    	 rem=n%10;
	    	 switch (rem)
	    	 {
	    	 case 0:System.out.print("Zero");
	    	 break;
	    	 case 1:System.out.print("One");
	    	 break;
	    	 case 2:System.out.print("Two");
	    	 break;
	    	 case 3:System.out.print("Three");
	    	 break;
	    	 case 4:System.out.print("Four");
	    	 break;
	    	 case 5:System.out.print("Five");
	    	 break;
	    	 case 6:System.out.print("Six");
	    	 break;
	    	 case 7:System.out.print("Seven");
	    	 break;
	    	 case 8:System.out.print("Eight");
	    	 break;
	    	 case 9:System.out.print("nine");
	    	 break;
	    	 
	    	 }
	    	 n=n/10;
	     }

	}

}
