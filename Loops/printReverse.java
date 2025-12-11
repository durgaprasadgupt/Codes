import java.util.*;
public class Main {
    public static int reverse(int num)
    {
        int reverseNumber=0;
        while(num>0)
        {
            int rem=num%10;
            reverseNumber=reverseNumber*10+rem;
            num/=10;
        }
        return reverseNumber;
    }
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        System.out.println(reverse(num));
    }
}
