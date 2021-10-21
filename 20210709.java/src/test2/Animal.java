package test2;

public abstract class Animal { //추상 클래스
	public String kind;
	//필드
	public void breathe() {
		//추상클래스 생성자
		System.out.println("숨을 쉽니다.");
	}
	//추상 메소드 선언
	public abstract void sound();
	//내용은 ()되어있음. 즉, 없고 선언부만 있음.
}

/*
public abstract class Animal { // 추상 클래스
public String kind; //필드

public void breathe() {
   System.out.println("숨을 쉽니다.");
} //추상클래스의 생성자

// 추상 메소드 선언
public abstract void sound();  // 실행 내용 {}은 없고 선언부만 있음.
//해당추상클래스를 나중에 객체로 만들때 반드시 들어가야될
//메서드 기능이 있다. 하면은 추상메서드를 정의를 함
//그래서 추상메서드가 설정이 되어있는데 나중에 구현클래스에서 추상메서드가 빠져있으면 컴파일에러가 나올수있음
//추상메서드는 구현클래스나 실행클래스에서 사용하는 것이다. 
//정의도 거기서하는 거고.
}
*/