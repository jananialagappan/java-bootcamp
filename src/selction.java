import java.util.Arrays;

public class selction {
    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionsort(int[] arr)
    {
        for(int i=0;i< arr.length;i++)
        {
            int last=arr.length-i-1;
            int maxindex=getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }

    }
    static void swap(int[] arr,int maxindex,int last)
    {
        int temp=arr[maxindex];
        arr[maxindex]=last;
        arr[last]=temp;

    }

    static int getmaxindex(int[] arr,int start,int end)
    {
        int max=start;
        for (int i=start;i<=end;i++) {
            if (arr[start] < arr[i]) {
            max=i;
            }
        }
        return max;
    }
}
