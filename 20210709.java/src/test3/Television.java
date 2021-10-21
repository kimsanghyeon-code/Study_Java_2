package test3;

public class Television implements RemoteControl {
	   // 필드
	   private int volume;
	   
	   // 추상 메소드의 실체 메소드 구현
	   @Override
	   public void turnOn() {
	      System.out.println("TV를 켭니다.");      
	   }

	   @Override
	   public void turnOff() {
	      System.out.println("TV를 끕니다.");
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
	      System.out.println("현재 TV 볼륨: " + this.volume);
	   }
	}


/*
public class Television implements RemoteControl {
   //리모트컨트롤의 구현클래스임
   //   필드
   private int volume;
   
   // 추상 메소드의 실체 메소드 구현
   @Override
   public void turnOn() {
      //인터페이스의 추상메서드를 실체로 구현한 메서드
      //티비를 기준으로 만듬
      System.out.println("TV를 켭니다.");      
   }

   @Override
   public void turnOff() {
      System.out.println("TV를 끕니다.");
   }

   @Override
   public void setVolume(int volume) {
      //인터페이스의 추상메서드를 오버라이드해서 티비에 어울리기 내용을 구성했음
      if(volume > RemoteControl.MAX_VOLUME) {
         this.volume = RemoteControl.MAX_VOLUME;
      } else if(volume < RemoteControl.MIN_VOLUME) {
         this.volume = RemoteControl.MIN_VOLUME;
      } else {
         this.volume = volume;
      }
      System.out.println("현재 TV 볼륨: " + this.volume);
   }
}
*/