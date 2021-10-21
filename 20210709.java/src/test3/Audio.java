package test3;

public class Audio implements RemoteControl {
	//�������̽��� ����Ƿ��� Ŭ���� �տ� implements���� �ʼ�
	   // �ʵ�
	   private int volume;
	   
	   // �߻� �޼ҵ��� ��ü �޼ҵ� ����
	   @Override
	   //�������̽��� �ִ� ���� �����Ա� ������ override��� ǥ��
	   public void turnOn() {
	      System.out.println("Audio�� �մϴ�.");      
	   }

	   @Override
	   public void turnOff() {
	      System.out.println("Audio�� ���ϴ�.");
	   }

	   @Override
	   public void setVolume(int volume) {
	      if(volume > RemoteControl.MAX_VOLUME) {
	         this.volume = RemoteControl.MAX_VOLUME;
	      } else if(volume < RemoteControl.MIN_VOLUME) {
	         this.volume = RemoteControl.MIN_VOLUME;
	      } else {
	         this.volume = volume;
	      }
	      System.out.println("���� Audio ����: " + this.volume);
	   }
	}


/*
public class Audio implements RemoteControl {
   //�������̽��ϰ� ����Ǿ �����Ǵ� Ŭ������ 
   //�ڽŵ��� �������̽��տ� implements��� ���ش�
   // ���ο��� ����ϴ� �ʵ�
   private int volume;
   
   // �߻� �޼ҵ��� ��ü �޼ҵ� ����
   @Override
   //�������̽��� �ִ� �߻�޼��带 �����ͼ� �����߱⶧����
   //�������̵��� �Ǿ�����
   public void turnOn() {
      System.out.println("Audio�� �մϴ�.");      
   } //�� ������ ������� �°� ������

   @Override
   public void turnOff() {
      System.out.println("Audio�� ���ϴ�.");
   }//�� ������ ������� �°� ������

   @Override
   public void setVolume(int volume) 
   //�� ������ ������� �°� ������
   {
      if(volume > RemoteControl.MAX_VOLUME) 
      //�������̽��� �ִ� ������� ���⿡�� ����Ѵ�
      {
         this.volume = RemoteControl.MAX_VOLUME;
      } else if(volume < RemoteControl.MIN_VOLUME) {
         this.volume = RemoteControl.MIN_VOLUME;
         //�ִ��ּҿ� ���� �������� �������̽����� ���߱� ������
         //����Ŭ���������� ���̻�,�������� ���� �͵� 
         //�������̽����� ���� ����� �Ѿ���ʵ��� ������ �ɾ���
      } else {
         this.volume = volume;//�Ű����������� ����
         //������ֿ� �����ϱ�. ���� �־��ָ� ��
      }
      System.out.println("���� Audio ����: " + this.volume);
      // this.volume ���� ��ü�� ����Ǿ��ִ� �ʵ尪�� ����Ͽ� �������� ǥ���Ѵ�
   }

}
*/