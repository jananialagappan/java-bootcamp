import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];//declaration initialization
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();//inputs
        }
        System.out.println(Arrays.toString(arr));//outputs
        String[] names=new String[4];
        for(String s:names)
        {
            System.out.println(s);//for each loop
        }
        names[0]="Jan";
        System.out.println(Arrays.toString(names));
    }
}
