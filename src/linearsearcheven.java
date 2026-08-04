public class linearsearcheven {
    public static void main(String[] args) {
       int[] num={2,34,567,89,67,77};
       int ans=countofevennodigits(num);
       System.out.println(ans);
    }
    static int countofevennodigits(int[] num)
    {
        int count=0;
        for(int i=0;i< num.length;i++) {
            if (iseven(num[i])) {
                count++;
            }
        }
        return count;
    }
    static boolean iseven(int num)
    {

        if(digits(num)%2 == 0)
        {
            return true;
        }
        return false;

    }
    static int digits(int num)
    {
        int count=0;
        while(num>0)
        {
            count++;
           num= num/10;
        }
        return count;
    }
}