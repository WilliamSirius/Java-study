package 类的封装实例;

public class 实例1一只品质不可控的猫
{
	public static void main(String[]args)
	{
		MyCat c=new MyCat();
		c.weight=-10.0f;
		float temp=c.weight;
		System.out.println("The weight of C is "+temp);
	}

}
class MyCat
{
	public float weight;
	MyCat(){}
}
