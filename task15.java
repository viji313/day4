package day4;

public class task15 {
	public static void main(String[]args)
	{
		float f = 10.1f;
		if (f >=1 && f<= 3.5)
		{
			System.out.println("Very bad");
		}
		else if (f>=4.1 && f<= 5.5)
		{
			System.out.println("bad");
	}
		else if (f>=5.6 && f<= 8.1)
		{
			System.out.println("good");
		}
		else if (f>=8.2 && f<=9.9)
		{
			System.out.println(" verygood");
		}
		else {
			System.out.println("invalid data");
		}

}
}
