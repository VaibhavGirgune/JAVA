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

class Switchcase {

    public static void main(String[] args) {
        int num = 5;
        switch (2.0) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("two");
                break;
            case 3:
                System.out.println("three");
                break;
            case 4:
                System.out.println("four");
                break;
            case 5:
                System.out.println("Five");
                break;
            default:
                System.out.println("This number is not present");
                break;
        }
    }
}
