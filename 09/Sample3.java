class Car
{
	private int num;
	private double gas;
	
	public void setCar(int n)
	{
		num = n;
		System.out.println("�i���o�[��" + num + "�ɂ���");
	}
	
	public void setCar(double g)
	{
		gas = g;
		System.out.println("�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void setCar(int n, double g)
	{
		num = n;
		gas = g;
		System.out.println("�i���o�[��" + num + "��,�K�\�����ʂ�" + gas + "�ɂ��܂����B");
	}
	
	public void show()
	{
		System.out.println("�Ԃ̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
	}
}

class Sample3
{
	public static void main(String[] args)
	{
		Car car1 = new Car();
		
		car1.setCar(1234,20.5);
		car1.show();
		
		System.out.println("�Ԃ̃i���o�[�����ύX���܂��B");
		car1.setCar(2345);
		car1.show();
		
		System.out.println("�K�\�����ʂ����ύX���܂��B");
		car1.setCar(30.5);
		car1.show();
	}
}