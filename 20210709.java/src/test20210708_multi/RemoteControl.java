package test20210708_multi;

public interface RemoteControl {
	//���
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//�߻� �޼ҵ�
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//����(���)Ÿ�԰� �����͸�
	
	//����Ʈ �޼ҵ�
	default void setMute(boolean mute) {
		//�Ҹ� Ÿ�� ���.
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	//���� �޼ҵ�
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}

/*
public interface RemoteControl {
// ���
   int MAX_VOLUME = 10;
   int MIN_VOLUME = 0;
   
   // �߻� �޼ҵ�
   void turnOn();//���ϵ�����Ÿ�԰� �޼������ �����
   void turnOff();
   void setVolume(int volume);
   
   // ����Ʈ �޼ҵ�
   default void setMute(boolean mute) {
      //�������� �Ҹ�������Ÿ���� �Ű������� ��
      if(mute) {
         //mute�Ű������� true�ϱ� �ٷ� �Ʒ��� �ڵ带 ������
         System.out.println("���� ó���մϴ�.");
      } else {
         System.out.println("���� �����մϴ�.");
      }
      //�߰��� �����
   }
   
   // ���� �޼ҵ�
   static void changeBattery() {
      System.out.println("�������� ��ȯ�մϴ�.");
   }
   
   //�߰��� �����
}
*/