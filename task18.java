package day4;

public class task18 {
	public static void main(String[]args)
	{
		int t = 95 , e= 10 ,m=10 ,sc=100;
		if (t>=e && t>=m && t>=sc)
		{
			System.out.println(t + "is greater");
		}
		else if (e>=t && e>=m && e>=sc)
		{
			System.out.println(e + "is greater");
		}
		else if (m>=t && m>=e && m>=sc)
		{
			System.out.println(m + "is greater");
		}
		else 
		{
			System.out.println(sc + "is greater");
		}
	}

}
