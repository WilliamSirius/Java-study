package ��̬;

class animal
{
	public void move()
	{
		System.out.println("moving!");
	}
}
class fish extends animal
{
	public void move()
	{
		System.out.println("fish moving!");
	}
}
class bird extends animal
{
	public void move()
	{
		System.out.println("bird moving!");
	}
}
class horse extends animal
{
	public void move()
	{
		System.out.println("horse moving!");
	}
}
public class ʹ�ö�̬1 
{
	public static void main(String[]args)
	{
		animal a;
		fish f=new fish();
		bird b=new bird();
		horse h=new horse();
		a=f; a.move();
		a=b; a.move();
		a=h; a.move();
	}
}
