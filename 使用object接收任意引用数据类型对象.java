package ���ר���о�3;



public class ʹ��object�������������������Ͷ��� 
{
	public static void main(String[]args)
	{
		int temp[]= {1,3,5,7,9};
		Object obj=temp;//ʹ��object��������
		print(obj);
	}
	public static void print(Object o)
	{
		if(o instanceof int[])//�ж��Ƿ�Ϊ��������
		{
			int x[]=(int[])o;
			for(int i=0;i<x.length;i++)
			{
				System.out.println(x[i]+"\t");
			}
		}
	}
}
