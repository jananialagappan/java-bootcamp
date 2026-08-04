import java.util.Scanner;

public class inputs {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your rolno:");
        int rolno=sc.nextInt();
        System.out.println("My roll num is "+rolno);
        //sum of 2 nums
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum=n1+n2;
        System.out.println("Sum of 2 nums is"+sum);
    }
}
