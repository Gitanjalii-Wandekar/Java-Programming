//write a program to count how many even and odd numbers are present between 1 and N

class Logic
{
    void countEvenOdd(int num)
    {
        int even = 0, odd= 0;
        
        for(int i = 1; i <= n; i++)
        {
            if((i % 2)== 0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("Even numbers are:" ,even);
        System.out.println("Odd numbers are:" ,odd);
    }
}
class Program21_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOdd(234);
    }
}