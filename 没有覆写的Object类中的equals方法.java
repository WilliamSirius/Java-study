package ���ר���о�2;

class man
{
	private String name;
	private int age;
	public man(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
}
public class û�и�д��Object���е�equals���� 
{
	public static void main(String[]args)
	{
		man p1=new man("Jack",18);
		man p2=new man("Jack",18);
		System.out.println(p1.equals(p2)?"True":"False");//��Ȼ�������� ��������ͬ������equals()�����бȽ�ʱʵ�ʱȽϵ�����������ĵ�ַ
	}
}
