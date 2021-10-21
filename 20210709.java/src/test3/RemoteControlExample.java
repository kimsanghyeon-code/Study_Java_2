package test3;

public class RemoteControlExample {
	   public static void main(String[] args) {
	      RemoteControl rc;
	      rc =  new Television();
	      //인터페이스를 구현한 Television객체를 생성하고 rc인터페이스변수에 적용
	   rc.turnOn();
	      rc.setVolume(8);
	      rc.turnOff();
	      
	      rc = new Audio();
	      //Audio라는 객체를 생성하고 rc인터페이스 변수에 적용
	      rc.turnOn();
	      rc.setVolume(11);
	      rc.setMute(true);
	      rc.turnOff();
	   }
	}


/*
public class RemoteControlExample {
   public static void main(String[] args) {
      //실행클래스
      RemoteControl rc;
      //인터페이스의 데이터타입을 적용한 rc객체변수
      rc =  new Television();
      //인터페이스를 구현한 구현클래스텔리비전객체를 생성하고
      //rc인터페이스변수에 할당을 함
      rc.turnOn();
      //rc인터페이스가 turnon메서드를 쓰는데 실제 인터페이스에서는 
      //메서드가 내용이 없고 추상메서드이지만.
      //현재 rc객체변수에는 구현클래스인 티비에 대한 객체가 들어있어서
      //tv객체가 가지고 있는 메서드 turnon메서드를 사용한것이다. 
      //이것이 인터페이스는 메서드나 다른 데이터를 가지고 있지 않고
      //구현클래스를 활용해서 리턴값을 주거나 기능을 실행하는 형태이다.
      rc.setVolume(8);
      //티비객체의 셋볼륨메서드에 8을 넣고 실행을 한다
      rc.turnOff();//종료메서드를 실행함
      
      rc = new Audio(); //audio라는 리모트컨트롤인터페이스의 구현클래스가 객체를 생성하고
      //rc객체변수에 할당된다
      //이렇게 되면 기존에 있던 티비구현클래스의 객체가 사라지고 
      //이번에는 오디오 구현클래스의 객체가 작동이 된다
      rc.turnOn(); //오디오에 대한 턴온메서드가 됨
      rc.setVolume(11); //오디오에 대한 셋볼륨메서드가 작동된다
      rc.setMute(true); //
      rc.turnOff();
   }
}
*/
