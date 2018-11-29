package 类的封装实例;

class MyCat2
{
	private float weight;
	private float height;
	public MyCat2(float weight,float height)
	{
		setHeight(height);//调用方法设置height
		setWeight(weight);//调用方法设置weight
	}
	private void setWeight(float wt)//用private修饰符封装setWeight方法
	{
		if(weight>0)
		{
			wt=weight;
		}
		else
		{
			System.out.println("Wrong!Using the default weight!");
			this.weight=10.0f;
		}
	}
	private void setHeight(float ht)//用private修饰符封装setHeight方法
	{
		if(height>0)
		{
			height=ht;
		}
		else
		{
			System.out.println("Wrong!Using the default height!");
			this.height=15.0f;
		}
	}
	public float getWeight()//创建公有方法getWeight()作为与外界的通信的接口
	{
		return weight;
	}
	public float getHeight()//创建公有方法getHeight()作为与外界通信的接口
	{
		return height;
	}
}
public class 使用构造函数实现数据的封装 
{
	public static void main(String[]args)
	{
		MyCat2 c1=new MyCat2(12,-5);
		
		float temp0=c1.getHeight();//通过共有接口获得属性值height
		float temp1=c1.getWeight();//通过共有接口获得属性值weight
		System.out.println("The weight of the cat is "+temp1);
		System.out.println("The height of the cat is "+temp0);
	}
}
