public class orderAgnosticSearch {
    public static void main(String[] args) {
        int[] arr={34,15,12,5,3,1};
        int target=3;
        int ans=search(arr,target);
        System.out.println(ans);
    }
    static int search(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }
            boolean isAsc=arr[start]<arr[end];

            if(isAsc)
            {
                if(target>arr[mid])
                 {
                   start=mid+1;
                 }
                else if (target<arr[mid]) {
                    end = mid - 1;
                }
            }
            else
            {
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else if (target<arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
