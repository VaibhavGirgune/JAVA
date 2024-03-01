class Controlstatementmark
{
     public static void main(String args[])
    {
        int marks=96;
        if(marks>=75 && marks<=100)
        {
            
            System.out.println("Grade A+");
            if(marks>=95 && marks<=100)
            {
                System.out.println("Congratulations you get free education");
            }
        }
        else if(marks>=60 && marks<75)
        {
            System.out.println("Grade A");
        }
        else if(marks>=45 && marks<60)
        {
            System.out.println("Grade B");
        }
        else if(marks>=35 && marks<45)
        {
            System.out.println("Grade C");
        }
        else
        {
            System.out.println("Hard luck");
        }
        
    }
}