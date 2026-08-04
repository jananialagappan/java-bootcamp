public class search {
    public static void main(String[] args) {
        int[] arr={1,2,3,7,8,9};
        int target=8;
        System.out.println(search(arr,target));
    }
    static int search(int[] arr,int target)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(target==arr[i])
            {
                return i;
            }
        }
        return -1;
    }
}
