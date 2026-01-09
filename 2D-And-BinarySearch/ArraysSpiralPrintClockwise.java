import java.util.*;
public class Main {
    public static void main(String args[]) 
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

        int left=0;
        int right=m-1;
        int top=0;
        int down=n-1;
        int count=0;
        while(count<n*m)
        {
            for(int i=left;i<right && count<n*m;i++)
            {
                System.out.print(arr[top][i]+", ");
                count++;
            }

            for(int i=top;i<down && count<n*m;i++)
            {
                System.out.print(arr[i][right]+", ");
                count++;
            }

            for(int i=right;i>left && count<n*m;i--)
            {
                System.out.print(arr[down][i]+", ");
                count++;
            }

            for(int i=down;i>top && count<n*m;i--)
            {
                System.out.print(arr[i][left]+", ");
                count++;
            }

            left++;
            right--;
            top++;
            down--;
        }

        System.out.print("END");

    }
}