package 메서드의_매개변수_다양화;

public class Taxi implements Vehicle {
	@Override
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}


/*
public class Taxi implements Vehicle {
//베지클인터페이스를 구현하는 클래스
 @Override
 public void run() {//런메서드를 오버라이드함
    System.out.println("택시가 달립니다.");
    
 }

}
*/