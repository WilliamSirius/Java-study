package 类的专题研究2;

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
public class 没有覆写的Object类中的equals方法 
{
	public static void main(String[]args)
	{
		man p1=new man("Jack",18);
		man p2=new man("Jack",18);
		System.out.println(p1.equals(p2)?"True":"False");//虽然两个对象 的内容相同，但是equals()语句进行比较时实际比较的是两个对象的地址
	}
}
