//Print all numbers from 1 to N that are divisible by both 2 and 3

class Logic
{
    void printDivisible(int num)
    {
        System.out.println("Numbers divisble by both 2 and 3:");
        
        for(int i = 1; i <= num; i++)
        {
            if((i % 2)== 0 && (i % 3 )==0)
            {
                System.out.println(i);
            }
        }
        
    }
}
class Program21_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printDivisible(234);
    }
}