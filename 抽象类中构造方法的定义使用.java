package 抽象类;

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
	public abstract String talk();//声明一个抽象方法
}
class student1 extends person1//声明抽象类的子类
{
	public student1(String name,int age,String occupation)
	{
		super(name,age,occupation);
	}
	public String talk()//覆写talk()方法
	{
		return"sudent's name:"+this.name+" age:"+this.age+" occupation:"+this.occupation;
	}
}
public class 抽象类中构造方法的定义使用 
{
	public static void main(String[]args)
	{
		student1 s=new student1("Jack",18,"student");
		System.out.println(s.talk());//调用被覆写过的方法
	}
}
