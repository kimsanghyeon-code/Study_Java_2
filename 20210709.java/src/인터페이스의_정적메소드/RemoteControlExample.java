package 인터페이스의_정적메소드;

public class RemoteControlExample {
	public static void main(String[] args) {
		//정적 메소드이기 때문에 추가적인 객체가 필요없음
		RemoteControl.changeBattery(); //정적 메소드 사용
	}
}


/*
//인터페이스의 정적 메소드 사용
public class RemoteControlExample {

public static void main(String[] args) {
   //정적메서드이기때문에 
   //객체가 필요없다
   //그래서 바로 실행클래스가 나타남
   RemoteControl.changeBattery(); // 정적 메소드 사용
   //인터페이스명 도트연산자 정적메서드명을 쓰면
   //인터페이스안에있는 정적메서드를 사용할수있다.
}
}
*/