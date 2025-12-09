import java.util.*;
public class Main {

    public static void print(int n1, int n2)
    {
        int i=1;
        int j=1;
        while(i<=n1)
        {
            int pattern=3*j+2;
            if(pattern%n2==0)
            {
                j++;
            }
            else
            {
                i++;
                j++;
                System.out.println(pattern);
            }
        }

    }
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();

        print(n1,n2);

    }
}