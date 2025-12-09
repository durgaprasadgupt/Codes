import java.util.*;
public class Main {
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        long n=s.nextLong();
        long ans=0;
        long i=0;
        while(n>0)
        {
            long rem=n%10;
            if(rem==0)
            rem=5;
            ans+=(rem*(long)(Math.pow(10,i++)));
            n/=10;
        }
        if(ans==0)
        ans=5;
        System.out.println(ans);

    }
}