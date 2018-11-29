package 类的专题研究4_内部类;

class Outer
{
	int score=95;
	void inst()
	{
		Inner in=new Inner();
		in.display();
	}
	public class Inner
	{
		String name="Jack";
		void display()
		{
			System.out.println("score="+score);
		}
	}
}
public class 内部类的使用1 
{
	public static void main(String[]args)
	{
		Outer outer=new Outer();
		outer.inst();
	}
}
