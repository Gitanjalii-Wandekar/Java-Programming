//Palindrome or not

class Logic
{
    void checkPalindrome(int num)
    {
        int original = num;
        int reversed = 0;

        while(num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num = num / 10;
        }
        if(original == reversed)
        {
            System.out.println(original + "is a palindrome");
        }
        else
        {
            System.out.println(original + "is not a palindrome");
        }
    }
}
class Assignment17_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPalindrome(121);// is a palindrome   122 is not a palindrome
    } 
}