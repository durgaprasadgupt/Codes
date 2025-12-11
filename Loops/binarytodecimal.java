import java.util.*;
public class Main {
    public static void binaryToDecimal(int n)
    {
        int i=0;
        int ans=0;
        while(n>0)
        {
            int rem=n%10;
            ans+=(rem*Math.pow(2,i++));
            n/=10;
        }
        System.out.println(ans);
    }
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        binaryToDecimal(n);
    }
}