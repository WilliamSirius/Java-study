package ��ķ�װʵ��;

class MyCat2
{
	private float weight;
	private float height;
	public MyCat2(float weight,float height)
	{
		setHeight(height);//���÷�������height
		setWeight(weight);//���÷�������weight
	}
	private void setWeight(float wt)//��private���η���װsetWeight����
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
	private void setHeight(float ht)//��private���η���װsetHeight����
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
	public float getWeight()//�������з���getWeight()��Ϊ������ͨ�ŵĽӿ�
	{
		return weight;
	}
	public float getHeight()//�������з���getHeight()��Ϊ�����ͨ�ŵĽӿ�
	{
		return height;
	}
}
public class ʹ�ù��캯��ʵ�����ݵķ�װ 
{
	public static void main(String[]args)
	{
		MyCat2 c1=new MyCat2(12,-5);
		
		float temp0=c1.getHeight();//ͨ�����нӿڻ������ֵheight
		float temp1=c1.getWeight();//ͨ�����нӿڻ������ֵweight
		System.out.println("The weight of the cat is "+temp1);
		System.out.println("The height of the cat is "+temp0);
	}
}
