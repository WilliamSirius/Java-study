package 类的封装实例;

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
public class 返回引用数据时应该注意的问题实例1 
{
	public static void main(String[]args)
	{
		testReturn testReturn=new testReturn();//引用私有数据
		ArrayList<Integer>intArray=testReturn.getIntArray();
		System.out.println(intArray.size());
		
		intArray.add(4);
		System.out.println("改变后："+intArray.size());
	}
}
