package 类的专题研究3;

class person
{
	int id;
	String name;
	public person(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	public int hashcode()//覆写hashcode()方法
	{
		return id*(name.hashCode());
	}
	public boolean equals(Object o)//覆写equals()方法
	{
		person p=(person)o;
		return(this.id==p.id)&&(this.name.equals(p.name));
	}
}
public class 对象签名hashcode
{
	public static void main(String[]args)
	{
		person p1=new person(1,"Jack");
		person p2=new person(1,"Jack");
		person p3=new person(2,"Tom");
		System.out.println(p1.equals(p2));//输出p1，p2的对比结果
		System.out.println(p1.equals(p3));//输出p1，p3的对比结果
		System.out.println(p1.hashcode());//输出p1的hashcode
		System.out.println(p2.hashCode());//输出p2的hashcode
		System.out.println(p3.hashCode());//输出p3的hashcode
		
	}
}
