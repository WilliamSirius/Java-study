package ���ר���о�3;

interface InterfaceA
{
	public String getInfo();
}
class B implements InterfaceA//��Bʵ�ֽӿ�InterfaceA
{
	public String getInfo()//��дgetInfo����
	{
		return"Hello world!";
	}
}
public class ʹ��Object���սӿڶ���
{
	public static void main(String[]args)
	{
		InterfaceA a=new B();//����ת�ͣ�Ϊ�ӿ�ʵ����
		Object obj=a;//ʹ��Object���ܽӿڣ�����ת��
		InterfaceA x=(InterfaceA)obj;//����ת��
		System.out.println(x.getInfo());
	}
}
