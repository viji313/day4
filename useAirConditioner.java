package day4;

public class useAirConditioner {

	public static void main(String[]args)
	{
		Airconditioner airconditioner = new Airconditioner();
			
			String name= args[0];
			String str[] =name.split(",");
			String st= str[0];
			int a= Integer.parseInt(str[1]);
			String st1= str[2];
			
			airconditioner.name= st;
			airconditioner.price=a;
			airconditioner.model=st1;
			
		
		 if (airconditioner.name.equals("pegion"))
			{
				System.out.println("same");
			
			}
		else 
			{
				System.out.println("not same");
			}
	}

}	
class Airconditioner {
	String name;
	int price;
	String model;
}
			
			
		
		
	

