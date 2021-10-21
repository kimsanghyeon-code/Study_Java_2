package test20210708_multi;

public class RemoteControlExample {
	public static void main(String[] args) {
		SmartTelevision stv = new SmartTelevision();
		//새로운 SmartTelevision를 만들어서 stv객체변수에 적용
		RemoteControl rc = stv;
		//만들었던 stv를 RemoteControl인터페이스 타입이 적용된 rc에 적용
		rc.turnOn();
		//stv의 turnOn메소드 실행
		rc.setVolume(5);
		rc.turnOff();
		Searchable searchable = stv;
		searchable.search("http://www.naver.com");
	}
}

/*
public class RemoteControlExample {

   public static void main(String[] args) {
      SmartTelevision stv = new SmartTelevision();
//구현클래스의 객체생성해서 구현클래스의 데이터타입을 적용한 stv객체변수에 할당
      
      RemoteControl rc = stv;
//생성한 구현클래스객체인 stv를 리모트컨트롤인터페이스 데이터타입이 적용된 인터페이스변수 rc에 할당함      
      rc.turnOn(); //stv의 턴온메서드실행
      rc.setVolume(5);//stv의 셋볼륨메서드실행
      rc.turnOff();      //stv의 턴오프메서드를 실행함
      
      Searchable searchable = stv; //stv구현클래스객체를 
//서치에이블인터페이스데이터타입을 적용한 searchable인터페이스변수에 할당
      searchable.search("http://www.naver.com");
//서치에이블인터페이스변수에서 stv search실현메서드가 작동된다
      
//이를 통해서 보면 멀티인터페이스를 할때 다양한 인터페이스변수에
//생성한 구현클래스의 객체를 여기저기에 넣어볼수있다
      //다양한 용도와 위치에서 객체가 활용되는 것을 볼 수 있다
   }
}
*/
