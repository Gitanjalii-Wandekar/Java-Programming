//Print numbers from N down 1 in reverse order

class Logic
{
    void printReverse(int n)
    {
        if(n <= 0)
        {
            return;
        }
        System.out.println(n);
        printReverse(n - 1);
    }
}
class Assignment20_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printReverse(10);
    }
}