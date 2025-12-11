import java.util.*;
public class Main {
    public static int nod(int n)
    {
        int digit=0;
        while(n>0)
        {
            digit++;
            n/=10;
        }
        return digit;
    }
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int digit=nod(n);
        int arr[]=new int[digit];
        int i=1;
        while(n>0)
        {
            int rem=n%10;
            arr[rem-1]=i;
            i++;
            n/=10;
        }

        int ans=0;

        for(int j=0;j<arr.length;j++)
        {
            ans+=(arr[j]*Math.pow(10,j));
        }
        System.out.println(ans);
    }
}