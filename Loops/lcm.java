import java.util.*;
public class Main {
    public static int gcd(int n1,int n2)
    {
        int divider=n1;
        int dividend=n2;

        while(divider!=0)
        {
            int rem=dividend%divider;
            if(rem==0)
            return divider;
            dividend=divider;
            divider=rem;
        }
        return 1;

    }
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();

        int lcm= (n1*n2)/gcd(n1,n2);
        System.out.println(lcm);

    }
}