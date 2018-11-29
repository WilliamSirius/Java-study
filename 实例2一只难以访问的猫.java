package 类的封装实例;

public class 实例2一只难以访问的猫 
{
	MyCat0 c=new MyCat0();
	c.weight=-10.0f;//出错由于weight是私有的外界不能由对象直接访问。
	float temp=c.weight;
	System.out.println("The weight of c is "+temp);
}
class MyCat0
{
	private float weight;
	MyCat0(){}
}
