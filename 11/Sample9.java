class Car
{
	protected int num;
	protected double gas;
	
	public Car()
	{
		num = 0;
		gas = 0.0;
		System.out.println("�Ԃ��쐬���܂����B");
	}
}

class RacingCar extends Car
{
	private int course;
	
	public RacingCar()
	{
		course = 0;
		System.out.println("���[�V���O�J�[���쐬���܂����B");
	}
	
	public void setCourse(int c)
	{
		course = c;
		System.out.println("�R�[�X�ԍ���" + course + "�ɂ��܂����B");
	}
	
	public void show()
	{
		System.out.println("���[�V���O�J�[�̃i���o�[��" + num + "�ł��B");
		System.out.println("�K�\�����ʂ�" + gas + "�ł��B");
		System.out.println("�R�[�X�ԍ���" + course + "�ł��B");
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
			System.out.println((i+1) + "�Ԗڂ̃I�u�W�F�N�g�̃N���X��" + c1 + "�ł��B");
		}
	}
}
