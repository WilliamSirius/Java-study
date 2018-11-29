package 类的专题研究2;

class person
{
	private String name;
	private int age;
	public person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public boolean equals(Object o)//覆写父类中的equals()方法
	{
		boolean temp=true;
		person p1=this;
		if(o instanceof person)
		{
			person p2=(person)o;
			if(!(p1.name.equals(p2.name)&&p1.age==p2.age))
			{
				temp=false;
			}
		}
		else
		{
			temp=false;
		}
		return temp;
	}
}
public class equals方法的覆写 
{
	public static void main(String[]args)
	{
		person t_p1=new person("Jack",18);
		person t_p2=new person("Jack",18);
		System.out.println(t_p1.equals(t_p2)?"true":"false");
	}
}
