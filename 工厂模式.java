package 接口的应用;

interface Fruit
{
	public void eat();
}
class Apple implements Fruit
{
	public void eat()
	{
		System.out.println("Eating apple");
	}
}
class Orange implements Fruit
{
	public void eat()
	{
		System.out.println("Eating orange");
	}
}
class Factory
{
	public static Fruit getInstance(String className)
	{
		if("apple".equals(className))
		{
			return new Apple();
		}
		if("orange".equals(className))
		{
			return new Orange();
		}
		return null;
	}
}
public class 工厂模式
{
	public static void main(String[]args)
	{
		Fruit f=Factory.getInstance("apple");
		f.eat();
	}
}
