import java.util.*;
public class Main {
    public static void leastPossible(long num)
    {
        long sum=0;
        long i=0;
        while(num>0)
        {
            long rem=num%10;
            if(rem>9-rem)
            {
                if(!(num<10 && 9-rem==0))
                rem=9-rem;
            }

            sum+=(rem*Math.pow(10,i++));
            num/=10;
        }
        System.out.println(sum);
    }
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        long num=s.nextLong();
        leastPossible(num);
    }
}
