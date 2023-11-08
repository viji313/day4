package day4;

public class task14 {
	public static void main(String[]args)
	{
		String name=args[0];
		if (name.charAt(0) == 'N')
		{
			System.out.println("North");
		}
		else if(name.charAt(0) == 'S')
		{
			System.out.println("South");
		}
		else if (name.charAt(0) == 'E')
		{
			System.out.println("East");
		}
		else if (name.charAt(0)== 'W')
		{
			System.out.println("West");
		}
	}

}
