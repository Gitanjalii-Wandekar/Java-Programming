//Grade of the students based on the marks

class Logic
{
    void displayGrade(int marks)
    {
        if(marks <= 90 && marks >=80)
        {
            System.out.println("A Grade :" +marks);
        }
        else if( marks <= 80 && marks >= 70)
        {
            System.out.println("B Grade :" +marks);
        }
        else if( marks <= 70 && marks >= 60)
        {
            System.out.println("C Grade :" +marks);
        }
        else 
        {
            System.out.println("Below average :" +marks );
        }
    }
}

class Assignment19_2
{
    public static void main(String A[])
    {
        Logic obj = new Logic();
        obj.displayGrade(82);
    }
}
