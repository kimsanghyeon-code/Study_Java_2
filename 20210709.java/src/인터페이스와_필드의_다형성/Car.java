package 인터페이스와_필드의_다형성;

public class Car {
	//인터페이스 타입 필드 선언과 초기 구현 객체 타입
	Tire frontLeftTire = new HankookTire();
	// 새로운 한국타이어 객체 생성 후 frontLeftTire에 적용 
	Tire frontRightTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRightTire = new HankookTire();
	
	void run() { //인터페이스에서 설명된 roll() 메소드 호출
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
}


/*
public class Car {
// 인터페이스 타입 필드 선언과 초기 구현 객체 타입
Tire frontLeftTire = new HankookTire();
//new키워드로 한국타이어의 객체를 생성해서 
//타이어인터페이스타입이 적용된 frontLeftTire인터페이스변수선언되고 
//한국타이어구현클래스객체가 할당되었다
//아래의 코드들도 위와 같이 구현클래스객체를 인터페이스변수에 전부 할당함
Tire frontRightTire = new HankookTire();
Tire backLeftTire = new HankookTire();
Tire backRightTire = new HankookTire();
//일반적인 클래스안에서 필드를 ! 인터페이스필드로서 선언함 


void run() { // 인터페이스에서 설명된 roll() 메소드 호출
   frontLeftTire.roll();
   //인터페이스변수에서 구현클래스객체가 가지고 있는 메서드를 호출한다
   frontRightTire.roll();
   backLeftTire.roll();
   backRightTire.roll();
}
}
*/