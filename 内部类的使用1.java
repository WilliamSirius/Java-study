package ���ר���о�4_�ڲ���;

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
public class �ڲ����ʹ��1 
{
	public static void main(String[]args)
	{
		Outer outer=new Outer();
		outer.inst();
	}
}
