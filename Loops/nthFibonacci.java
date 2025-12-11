import java.util.*;
public class Main {
    public static void main(String args[]) 
    {
        // Your Code Here
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int first = 0;
        int second = 1;
        if(n==0)
        {
            System.out.println(first);
            return;
        }
        else if(n==1)
        {
            System.out.println(second);
            return;
        }

        for(int i=2;i<=n;i++)
        {
            int third=first+second;
            first=second;
            second=third;
        }
        System.out.println(second);
        
    }
}
