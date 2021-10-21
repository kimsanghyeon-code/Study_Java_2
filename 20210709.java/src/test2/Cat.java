package test2;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	//생성자가 kind필드에 "포유류"라는 텍스트를 넣어줌
	}
	//추상 메소드 오버라이딩
	@Override
	public void sound() {
		System.out.println("야옹");
	}
}
