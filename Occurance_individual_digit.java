package sri.com;
import java.util.*;
public class Occurance_individual_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int temp = n;
        while (temp > 0) {
            int d = temp % 10;  
            int count = 0;      

            int temp2 = n;      
            while (temp2 > 0) {
                int rem = temp2 % 10;
                if (rem == d) {
                    count++;
                }
                temp2 = temp2 / 10;
            }

            System.out.println(d + " count is " + count);
            temp = temp / 10;   
        }
    }
}
