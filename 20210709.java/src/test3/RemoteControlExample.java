package test3;

public class RemoteControlExample {
	   public static void main(String[] args) {
	      RemoteControl rc;
	      rc =  new Television();
	      //�������̽��� ������ Television��ü�� �����ϰ� rc�������̽������� ����
	   rc.turnOn();
	      rc.setVolume(8);
	      rc.turnOff();
	      
	      rc = new Audio();
	      //Audio��� ��ü�� �����ϰ� rc�������̽� ������ ����
	      rc.turnOn();
	      rc.setVolume(11);
	      rc.setMute(true);
	      rc.turnOff();
	   }
	}


/*
public class RemoteControlExample {
   public static void main(String[] args) {
      //����Ŭ����
      RemoteControl rc;
      //�������̽��� ������Ÿ���� ������ rc��ü����
      rc =  new Television();
      //�������̽��� ������ ����Ŭ�����ڸ�������ü�� �����ϰ�
      //rc�������̽������� �Ҵ��� ��
      rc.turnOn();
      //rc�������̽��� turnon�޼��带 ���µ� ���� �������̽������� 
      //�޼��尡 ������ ���� �߻�޼���������.
      //���� rc��ü�������� ����Ŭ������ Ƽ�� ���� ��ü�� ����־
      //tv��ü�� ������ �ִ� �޼��� turnon�޼��带 ����Ѱ��̴�. 
      //�̰��� �������̽��� �޼��峪 �ٸ� �����͸� ������ ���� �ʰ�
      //����Ŭ������ Ȱ���ؼ� ���ϰ��� �ְų� ����� �����ϴ� �����̴�.
      rc.setVolume(8);
      //Ƽ��ü�� �º����޼��忡 8�� �ְ� ������ �Ѵ�
      rc.turnOff();//����޼��带 ������
      
      rc = new Audio(); //audio��� ����Ʈ��Ʈ���������̽��� ����Ŭ������ ��ü�� �����ϰ�
      //rc��ü������ �Ҵ�ȴ�
      //�̷��� �Ǹ� ������ �ִ� Ƽ����Ŭ������ ��ü�� ������� 
      //�̹����� ����� ����Ŭ������ ��ü�� �۵��� �ȴ�
      rc.turnOn(); //������� ���� �Ͽ¸޼��尡 ��
      rc.setVolume(11); //������� ���� �º����޼��尡 �۵��ȴ�
      rc.setMute(true); //
      rc.turnOff();
   }
}
*/
