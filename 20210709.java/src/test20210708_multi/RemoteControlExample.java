package test20210708_multi;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		//���ο� SmartTelevision�� ���� stv��ü������ ����
		RemoteControl rc = stv;
		//������� stv�� RemoteControl�������̽� Ÿ���� ����� rc�� ����
		rc.turnOn();
		//stv�� turnOn�޼ҵ� ����
		rc.setVolume(5);
		rc.turnOff();
		Searchable searchable = stv;
		searchable.search("http://www.naver.com");
	}
}

/*
public class RemoteControlExample {

   public static void main(String[] args) {
      SmartTelevision stv = new SmartTelevision();
//����Ŭ������ ��ü�����ؼ� ����Ŭ������ ������Ÿ���� ������ stv��ü������ �Ҵ�
      
      RemoteControl rc = stv;
//������ ����Ŭ������ü�� stv�� ����Ʈ��Ʈ���������̽� ������Ÿ���� ����� �������̽����� rc�� �Ҵ���      
      rc.turnOn(); //stv�� �Ͽ¸޼������
      rc.setVolume(5);//stv�� �º����޼������
      rc.turnOff();      //stv�� �Ͽ����޼��带 ������
      
      Searchable searchable = stv; //stv����Ŭ������ü�� 
//��ġ���̺��������̽�������Ÿ���� ������ searchable�������̽������� �Ҵ�
      searchable.search("http://www.naver.com");
//��ġ���̺��������̽��������� stv search�����޼��尡 �۵��ȴ�
      
//�̸� ���ؼ� ���� ��Ƽ�������̽��� �Ҷ� �پ��� �������̽�������
//������ ����Ŭ������ ��ü�� �������⿡ �־���ִ�
      //�پ��� �뵵�� ��ġ���� ��ü�� Ȱ��Ǵ� ���� �� �� �ִ�
   }
}
*/
