package 메서드의_매개변수_다양화;
//매개 변수의 다형성 테스트
public class DriverExample {
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); //자동 타입 변환 Vehicle vehicle = bus;
		driver.drive(taxi);
	}
}


/*
//매개 변수의 다형성 테스트
public class DriverExample {
public static void main(String[] args) {
   Driver driver = new Driver(); 
   //드라이버클래스를 객체를 생성해서 드라이브객체변수할당
   
   Bus bus = new Bus();
   //구현클래스의 객체를 생성해서 구현클래스객체변수에 할당
   Taxi taxi = new Taxi();
   //택시구현클래스의 객체를 생성해서 택시객체변수에 할당
   
   driver.drive(bus); // 자동 타입 변환 Vehicle vehicle = bus;
//드라이브 객체변수에 드라이브메서드 작동시킬때 버스구현클래스객체변수를 할당      
   //버스에 대한 구현클래스의 메서드가 작동됨
   driver.drive(taxi);
   //택스에 대한 구현클래스의 메서드가 작동됨
   //실행클래스에서 클래스의 메서드에 매개변수를 
   //인터페이스를 넣으면 매개변수의 다양화를 얻을 수있다
}
}
*/