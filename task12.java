package day4;

public class task12 {
	public static void main(String[]args)
	{
		int mark = 90;
		
		if (mark > 90 && mark <100)
		{
			System.out.println("O");
			}
		else if (mark >80 && mark <=90) 
		{
			System.out.println("A+");
			
		}
		else if (mark > 70 && mark <= 80)
		{
			System.out.println("A");
		}
		else if ( mark >60 && mark<=70)
{
	System.out.println("b+");
}
		else if ( mark >50 && mark<=60)
		{
			System.out.println("B");
			
		}
		else if ( mark >50 && mark<=60)
		{
			System.out.println("c");
		}
		else 
		{ 
			System.out.println("fail");
		}
}
}