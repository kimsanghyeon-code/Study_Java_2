package test4;

public class Car {
	//인터페이스 타입 필드 선언과 초기 구현 객체 타입
	Tire[] tires = {
			new HankookTire(),
			new HankookTire(),
			new HankookTire(),
			new HankookTire()
	};
	void run() { //인터페이스에서 설명된 roll() 메소드 호출
		for(Tire tire : tires) {
			tire.roll();
		}
	}
}


/*
public class Car {
// 인터페이스 타입 필드 선언과 초기 구현 객체 타입

//배열선언을 함
// int [] test 데이터타입 [] 배열명을 기재
//인터페이스배열 선언하고 배열명은 tires임.
Tire[] tires = {
   new HankookTire(),
   new HankookTire(),
   new HankookTire(),
   new HankookTire()
};
//배열에 저장되는 데이터들은 타이어인터페이스의 구현클래스의 객체들을 
//인덱스마다 할당을 했음

void run() { // 인터페이스에서 설명된 roll() 메소드 호출
   //인터페이스에 있던 추상메서드인 roll메서드를 사용한다
   //당연히 앞에 있던 코드처럼 당시에 생성한 구현클래스객체영향을 받음
   for(Tire tire : tires) {
//응용된 for문, 인터페이스타입적용된 tire매개변수가
//인터페이스배열에서부터 데이터를 하나씩 받는다 
//그렇게 받아진 인터페이스배열에 저장된 구현클래스객체들이 하나씩 
//나와서 오버라이드한 roll메서드를 실행한다   
      tire.roll();
//배열에서 인덱스순서대로 들어가있던 구현클래스객체가 가지고 있는 메서드를 출력한다         
   }
}
}
*/