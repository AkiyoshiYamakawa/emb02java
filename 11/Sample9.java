class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("車を作成しました。");
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("レーシングカーを作成しました。");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("コース番号を" + course + "にしました。");
	}
	
	public void show()
	{
		System.out.println("レーシングカーのナンバーは" + num + "です。");
		System.out.println("ガソリン量は" + gas + "です。");
		System.out.println("コース番号は" + course + "です。");
	}
}

class Sample9
{
	public static void main(String[] args)
	{
		Car[] cars;
		cars = new Car[2];
		
		cars[0] = new Car();
		cars[1] = new RacingCar();
		
		for(int i=0; i<cars.length; i++){
			Class c1 = cars[i].getClass();
			System.out.println((i+1) + "番目のオブジェクトのクラスは" + c1 + "です。");
		}
	}
}
