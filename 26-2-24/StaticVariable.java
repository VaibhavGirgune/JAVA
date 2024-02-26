class StaticVariable
{
    static int i=20;
   public static void main(String args[])
  {
    StaticVariable sv=new StaticVariable();
    sv.show();
    System.out.println(StaticVariable.i);

  }

    public void show()
    {    
        System.out.println(StaticVariable.i);
    }
}