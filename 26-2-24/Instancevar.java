class Instancevar
{
	int a=40;
	public static void main(String args[])
	{
	Instancevar v = new Instancevar();
	v.a=30;
	System.out.println(v.a);

	Instancevar g =new Instancevar();
	System.out.println(g.a); 

	Instancevar vg =new Instancevar();
	vg.a=40/2;
	System.out.println(vg.a); 


	}
}
