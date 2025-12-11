import java.util.*;
public class Main {
    public static int countRevision(int number, int n)
    {
        int count=0;
        while(number>0)
        {
            int rem=number%10;
            if(rem==n)
            count++;

            number/=10;
        }

        return count;
    }
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int number = s.nextInt();
        int n=s.nextInt();

        System.out.println(countRevision(number,n));

    }
}