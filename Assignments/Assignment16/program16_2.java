//Check whether a given numbers is even or odd

class Login
{
    void checkEvenOdd(int num)
    {
        if((num % 2)==0)
        {
            System.out.println("Number is even");
        }
        else
        {
            System.out.println("Number is odd");
        }

    }
}
class program16_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkEvenOdd(7);
    }
}
