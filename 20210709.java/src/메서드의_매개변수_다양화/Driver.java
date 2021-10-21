package 메서드의_매개변수_다양화;
//매개 변수의 다형성 
public class Driver {
	public void drive(Vehicle vehicle) {
		vehicle.run();
	}
}


/*
//매개 변수의 다형성
public class Driver {
 public void drive(Vehicle vehicle) {
    //일반클래스에서 드라이브메서드의 매개변수에 
    //인터페이스 베지클을 넣음
    vehicle.run();
    //인터페이스를 매개변수로 해서 런메서드를 작동시킴
 }
}
*/