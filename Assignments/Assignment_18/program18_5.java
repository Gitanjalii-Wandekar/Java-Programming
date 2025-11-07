//check whether a number is positive, negative or zer

class Logic
{
    void checkSign(int num)
    {
        if(num > 0)
        {
            System.out.println("Number is positive" +num);
        }
        else if(num < 0)
        {
            System.out.println("Number is negative" +num);
        }
        else 
        {
            System.out.println("Number is zero" +num);
        }
    }
}

class Assignment18_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.checkSign(-8);
    }
}
