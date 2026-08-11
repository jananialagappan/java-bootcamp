public class stringpalindrome {
    public static void main(String[] args) {
        String s="abcdcba";
        System.out.println(isPalindrome(s));
    }
    static String isPalindrome(String s)
    {
        s=s.toLowerCase();
        for(int i=0;i<s.length()/2;i++)
        {

            char start=s.charAt(i);
            char end=s.charAt(s.length()-1-i);
            if(start!=(end))
            {
                return "Not palindrome";
            }
        }
        return "palindrome";

    }
}
