package �ӿڵļ̳����;

interface InterfaceA
{
	String INFO="Hello World!";
	void print();
}
interface InterfaceB
{
	public abstract void get();
}
abstract class C implements InterfaceA,InterfaceB
{
	public abstract void fun();
}
interface InterfaceD extends InterfaceA,InterfaceB
{
	public void printD();
}
class X extends C implements InterfaceD
{
	public void print()
	{
		System.out.println(INFO);
	}
	public void get()
	{
		System.out.println("Hello!");
	}
	public void fun()
	{
		System.out.println("������Cʵ�ֽӿ�A,B");
	}
	public void printD()
	{
		System.out.println("�ӿ�D�̳нӿ�A,B");
	}
}
public class һ���ӿڼ̳ж���ӿ�
{
	public static void main(String[]args)
	{
		X x=new X();
		InterfaceA a=x;
		InterfaceB b=x;
		C c=x;
		InterfaceD d=x;
		a.print();
		b.get();
		c.fun();
		d.printD();
	}
}
