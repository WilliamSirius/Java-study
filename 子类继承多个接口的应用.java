package �ӿ�;

interface Interface1//����ӿ�Interface1
{
	public static final String INFO="Hello world!";
	public abstract void print();
}
interface Interface2//����ӿ�Interface2
{
	public abstract void print();
	public abstract void get();
}
class X implements Interface1,Interface2//������ʵ�������ӿ�Interface1��Interface2
{
	public void print()//һ����̳ж���ӿ�ʱ�ӿ��в��ܳ���ͬ����Ĭ�Ϸ���
	{
		System.out.println(INFO);
	}
	public void get()
	{
		System.out.println("Hello!");
	}
}
public class ����̳ж���ӿڵ�Ӧ��
{
	public static void main(String[]args)
	{
		X x=new X();//ʵ�����������
		x.print();//���÷���
		x.get();//���÷���
		Interface1 a=x;//Ϊ���ӿ�ʵ����
		Interface2 b=x;//Ϊ���ӿ�ʵ����
		a.print();
		b.get();
	}
}
