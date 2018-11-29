package 类的专题研究3;

interface InterfaceA
{
	public String getInfo();
}
class B implements InterfaceA//类B实现接口InterfaceA
{
	public String getInfo()//覆写getInfo方法
	{
		return"Hello world!";
	}
}
public class 使用Object接收接口对象
{
	public static void main(String[]args)
	{
		InterfaceA a=new B();//向上转型，为接口实例化
		Object obj=a;//使用Object接受接口，向上转型
		InterfaceA x=(InterfaceA)obj;//向下转型
		System.out.println(x.getInfo());
	}
}
