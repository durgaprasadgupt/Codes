import java.util.*;
public class Main {
    public static void makeAllOnes(int[][]ans, int row, int column)
    {
        for(int i=0;i<ans[0].length;i++)
        ans[row][i]=1;

        for(int i=0;i<ans.length;i++)
        ans[i][column]=1;
    }
    public static void main (String args[]) 
    {
         Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();

        int arr[][]=new int[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }

        
        int ans[][]=new int [n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==1)
                makeAllOnes(ans,i,j);
            }
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}