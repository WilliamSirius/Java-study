package ��ķ�װʵ��;

import java.util.ArrayList;

class testReturn
{
	private ArrayList<Integer>intArray=new ArrayList<Integer>();
	testReturn()
	{
		intArray.add(1);
		intArray.add(2);
		intArray.add(3);
	}
	ArrayList<Integer>getIntArray()
	{
		return intArray;
	}
}
public class ������������ʱӦ��ע�������ʵ��1 
{
	public static void main(String[]args)
	{
		testReturn testReturn=new testReturn();//����˽������
		ArrayList<Integer>intArray=testReturn.getIntArray();
		System.out.println(intArray.size());
		
		intArray.add(4);
		System.out.println("�ı��"+intArray.size());
	}
}
