package test20210708_multi;

public class SmartTelevision implements RemoteControl, Searchable {
	//2개 이상의 인터페이스와 연결됨
//필드
	private int volume;
	//RemoteControl의 추상 메소드에 대한 실체 메소드
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: "+ this.volume);
	}
	//Searchable의 추상메소드에 대한 실체 메소드
	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}


/*
public class SmartTelevision implements RemoteControl, Searchable {

//2개이상의 인터페이스와 연결된 구현클래스임을 의미함
//연결된 모든 인터페이스의 추상메서드를 구현클래스는 모두 구현해야한다
//하나라도 빼면 에러가 터짐

// 필드
private int volume;

// RemoteControl의 추상 메소드에 대한 실체 메소드
@Override
public void turnOn() {
   System.out.println("TV를 켭니다.");      
}

@Override
public void turnOff() {
   System.out.println("TV를 끕니다.");
}

@Override
public void setVolume(int volume) {
   if(volume > RemoteControl.MAX_VOLUME) {
      this.volume = RemoteControl.MAX_VOLUME;
   } else if(volume < RemoteControl.MIN_VOLUME) {
      this.volume = RemoteControl.MIN_VOLUME;
   } else {
      this.volume = volume;
   }
   System.out.println("현재 TV 볼륨: " + this.volume);
}
//리모트컨틀롤의 인터페이스의 구현한 실체메서드임

// Searchable의 추상메소드에 대한 실체 메소드
@Override
public void search(String url) { 
   System.out.println(url + "을 검색합니다.");      
   // 서치에이블 인터페이스의 추상메소드를 실제로 구현한 실체메소드임
   //여기서는 매개변수로 입력된 문자열 url을 출력한다
}
}
*/