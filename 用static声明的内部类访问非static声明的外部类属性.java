package ���ר���о�4_�ڲ���;

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
public class ��static�������ڲ�����ʷ�static�������ⲿ������ 
{
	public static void main(String[]args)
	{
		StaticInnerClassTest outer=new StaticInnerClassTest();
		outer.display();
	}
}
