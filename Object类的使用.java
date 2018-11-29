package 类的专题研究1;

class person extends Object//Object类是Java中最大的类，没有父类
{
	String name="Jack";
	int age=18;
}
public class Object类的使用
{
	public static void main(String[]args)
	{
		person p=new person();
		System.out.println(p);
		System.out.println(p.toString());
	}
}
