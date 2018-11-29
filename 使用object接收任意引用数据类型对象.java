package 类的专题研究3;



public class 使用object接收任意引用数据类型对象 
{
	public static void main(String[]args)
	{
		int temp[]= {1,3,5,7,9};
		Object obj=temp;//使用object接收数组
		print(obj);
	}
	public static void print(Object o)
	{
		if(o instanceof int[])//判断是否为整型数组
		{
			int x[]=(int[])o;
			for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i]+"\t");
			}
		}
	}
}
