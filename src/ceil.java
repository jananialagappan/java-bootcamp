public class ceil {
        public static void main(String[] args) {
            int[] arr={2,4,6,8,9,14,16,17};
            int target=15;
            int ans=search(arr,target);
            System.out.println(ans);
        }
        static  int search(int[] arr,int target)
        {
            int start=0;
            int end=arr.length-1;
            while (start<=end)
            {
                int mid=(start+end)/2;
                if(target>arr[mid])
                {
                    start=mid+1;
                } else if (target<arr[mid]) {
                    end=mid-1;

                }
                else {
                    return mid;
                }

            }
            return arr[start];
        }
    }


