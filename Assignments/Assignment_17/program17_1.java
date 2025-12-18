//maximum of two number

class Logic
{
    void findMax(int a , int b)
    {
        if(a > b)
        {
            System.out.println("a is max:" +a);
        }
        else if(b > a)
        {
            System.out.println("b is max:"+b);
        }
        else
        {
            System.out.println("Both are equal:" +a);
        }
    }
}
class Assignment17_3
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    } 
}
