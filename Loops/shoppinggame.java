import java.util.*;
public class Main {
    public static void main(String args[]) 
    {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();

        while(n-->0)
        {
            int ayush=s.nextInt();
            int harshit=s.nextInt();

            int roundAyush=1;
            int roundHarshit=2;

            int AyushSum=1;
            int HarshitSum=2;

            while(AyushSum<=ayush && HarshitSum<=harshit)
            {
                roundAyush+=2;
                AyushSum+=roundAyush;
                // System.out.println("AyushSum is "+AyushSum +" roundAyush is "+roundAyush);
                if(AyushSum>ayush)
                break;
                roundHarshit+=2;
                // System.out.println("HarshitSum is "+HarshitSum +" roundHarshit is "+roundHarshit);
                HarshitSum+=roundHarshit;
                if(HarshitSum>harshit)
                break;
            }
            if(AyushSum>ayush)
            System.out.println("Harshit");
            else
            System.out.println("Aayush");
        }

    }
}