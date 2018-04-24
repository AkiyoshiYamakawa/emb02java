class A
{
	A()
	{
		System.out.println("Aの引数0個のコンストラクタです。");
	}
	A(int a)
	{
		System.out.println("Aの引数1個のコンストラクタです。");
	}
}

class B extends A
{
	B()
	{
		System.out.println("Bの引数0個のコンストラクタです。");
	}
	B(int b)
	{
		super(b);
		System.out.println("Bの引数1個のコンストラクタです。引数の値＝"+b);
	}
}

class SampleEx
{
	public static void main(String[] args)
	{
		B b1 = new B();
		B b2 = new B(10);
	}
}
