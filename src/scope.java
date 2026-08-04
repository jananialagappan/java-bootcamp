public class scope {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        {
            a=60;
            System.out.println(a);
            int c=6;
        }
        System.out.println(a);//wont show error as its already outside
       // System.out.println(c);//shoes error out of block
    }
}
