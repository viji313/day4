package day4;

public class task10 {

	public static void main(String[]args)
	{
		int num = 20;
		if (num % 2==0 && num % 3==0)
		{
			System.out.println("num is divisible by 2 and 3");
			
		}
		else if (num % 2==0)
		{
			System.out.println("number is divisible by 2");
		}
		else if (num % 3==0)
		{
			System.out.println("number is divisible by 3");
		
		}
		else
		{
			System.out.println("number is not divisible by 2 and 3");
		}
	}
}
