package test4;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		//새로운 Car객체 생성하고 myCar객체변수에 저장
		myCar.run();
		myCar.tires[0] = new KumhoTire();
		//인터페이스배열 tires 0인덱스에 금호타이어 클래스 객체 생성 후 적용
		myCar.tires[1] = new KumhoTire();
		myCar.run();
	}
}

/*
public class CarExample {
   public static void main(String[] args) {
      Car myCar = new Car();
      //카클래스의 객체를 생성해서 
      //Car클래스데이터타입적용된 myCar객체변수에 저장한다
      myCar.run();
      //초기에 인터페이스배열이 한국타이어구현클래스객체로 
      //되어있어서 4번은 한국타이어가 출력되고
      myCar.tires[0] = new KumhoTire();
//인터페이스배열 tires 0인덱스에 금호타이어구현클래스객체를생성해서 할당하고      
      myCar.tires[1] = new KumhoTire();
//인터페이스배열 tires 1인덱스에 금호타이어구현클래스객체를생성해서 할당하고      
      myCar.run();
//다시 run메서드를 실행함
//배열인덱스가 0,1이 바뀌었기 때문에 초반에 2회는 금호타이어가 출력되고
//마지막 2회에는 변경안된 한국타이어가 출력된다      
   }
}
*/
