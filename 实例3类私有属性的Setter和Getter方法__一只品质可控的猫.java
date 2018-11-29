package 类的封装实例;

public class 实例3类私有属性的Setter和Getter方法__一只品质可控的猫 
{
	public static void main(String[]args)
	{
		MyCat1 c=new MyCat1();
		c.setWeight(-10.0f);
		
		float temp=c.getWeight();
		System.out.println("The weight of c is "+temp);
		
		MyCat1 c0=new MyCat1();
		c0.setWeight(10.0f);
		
		float temp0=c.getWeight();
		System.out.println("The weight of c0 if "+temp0);
	}
}
class MyCat1
{
	private float weight;
	public void setWeight(float weight)
	{
		if(weight<=0)
		{
			System.out.println("Wrong! Using the default weight!");
			this.weight=10.0f;
		}
		else 
		{
			this.weight=weight;
		}
	}
	public float getWeight()
	{
		return weight;
	}
}
