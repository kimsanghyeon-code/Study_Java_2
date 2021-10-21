package 메서드의_매개변수_다양화;

public class Bus implements Vehicle {
	@Override
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}


/*
public class Bus implements Vehicle {

@Override
public void run() { //버스도 오버라이드를 했음
   System.out.println("버스가 달립니다.");
   
}

}
*/