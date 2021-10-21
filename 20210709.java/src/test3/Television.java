package test3;

public class Television implements RemoteControl {
	   // �ʵ�
	   private int volume;
	   
	   // �߻� �޼ҵ��� ��ü �޼ҵ� ����
	   @Override
	   public void turnOn() {
	      System.out.println("TV�� �մϴ�.");      
	   }

	   @Override
	   public void turnOff() {
	      System.out.println("TV�� ���ϴ�.");
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
	      System.out.println("���� TV ����: " + this.volume);
	   }
	}


/*
public class Television implements RemoteControl {
   //����Ʈ��Ʈ���� ����Ŭ������
   //   �ʵ�
   private int volume;
   
   // �߻� �޼ҵ��� ��ü �޼ҵ� ����
   @Override
   public void turnOn() {
      //�������̽��� �߻�޼��带 ��ü�� ������ �޼���
      //Ƽ�� �������� ����
      System.out.println("TV�� �մϴ�.");      
   }

   @Override
   public void turnOff() {
      System.out.println("TV�� ���ϴ�.");
   }

   @Override
   public void setVolume(int volume) {
      //�������̽��� �߻�޼��带 �������̵��ؼ� Ƽ�� ��︮�� ������ ��������
      if(volume > RemoteControl.MAX_VOLUME) {
         this.volume = RemoteControl.MAX_VOLUME;
      } else if(volume < RemoteControl.MIN_VOLUME) {
         this.volume = RemoteControl.MIN_VOLUME;
      } else {
         this.volume = volume;
      }
      System.out.println("���� TV ����: " + this.volume);
   }
}
*/