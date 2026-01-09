import java.util.*;
public class Main {
    public static void main(String args[]) {
        // Your Code Here
        Scanner s=new Scanner(System.in);
        int t=s.nextInt();

        while(t-->0)
        {
            long n=s.nextLong();
            int k=s.nextInt();

            if(n==1)
            {
                System.out.println("1");
                continue;
            }

            if(k==1)
            {
                System.out.println(n);
                continue;
            }

            long fAns=1;
            for(long i=1;i<=n/k;i++)
            {
                long ans=1;
                boolean sign=true;
                for(int j=1;j<=k;j++)
                {
                    ans*=i;
                    if(ans>n)
                    {
                        fAns=i-1;
                        sign=false;
                        break;
                    }
                }

                if(sign==false)
                break;

                if(ans>n)
                {
                    fAns=i-1;
                    break;
                }
                else if(ans==n)
                {
                    fAns=i;
                    break;
                }
            }
            System.out.println(fAns);
        }
    }
}
