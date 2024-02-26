class LocalVariable
{
 int a=50;
     public void display()
    {    
        int a=10;
        System.out.println(a);
        
    }
    
     public void show()
    {    
        int a=20;
        System.out.println(a);

    }
    
    public static void main(String args[])
    {
        LocalVariable obj=new LocalVariable();
        obj.display();
        obj.show();
    }
    }