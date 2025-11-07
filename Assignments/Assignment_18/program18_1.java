//Check whether Number is prime or not

class Logic
{
    void checkPrime(int num)
    {
        int count = 0;

        if(num <= 1)
        {
            System.out.println(num + "is not a prime number:");
            return ;
        }
        boolean isPrime = true;
        for(int i =2; i <= num/2; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
            }
        }
        if(isPrime)
        {
            System.out.println(num +"is a prime number");
        }
        else
        {
            System.out.println(num +"is not a prime number");
        }
    }
}
class Assignment18_1
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }

}