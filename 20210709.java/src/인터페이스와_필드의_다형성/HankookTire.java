package 인터페이스와_필드의_다형성;

public class HankookTire implements Tire {
	//Tire인터페이스를 구현하는 클래스가 HankookTire

	   @Override
	   public void roll() { // Tire 인터페이스 구현
	      System.out.println("한국 타이어가 굴러갑니다.");
	   }
	}

/*
public class HankookTire implements Tire {
//타이어인터페이스를 구현하는 구현클래스가 한국타이어인거예요
 
 @Override
 public void roll() { // Tire 인터페이스 구현
    System.out.println("한국 타이어가 굴러갑니다.");
 }

}
*/