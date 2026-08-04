public class maxvaluearray {
    public static void main(String[] args) {
        int[] arr={23,67,89,90,70};
        System.out.println(max(arr));
        System.out.println(maxrange(arr,0,2));
    }
    static int max(int[] arr)
    {
        int maximum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
    static int maxrange(int[] arr,int start,int end)
    {
        int maximum=arr[start];
        for(int i=start;i<=end;i++)
        {
            if(arr[i]>maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
