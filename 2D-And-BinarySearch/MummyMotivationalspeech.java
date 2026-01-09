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

        boolean ans=true;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>i && arr[i][j]!=0)
                {
                    ans=false;
                    break;
                }
            }
            if(ans==false)
            break;
        }

        System.out.println(ans);

    }
}