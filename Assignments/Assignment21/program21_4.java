//Count total numbers of factors of a given numbers

class Logic
{
    void displayFactor(int num)
    {
        int iCnt = 0;
        
        for(int i = 1; i <= num; i++)
        {
            if((i % 2)== 0)
            {
                iCnt++;
            }
        }
        System.out.println("Total number of factors=" +count);
        
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