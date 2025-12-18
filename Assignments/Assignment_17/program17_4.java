//Multiplication table of a number
class Logic
{
    void printTable(int num)
    {

        for(i = 1; i <=10 ;i++)
        {
            System.out.println(num + " x " + i +" =" + (num * i));
        }
    }
}
class Assignment17_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}