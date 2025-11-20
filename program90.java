import java.util.*;

class Digit
{
    public void DisplayDigits(int iNo)
    {
        int iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;          //Numbering system
            System.out.println(iDigit);
            iNo = iNo / 10;
        }
    }
}


class program90
{
    public static void main(String A[])
    {
        int iValue = 0;
       
        Scanner sobj = new Scanner(System.in);  //Input is always in main function never does the input/output

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        dobj.DisplayDigits(iValue);

        //Important
        sobj = null;
        dobj = null;

        System.gc();
    
    }
}