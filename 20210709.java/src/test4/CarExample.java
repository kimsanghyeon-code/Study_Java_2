package test4;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		//���ο� Car��ü �����ϰ� myCar��ü������ ����
		myCar.run();
		myCar.tires[0] = new KumhoTire();
		//�������̽��迭 tires 0�ε����� ��ȣŸ�̾� Ŭ���� ��ü ���� �� ����
		myCar.tires[1] = new KumhoTire();
		myCar.run();
	}
}

/*
public class CarExample {
   public static void main(String[] args) {
      Car myCar = new Car();
      //īŬ������ ��ü�� �����ؼ� 
      //CarŬ����������Ÿ������� myCar��ü������ �����Ѵ�
      myCar.run();
      //�ʱ⿡ �������̽��迭�� �ѱ�Ÿ�̾��Ŭ������ü�� 
      //�Ǿ��־ 4���� �ѱ�Ÿ�̾ ��µǰ�
      myCar.tires[0] = new KumhoTire();
//�������̽��迭 tires 0�ε����� ��ȣŸ�̾��Ŭ������ü�������ؼ� �Ҵ��ϰ�      
      myCar.tires[1] = new KumhoTire();
//�������̽��迭 tires 1�ε����� ��ȣŸ�̾��Ŭ������ü�������ؼ� �Ҵ��ϰ�      
      myCar.run();
//�ٽ� run�޼��带 ������
//�迭�ε����� 0,1�� �ٲ���� ������ �ʹݿ� 2ȸ�� ��ȣŸ�̾ ��µǰ�
//������ 2ȸ���� ����ȵ� �ѱ�Ÿ�̾ ��µȴ�      
   }
}
*/
