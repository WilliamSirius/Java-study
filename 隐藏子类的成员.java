package ��̬;

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
public class ��������ĳ�Ա //Ӧ�ò��㷺�����˽�
{
	public static void main(String[]args)
	{
		father dad=new father();
		dad.overwriting();//ͨ��������.��̬����������ֱ�ӷ��ʾ�̬����
		
		father.overwriting();
		son.overwriting();
	}
}
