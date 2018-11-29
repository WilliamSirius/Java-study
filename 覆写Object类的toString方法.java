package 类的专题研究1;

class men extends Object
{
	String name="Jack";
	int age=18;
	public String toString()//覆写Object类的同String()方法
	{
		return "I am "+this.name+",I am "+this.age+" years old.";
	}
}

public class 覆写Object类的toString方法 
{
	public static void main(String[]args)
	{
		men p=new men();
		System.out.println(p);
		
	}
}
