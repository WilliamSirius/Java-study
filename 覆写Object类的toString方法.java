package ���ר���о�1;

class men extends Object
{
	String name="Jack";
	int age=18;
	public String toString()//��дObject���ͬString()����
	{
		return "I am "+this.name+",I am "+this.age+" years old.";
	}
}

public class ��дObject���toString���� 
{
	public static void main(String[]args)
	{
		men p=new men();
		System.out.println(p);
		
	}
}
