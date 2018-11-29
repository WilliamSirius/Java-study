package 接口的继承相关;

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
		System.out.println("抽象类C实现接口A,B");
	}
	public void printD()
	{
		System.out.println("接口D继承接口A,B");
	}
}
public class 一个接口继承多个接口
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
