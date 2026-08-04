import java.util.Scanner;

public class Armstrongnum {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isArmstrong(n));
        for(int i=100;i<1000;i++)
        {
            if(isArmstrong(i))
            {
                System.out.print(i+" ");
            }
        }
    }
    static boolean isArmstrong(int num)
    {
        int og=num;
        int sum=0;
        while(num>0)
        {
            int digit=num%10;

            sum=sum+digit*digit*digit;
            num/=10;
        }
        if(og == sum)
        {
           return true;
        }
        return false;
    }
}
