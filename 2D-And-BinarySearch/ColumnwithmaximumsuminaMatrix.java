import java.util.*;
public class Main {
    public static void main (String args[]) 
    {
         Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }

        int max=Integer.MIN_VALUE;
        int index=1;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<n;j++)
            {
                sum+=arr[j][i];
            }
            
            if(sum>max)
            {
                index=i+1;
                max=sum;
            }
            sum=0;
        }

        System.out.println(index+" "+max);

    }
}