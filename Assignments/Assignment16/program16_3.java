//Factorial of number using loop

class Logic
{
    void findFactorial(int num)
    {
        int fact = 1;
        int iCnt = 0;
        for(iCnt = 1; iCnt <= num; iCnt++)
        {
            fact = fact * i;
        }
        
        System.out.println("Factorial of", + num + " = " + fact);
    }
}
class program16_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}