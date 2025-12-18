//calculate the product of digits of a number

class Logic
{
    void productOfDigit(int num)
    {
        int product = 1;
        while(num != 0)
        {
            int digit = num % 10;
            product = product * digit;
            num = num / 10;
        }
        System.out.println("Product of digits:" +product);
    }
}
class Program21_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.productOfDigit(234);
    }
}