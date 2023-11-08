package day4;

public class task20 {
	public static void main(String[]args)
	{
		String name=args[0];
		String name2=args[1];
		if(name.contains(name2))
		{
			String ucase=name.toUpperCase();
			System.out.println(ucase);
			
		}
		else
		{
			String lcase=name.toLowerCase();
			System.out.println(lcase);
		}
			
	}
	
}
