//Program to reverse a number

class Logic
{
    void reverseNumber(int num)
    {
        int rev = 0;

        while (num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/ 10;
        }
        System.out.println("Reversed number=" + rev);
    }
}
class program16_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(1234);
    }
}