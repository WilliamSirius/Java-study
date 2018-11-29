package 抽象类;

abstract class Action
{
	public static final int EAT=1;
	public static final int WORK=2;
	public static final int SLEEP=5;
	public static final int RUN=10;
	public abstract void eat();
	public abstract void sleep();
	public abstract void work();
	public abstract void run();
	public void command(int ch)
	{
		switch(ch)
		{
		case EAT:
			this.eat();
			break;
		case SLEEP:
			this.sleep();
			break;
		case WORK:
			this.work();
			break;
		case RUN:
			this.run();
			break;
		case WORK+EAT:
			this.work();
		    this.eat();
		    break;
		case EAT+RUN+SLEEP:
			this.eat();
		    this.run();
		    this.sleep();
		    break;
		case EAT+RUN+WORK+SLEEP:
			this.eat();
		    this.run();
		    this.work();
		    this.sleep();
		    break;
		}
	}
}
class robot extends Action
{
	public void eat()
	{
		System.out.println("Add fuel for the robot!");
	}
	public void sleep()
	{     
	
	}
	public void run()
	{
		
	}
	public void work()
	{
		System.out.println("Robot working!");
	}
}
class woman extends Action
{
	public void eat()
	{
		System.out.println("She is eating!");
	}
	public void sleep()
	{
		System.out.println("She is sleeping");
	}
	public void run()
	{
		System.out.println("She is running for health!");
	}
	public void work()
	{
		
	}
}
class man extends Action
{
	public void eat()
	{
		System.out.println("He is eating!");
	}
	public void run()
	{
		System.out.println("He is running for health!");
	}
	public void sleep()
	{
		System.out.println("He is sleeping!");
	}
	public void work()
	{
		System.out.println("He is working for money!");
	}
}
public class 抽象类应用__模板设计模式 
{
	public static void main(String[]args)
	{
		Action actA=new robot();
		actA.command(Action.EAT);
		actA.command(Action.WORK);
		
		Action actB=new woman();
		actB.command(Action.EAT+Action.RUN+Action.SLEEP);
		
		Action actC=new man();
		actC.command(Action.EAT+Action.RUN+Action.WORK+Action.SLEEP);
		}
}
