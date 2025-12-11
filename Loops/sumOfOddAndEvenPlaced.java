import java.util.*;
public class Main {
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int number = s.nextInt();

        int evenPlaced=0;
        int oddPlaced=0;

        int i=1;
        while(number>0)
        {
            int rem=number%10;
            if(i%2==0)
            {
                evenPlaced+=rem;
            }
            else
            {
                oddPlaced+=rem;
            }
            i++;
            number/=10;
        }
        System.out.println(oddPlaced);
        System.out.println(evenPlaced);


    }
}