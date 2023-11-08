package day4;

public class task8 {
	public static void main(String[]args)
	{
		int num=12;
		int num2=2;
		int num3=5;
		
		if (num>num2 && num>num3)
		{
			System.out.println( num +"is greater");
			
		}
		else if (num2 > num3 && num2 > num)
		{
			System.out.println(num2 +"is greater");
		}
		else 
		{
			System.out.println("num3 is greater");
		}
	}

}

