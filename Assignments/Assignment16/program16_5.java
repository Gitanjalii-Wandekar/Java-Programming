//count the number of digit in a given number

class Logic
{
    void countDigits(int num)
    {
        int iCnt = 0;
        
        while(num != 0)
        {
            iCnt++;
            num = num/10;
        }
        System.out.println("Number of digits=" + iCnt);
    }
}
class Assignment16_5
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.countDigits(7865);
    }
}