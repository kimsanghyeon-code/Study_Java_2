package �������̽���_�ʵ���_������;

public class Car {
	//�������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü Ÿ��
	Tire frontLeftTire = new HankookTire();
	// ���ο� �ѱ�Ÿ�̾� ��ü ���� �� frontLeftTire�� ���� 
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { //�������̽����� ����� roll() �޼ҵ� ȣ��
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}


/*
public class Car {
// �������̽� Ÿ�� �ʵ� ����� �ʱ� ���� ��ü Ÿ��
Tire frontLeftTire = new HankookTire();
//newŰ����� �ѱ�Ÿ�̾��� ��ü�� �����ؼ� 
//Ÿ�̾��������̽�Ÿ���� ����� frontLeftTire�������̽���������ǰ� 
//�ѱ�Ÿ�̾��Ŭ������ü�� �Ҵ�Ǿ���
//�Ʒ��� �ڵ�鵵 ���� ���� ����Ŭ������ü�� �������̽������� ���� �Ҵ���
Tire frontRightTire = new HankookTire();
Tire backLeftTire = new HankookTire();
Tire backRightTire = new HankookTire();
//�Ϲ����� Ŭ�����ȿ��� �ʵ带 ! �������̽��ʵ�μ� ������ 


void run() { // �������̽����� ����� roll() �޼ҵ� ȣ��
   frontLeftTire.roll();
   //�������̽��������� ����Ŭ������ü�� ������ �ִ� �޼��带 ȣ���Ѵ�
   frontRightTire.roll();
   backLeftTire.roll();
   backRightTire.roll();
}
}
*/