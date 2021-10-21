package test4;

public class KumhoTire implements Tire {
	@Override
	public void roll() { //Tire 인터페이스 구현
		System.out.println("금호 타이어가 굴러갑니다.");
	}
}


/*
public class KumhoTire implements Tire {
//금호타이어의 타이어인터페이스구현클래스
 @Override
 //오버라이드 롤메서드
 public void roll() { // Tire 인터페이스 구현
    System.out.println("금호 타이어가 굴러갑니다.");
 }

}
*/