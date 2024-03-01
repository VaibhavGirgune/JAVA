class Student
{
	int rollno;
	String name;
	static String clgname="Dyp";

	public static void main(String... args)
	{
	 Student s1 = new Student();
	 s1.rollno = 22;
	 s1.name = "vaibhav";

	 Student s2 = new Student();
	 s2.rollno=32;
	 s1.name="ram";
	System.out.println("Info of student");
    System.out.println("Roll no :" + s1.rollno +  "Name : " + s1.name + " " + Student.clgname);
    System.out.println("Roll no :" + s2.rollno  +  "Name : " + s2.name + " " + Student.clgname);
 

	}
}



