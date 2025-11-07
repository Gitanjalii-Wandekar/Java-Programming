//Find the sum of all even numbers up to N

class Logic
{
    void sumEvenNumbers(int n)
    {
        int sum = 0;
        for(int i = 2; i <= n; i++)
        {
            sum += i;
        } 
        System.out.println("The sum of even numbers up to " + n +"is :" + sum);
    }
}
class Assignment20_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.sumEvenNumbers(10);
    }
}