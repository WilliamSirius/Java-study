package �ӿڵ�Ӧ��;

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
public class ����ģʽ
{
	public static void main(String[]args)
	{
		Fruit f=Factory.getInstance("apple");
		f.eat();
	}
}
