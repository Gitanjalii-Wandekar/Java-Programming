//Calculate the power of a number using loop

class Logic
{
    void CalculatePower(int base , int exp)
    {
        int result = 1;
        for(int i = 0; i < exp ; i++)
        {
            result = result * base ;
        }
        System.out.println(base +"to the power of " + exp + " is :" +result);

    }
}
class Assignment19_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.CalculatePower(2, 5);
    }
}