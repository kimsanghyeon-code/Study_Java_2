package �޼�����_�Ű�����_�پ�ȭ;
//�Ű� ������ ������ �׽�Ʈ
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //�ڵ� Ÿ�� ��ȯ Vehicle vehicle = bus;
		driver.drive(taxi);
	}
}


/*
//�Ű� ������ ������ �׽�Ʈ
public class DriverExample {
public static void main(String[] args) {
   Driver driver = new Driver(); 
   //����̹�Ŭ������ ��ü�� �����ؼ� ����̺갴ü�����Ҵ�
   
   Bus bus = new Bus();
   //����Ŭ������ ��ü�� �����ؼ� ����Ŭ������ü������ �Ҵ�
   Taxi taxi = new Taxi();
   //�ýñ���Ŭ������ ��ü�� �����ؼ� �ýð�ü������ �Ҵ�
   
   driver.drive(bus); // �ڵ� Ÿ�� ��ȯ Vehicle vehicle = bus;
//����̺� ��ü������ ����̺�޼��� �۵���ų�� ��������Ŭ������ü������ �Ҵ�      
   //������ ���� ����Ŭ������ �޼��尡 �۵���
   driver.drive(taxi);
   //�ý��� ���� ����Ŭ������ �޼��尡 �۵���
   //����Ŭ�������� Ŭ������ �޼��忡 �Ű������� 
   //�������̽��� ������ �Ű������� �پ�ȭ�� ���� ���ִ�
}
}
*/