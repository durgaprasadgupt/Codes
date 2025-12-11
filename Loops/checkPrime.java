import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner s= new Scanner(System.in);
        int num=s.nextInt();
        boolean sign=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0)
            {
                sign=false;
                System.out.println("Not Prime");
                break;
            }
        }

        if(sign==true)
        {
            System.out.println("Prime");
        }

    }
}