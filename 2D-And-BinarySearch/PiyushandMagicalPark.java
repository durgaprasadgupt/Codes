import java.util.*;
public class Main {
    public static void main(String args[]) {
         Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int k=s.nextInt();
        int strength=s.nextInt();

        String arr[][]=new String[n][m];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=s.next();
            }
        }

// Note: For this question it is very important to consider that Piyush ka strength
// should always be greater than k then only he can move otherwise he is lost.
// I missed it earlier but realized after failing some test cases.
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j].equals("*"))
                {
                    if(j==m-1)
                    strength+=5;
                    else
                    strength+=4;
                }
                else if(arr[i][j].equals("."))
                {
                    if(j==m-1)
                    strength-=2;
                    else
                    strength-=3;
                }
                else if(arr[i][j].equals("#"))
                {
                    break;
                }
                if(strength<=k)
                {
                    break;
                }
            }
            // System.out.println("Strength at row "+(i+1)+" is: "+strength);
            if(strength<=k)
            break;
        }

        if(strength>=k)
        {
            System.out.println("Yes");
            System.out.println(strength);
        }
        else
        {
            System.out.println("No");
            // System.out.println(strength);
        }

    }
}
