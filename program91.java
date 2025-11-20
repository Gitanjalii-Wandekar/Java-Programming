import java.util.*;

class Digit
{
    public int SumDigits(int iNo)
    {
        int iDigit = 0;
        int iSum =0;
        
        while(iNo != 0)
        {
            iDigit = iNo % 10;          //Numbering system
            iSum = iSum + iDigit;
            iNo = iNo / 10;
        }
        return iSum;
    }
}


class program91
{
    public static void main(String A[])
    {
        int iValue = 0;
        int  iRet = 0;
       
        Scanner sobj = new Scanner(System.in);  //Input is always in main function never does the input/output

        System.out.println("Enter number:");
        iValue = sobj.nextInt();

        Digit dobj = new Digit();
        iRet =dobj.SumDigits(iValue);

        System.out.println("Addition of digits:" +iRet);

        //Important
        sobj = null;
        dobj = null;

        System.gc();
    
    }
}