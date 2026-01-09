import java.util.*;
public class Main {
    public static void main (String args[]) 
    {
        Scanner s=new Scanner(System.in);
        long n=s.nextLong();

        if(n==1)
        {
            System.out.println("1");
            return;
        }

        long ans=1;
        for(long i=0;i<=n/2;i++)
        {
            if(i*i>n)
            {
                ans=i-1;
                break;
            }
            else if(i*i==n)
            {
                ans=i;
                break;
            }
        }
        System.out.println(ans);

    }
}