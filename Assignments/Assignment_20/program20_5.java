//smallest digit in a given number

class Logic
{
    void findLargestDigit(int num)
    {
        int largestDigit = 0;
        while(num > 0)
        {
            int digit = num % 10;
            if(digit > largestDigit)
            {
                largestDigit = digit;
            }
            num =  num / 10;
        }
        System.out.println("the largest digit is:" +largestDigit);
    }
}
class Program
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findLargestDigit(83429);
    }
}