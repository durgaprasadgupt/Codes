import java.util.*;
public class Main {
    public static void main(String args[]) 
    {
        Scanner s=new Scanner(System.in);
        int numberOfParatha=s.nextInt();
        int numberOfCooks=s.nextInt();
        int arr[]=new int[numberOfCooks];
        int duplicate[]=new int[numberOfCooks];

        int min=Integer.MAX_VALUE;
        for(int i=0;i<numberOfCooks;i++)
        {
            arr[i]=s.nextInt();
            min=Math.min(min,arr[i]);
        }

        Arrays.fill(duplicate,1);

        int count=0;
        for(int i=min;count<numberOfParatha;i++)
        {
            for(int j=0;j<numberOfCooks;j++)
            {
                int c=(duplicate[j]*(duplicate[j]+1)/2);
                if(c*arr[j]==i)
                {
                    count++;
                    duplicate[j]++;

                    // System.out.println("Inside If and arr[j] is: "+arr[j]+" and now duplicate[j] is: "+duplicate[j]);
                }
            }
            min=i;
        }
        System.out.println(min);
    }
}