public class parameterizedmethods {
    public static void main(String[] args)
    {
        String name="Janani";
        String ans=greet(name);
        System.out.print(ans);

    }
    static String greet(String name)
    {
        String greeting="Hello "+name;
        return greeting;
    }
}
