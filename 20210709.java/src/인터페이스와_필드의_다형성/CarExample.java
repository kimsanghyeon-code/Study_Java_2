package 인터페이스와_필드의_다형성;

public class CarExample {
	public static void mian(String[] args) {
		Car myCar = new Car();
		myCar.run();
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run();
	}
}


/*
public class CarExample {
   public static void main(String[] args) {
      Car myCar = new Car();
//카클래스의 객체를 생성하고 myCar라는 car클래스의 ]
//데이터타입적용된 변수에 할당한다
      myCar.run();
//객체변수에서 런메서드를 작동시킴   
//초기에 설정된게 한국타이어구현클래스객체가 들어있었기때문에
//한국타이어에 관한게 출력됨      
      myCar.frontLeftTire = new KumhoTire();
//앞왼쪽에 금호타이어구현클래스객체를 생성해서 필드에 할당      
      myCar.frontRightTire = new KumhoTire();
//앞오른쪽에 금호타이어구현클래스객체를 생성해서 필드에 할당      
      
      myCar.run();
//자동차 앞의 타이어두짝이 금호타이어객체를 바뀌었기 떄문에 
//출력결과도 금호타이어가 2번찍히는 것임
//현재 MYCAR에 필드 앞2개가 금호타이어가 들어가서 그럼
//뒤쪽은 MYCAR객체의 필드가 그대로 이기에 한국타이어에 대해서 출력이 됨

//카클래스에서 타이어가 들어가는 필드가 
//인터페이스데이터타입으로 되어있어서 다양한 구현클래스객체가 들어갈 수 있었음      
      
   }
}
*/
