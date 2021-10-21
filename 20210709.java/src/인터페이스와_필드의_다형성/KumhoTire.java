package 인터페이스와_필드의_다형성;

public class KumhoTire implements Tire {

	   @Override
	   public void roll() { // Tire 인터페이스 구현
	      System.out.println("금호 타이어가 굴러갑니다.");
	   }
	}

/*
public class KumhoTire implements Tire {
//금호타이어도 인터페이스 타이어의 구현클래스임.
 
 @Override
 public void roll() { // Tire 인터페이스 구현
    System.out.println("금호 타이어가 굴러갑니다.");
    //인터페이스의 추상메서드를 오버라이드해서 구현한 메서드임
 }

}
*/