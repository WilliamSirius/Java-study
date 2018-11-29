package ���ר���о�3;

class person
{
	int id;
	String name;
	public person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int hashcode()//��дhashcode()����
	{
		return id*(name.hashCode());
	}
	public boolean equals(Object o)//��дequals()����
	{
		person p=(person)o;
		return(this.id==p.id)&&(this.name.equals(p.name));
	}
}
public class ����ǩ��hashcode
{
	public static void main(String[]args)
	{
		person p1=new person(1,"Jack");
		person p2=new person(1,"Jack");
		person p3=new person(2,"Tom");
		System.out.println(p1.equals(p2));//���p1��p2�ĶԱȽ��
		System.out.println(p1.equals(p3));//���p1��p3�ĶԱȽ��
		System.out.println(p1.hashcode());//���p1��hashcode
		System.out.println(p2.hashCode());//���p2��hashcode
		System.out.println(p3.hashCode());//���p3��hashcode
		
	}
}
