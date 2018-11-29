package 接口;

interface Interface1//定义接口Interface1
{
	public static final String INFO="Hello world!";
	public abstract void print();
}
interface Interface2//定义接口Interface2
{
	public abstract void print();
	public abstract void get();
}
class X implements Interface1,Interface2//用字类实现两个接口Interface1、Interface2
{
	public void print()//一个类继承多个接口时接口中不能出现同名的默认方法
	{
		System.out.println(INFO);
	}
	public void get()
	{
		System.out.println("Hello!");
	}
}
public class 子类继承多个接口的应用
{
	public static void main(String[]args)
	{
		X x=new X();//实例化字类对象
		x.print();//调用方法
		x.get();//调用方法
		Interface1 a=x;//为父接口实例化
		Interface2 b=x;//为父接口实例化
		a.print();
		b.get();
	}
}
