package test4;

public class HankookTire implements Tire{
	@Override
	public void roll() { //Tire 인터페이스 구현
		System.out.println("한국 타이어가 굴러갑니다.");
	}
}

/*
public class HankookTire implements Tire {
//한국타이어구현클래스하고 롤메서드는 오버라이드
 @Override
 public void roll() { // Tire 인터페이스 구현
    System.out.println("한국 타이어가 굴러갑니다.");
 }

}
*/