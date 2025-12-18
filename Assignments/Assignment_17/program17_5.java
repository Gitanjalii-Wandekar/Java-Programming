//minimum of three number

class Logic
{
    void findMin(int a, int b, int c)
    {
        if( a < b && a<c)
        {
            System.out.println("a is min:" +a);
        }
        else if(b < a && b < c)
        {
            System.out.println("b is min:" +b);
        }
        else 
        {
            System.out.println("c is min:" +c);
        }

    }
}
class Assignment17_4
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.findMin(3 , 7 , 2);
    } 
}