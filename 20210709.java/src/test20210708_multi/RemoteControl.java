package test20210708_multi;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	//추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	//리턴(출력)타입과 데이터명
	
	//디폴트 메소드
	default void setMute(boolean mute) {
		//불린 타입 사용.
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	//정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}

/*
public interface RemoteControl {
// 상수
   int MAX_VOLUME = 10;
   int MIN_VOLUME = 0;
   
   // 추상 메소드
   void turnOn();//리턴데이터타입과 메서드명을 써넣음
   void turnOff();
   void setVolume(int volume);
   
   // 디폴트 메소드
   default void setMute(boolean mute) {
      //참거짓에 불린데이터타입을 매개변수로 함
      if(mute) {
         //mute매개변수가 true니까 바로 아래의 코드를 실행함
         System.out.println("무음 처리합니다.");
      } else {
         System.out.println("무음 해제합니다.");
      }
      //추가된 기능임
   }
   
   // 정적 메소드
   static void changeBattery() {
      System.out.println("건전지를 교환합니다.");
   }
   
   //추가된 기능임
}
*/