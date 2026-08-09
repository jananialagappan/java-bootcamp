public class Strings {
    public static void main(String[] args) {
        String a="Kunal";
        String b="Kunal";
        System.out.println(a == b);
        System.out.println(a.equals(b));


        String n1= new String("abc");
        String n2=new String("abc");
        System.out.println(n1==n2);
        System.out.println(n1.equals(n2));

        System.out.println(n1.charAt(0));
        //concatenation
        System.out.println('a'+'b');//ascii
        System.out.println("a"+"b");//concatenation
        System.out.println((char)('a'+3));//typecasting
        System.out.println("a"+1);//concatenation
    }
}
