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

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j<i)
                arr[i][j]=0;
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}