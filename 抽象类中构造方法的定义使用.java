package ������;

abstract class person1
{
	String name;
	int age;
	String occupation;
	public person1(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public abstract String talk();//����һ�����󷽷�
}
class student1 extends person1//���������������
{
	public student1(String name,int age,String occupation)
	{
		super(name,age,occupation);
	}
	public String talk()//��дtalk()����
	{
		return"sudent's name:"+this.name+" age:"+this.age+" occupation:"+this.occupation;
	}
}
public class �������й��췽���Ķ���ʹ�� 
{
	public static void main(String[]args)
	{
		student1 s=new student1("Jack",18,"student");
		System.out.println(s.talk());//���ñ���д���ķ���
	}
}
