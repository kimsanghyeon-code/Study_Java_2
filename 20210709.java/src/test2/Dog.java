package test2;
//추상 메소드 오버라이딩
public class Dog extends Animal {
	//추상클래스 Animal을 Dog클래스가 상속받음
	public Dog() {
		this.kind = "포유류";
		//Dog클래스의 생성자가 kind필드에 "포유류"라는 텍스트를 넣어줌
	}
	//추상 메소드 재정의
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
