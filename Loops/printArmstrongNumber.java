import java.util.*;
public class Main {
    public static boolean isArmstrong(int num, int digit)
    {
        int sum=0;
        int temp=num;
        while(num>0)
        {
            int rem=num%10;
            sum+=Math.pow(rem,digit);
            num/=10;
        }
        if(sum==temp)
        return true;
        return false;
    }
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();

        int digit=0;
        for(int i=n1;i<=n2;i++)
        {
            if(i<10)
            digit=1;
            else if(i>=10 && i<100)
            digit=2;
            if(i>=100 && i<1000)
            digit=3;
            else if(i>=1000 && i<10000)
            digit=4;
            else
            digit=5;
            boolean ans= isArmstrong(i,digit);
            if(ans==true)
            System.out.println(i);
        }
    }
}
