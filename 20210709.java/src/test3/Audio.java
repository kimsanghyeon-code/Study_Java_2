package test3;

public class Audio implements RemoteControl {
	//인터페이스와 연결되려면 클래스 앞에 implements기입 필수
	   // 필드
	   private int volume;
	   
	   // 추상 메소드의 실체 메소드 구현
	   @Override
	   //인터페이스에 있던 것을 가져왔기 때문에 override라고 표기
	   public void turnOn() {
	      System.out.println("Audio를 켭니다.");      
	   }

	   @Override
	   public void turnOff() {
	      System.out.println("Audio를 끕니다.");
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
	      System.out.println("현재 Audio 볼륨: " + this.volume);
	   }
	}


/*
public class Audio implements RemoteControl {
   //인터페이스하고 연결되어서 구현되는 클래스는 
   //자신들의 인터페이스앞에 implements라고 써준다
   // 내부에서 사용하는 필드
   private int volume;
   
   // 추상 메소드의 실체 메소드 구현
   @Override
   //인터페이스에 있던 추상메서드를 가져와서 구현했기때문에
   //오버라이드라고 되어있음
   public void turnOn() {
      System.out.println("Audio를 켭니다.");      
   } //그 내용을 오디오에 맞게 조정함

   @Override
   public void turnOff() {
      System.out.println("Audio를 끕니다.");
   }//그 내용을 오디오에 맞게 조정함

   @Override
   public void setVolume(int volume) 
   //그 내용을 오디오에 맞게 조정함
   {
      if(volume > RemoteControl.MAX_VOLUME) 
      //인터페이스에 있는 상수값을 여기에서 사용한다
      {
         this.volume = RemoteControl.MAX_VOLUME;
      } else if(volume < RemoteControl.MIN_VOLUME) {
         this.volume = RemoteControl.MIN_VOLUME;
         //최대최소에 대한 볼륨값을 인터페이스에서 정했기 때문에
         //구현클래스에서는 그이상,그이하의 값이 와도 
         //인터페이스에서 정한 상수를 넘어서지않도록 조건을 걸었음
      } else {
         this.volume = volume;//매개변수볼륨의 값이
         //정상범주에 있으니까. 값을 넣어주면 됨
      }
      System.out.println("현재 Audio 볼륨: " + this.volume);
      // this.volume 현재 객체에 저장되어있는 필드값을 출력하여 볼륨값을 표기한다
   }

}
*/