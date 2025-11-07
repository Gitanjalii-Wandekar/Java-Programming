//chech whether the year is leap or not 

class Logic
{
    void checkLeapYear(int n)
    {
        if(n % 4 == 0 && n % 100 != 0 || (n % 400 ==0))  //either first or second condition
        {
            System.out.println(n + " is a Leap Year ");
        }
        else
        {
            System.out.println(n+ "is not a Leap Year:");
        }

    }
}

class Assignment18_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkLeapYear(2024);
    }
}
