package 多态;

class person
{
	public void fun1()
	{
		System.out.println("fun1 from super");
	}
	public void fun2()
	{
		System.out.println("fun2 from super");
	}
}
class student extends person
{
	public void fun1()
	{
		System.out.println("fun1 from class student");
	}
	public void fun3()
	{
		System.out.println("fun3 fronm class student");
	}
}
public class 多态的基本概念 
{
	public static void main(String[]args)
	{
		person p1=new person();
		p1.fun1();
		p1.fun2();
	}
}
