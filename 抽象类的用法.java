package 抽象类;

abstract class person
{
	String name;
	int age;
	String occupation;
	public abstract String talk();
}
class student extends person
{
	public student(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
	    this.occupation=occupation;
	}
	public String talk()
	{
		return"name:"+this.name+'\n'+"age:"+this.age+'\n'+this.occupation;
	}
}
class workers extends person
{
	public workers(String name,int age,String occupation)
	{
		this.name=name;
		this.age=age;
		this.occupation=occupation;
	}
	public String talk()
	{
		return"worker's name:"+this.name+'\n'+"age:"+this.age+'\n'+"occupation:"+this.occupation;
	}
}
public class 抽象类的用法
{
	public static void main(String[]args)
	{
		student s=new student("Jack",15,"student");
		workers w=new workers("Tom",34,"worker");
		System.out.println(s.talk());
		System.out.println(w.talk());
	}
}
