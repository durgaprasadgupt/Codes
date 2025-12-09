import java.util.*;
public class Main {
    public static void answer(int first)
    {
        int evn=0;
        int odd=0;
        while(first>0)
        {
            int rem=first%10;
            if(rem%2==0)
            evn+=rem;
            else
            odd+=rem;

            first/=10;
        }

        if(evn%4==0 || odd%3==0)
        System.out.println("Yes");
        else
        System.out.println("No");
    }

    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        while(n-->0)
        {
            int first=s.nextInt();
            answer(first);
        }

    }
}