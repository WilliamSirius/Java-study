package 多态;

class father
{
	public static void overwriting()
	{
		System.out.println("Father method");
	}
}
class son extends father
{
	public static void overwriting()
	{
		System.out.println("Son method");
	}
}
public class 隐藏子类的成员 //应用不广泛仅作了解
{
	public static void main(String[]args)
	{
		father dad=new father();
		dad.overwriting();//通过“类名.静态方法”可以直接访问静态方法
		
		father.overwriting();
		son.overwriting();
	}
}
