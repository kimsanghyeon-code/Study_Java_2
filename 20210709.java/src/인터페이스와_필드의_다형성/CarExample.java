package �������̽���_�ʵ���_������;

public class CarExample {
	public static void mian(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}


/*
public class CarExample {
   public static void main(String[] args) {
      Car myCar = new Car();
//īŬ������ ��ü�� �����ϰ� myCar��� carŬ������ ]
//������Ÿ������� ������ �Ҵ��Ѵ�
      myCar.run();
//��ü�������� ���޼��带 �۵���Ŵ   
//�ʱ⿡ �����Ȱ� �ѱ�Ÿ�̾��Ŭ������ü�� ����־��⶧����
//�ѱ�Ÿ�̾ ���Ѱ� ��µ�      
      myCar.frontLeftTire = new KumhoTire();
//�տ��ʿ� ��ȣŸ�̾��Ŭ������ü�� �����ؼ� �ʵ忡 �Ҵ�      
      myCar.frontRightTire = new KumhoTire();
//�տ����ʿ� ��ȣŸ�̾��Ŭ������ü�� �����ؼ� �ʵ忡 �Ҵ�      
      
      myCar.run();
//�ڵ��� ���� Ÿ�̾��¦�� ��ȣŸ�̾ü�� �ٲ���� ������ 
//��°���� ��ȣŸ�̾ 2�������� ����
//���� MYCAR�� �ʵ� ��2���� ��ȣŸ�̾ ���� �׷�
//������ MYCAR��ü�� �ʵ尡 �״�� �̱⿡ �ѱ�Ÿ�̾ ���ؼ� ����� ��

//īŬ�������� Ÿ�̾ ���� �ʵ尡 
//�������̽�������Ÿ������ �Ǿ��־ �پ��� ����Ŭ������ü�� �� �� �־���      
      
   }
}
*/
