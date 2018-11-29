package 多态;

public class 对象多态性的使用 //方法的多态性
{
	void sum(int i)
	{
		System.out.println("sum of nums is "+i);
	}
	void sum(int i,int j)
	{
		System.out.println("sum of nums is "+(i+j));
	}
	public static void main(String[]args)
	{
		对象多态性的使用 demo=new 对象多态性的使用();
		demo.sum(1);
		demo.sum(1,2);
	}
}
