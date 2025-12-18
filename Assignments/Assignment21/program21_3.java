//Display all factors of a given number

class Logic
{
    void displayFactor(int num)
    {
        System.out.println("Factors of"+ num + " are:");
        
        for(int i = 1; i <= num; i++)
        {
            if((i % 2)== 0)
            {
                System.out.println(i);
            }
        }
        
    }
}
class Program21_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countEvenOdd(234);
    }
}