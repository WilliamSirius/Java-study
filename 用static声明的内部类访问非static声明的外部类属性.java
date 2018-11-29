package 类的专题研究4_内部类;

class StaticInnerClassTest
{
	private int prop1=5;
	private static int prop2=9;
	void display()
	{
		StaticInnerClass in=new StaticInnerClass();
		in.display();
	}
	public class StaticInnerClass
	{
		
		public void display()
		{
			System.out.println(prop1);
			System.out.println(prop2);
		}
	}
}
public class 用static声明的内部类访问非static声明的外部类属性 
{
	public static void main(String[]args)
	{
		StaticInnerClassTest outer=new StaticInnerClassTest();
		outer.display();
	}
}
