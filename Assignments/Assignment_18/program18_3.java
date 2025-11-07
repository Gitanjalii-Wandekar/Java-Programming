//Print all the odd numbers

class Logic
{
    void printOddnumbers(int n)
    {
        
        for (int i = 1 ;i <= n; i++)
        {
             if( i % 2!= 0)
             {
                System.out.println(i);
             }
        }
    }
}

class Assignment18_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printOddnumbers(20);
    }
}
