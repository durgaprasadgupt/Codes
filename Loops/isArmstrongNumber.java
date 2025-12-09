import java.util.*;
public class Main {
    public static int nog(int number)
    {
        int count=0;
        while(number>0)
        {
            count++;
            number/=10;
        }
        return count;
    }

    public static boolean isArmstrong(int number, int nod)
    {
        int sum=0;
        int temp=number;
        while(number>0)
        {
            int rem=number%10;
            sum+=Math.pow(rem,nod);
            number/=10;
        }
        if(sum==temp)
        return true;
        return false;
    }
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int number=s.nextInt();
        int numberOfDigit=nog(number);
        System.out.println(isArmstrong(number,numberOfDigit));

    }
}
