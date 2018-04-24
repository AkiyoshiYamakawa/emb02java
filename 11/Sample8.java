class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("ŽÔ‚ðì¬‚µ‚Ü‚µ‚½B");
	}
}

class Sample8
{
	public static void main(String[ ] args)
	{
		Car car1 = new Car();
		Car car2 = new Car();
		
		Car car3;
		car3 = car1;
		
		boolean b11 = car1.equals(car2);
		boolean b12 = car1.equals(car3);
		
		boolean b21 = (car1 == car2);
		boolean b22 = (car1 == car3);
		
		System.out.println("car1.equqls(car2)==>" + b11);
		System.out.println("car1.equqls(car3)==>" + b12);
		System.out.println("(car1==car2)==>" + b21);
		System.out.println("(car1==car3)==>" + b22);
		
		String str1 = "abc";
		String str2 = "abc";
		String str3 = str1;
		System.out.println("str1.equals(str2)==>" + str1.equals(str2) );
		System.out.println("str1.equals(str3)==>" + str1.equals(str3) );
		System.out.println("(str1==str2)==>" + b21);
		System.out.println("(str1==str3)==>" + b22);
		
		
	}
}
