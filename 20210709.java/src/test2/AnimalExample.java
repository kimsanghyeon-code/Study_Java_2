package test2;

public class AnimalExample {
	public static void main(String[] args){
		Dog dog = new Dog(); //Dog클래스객체 생성 후 dog객체변수에 할당
		Cat cat = new Cat(); //Cat클래스객체 생성 후 cat객체변수에 할당
		dog.sound(); //사운드 메소드 실행
		cat.sound();
		System.out.println("-----------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog(); //자동 타입 변환
		animal.sound(); //재정의된 메소드 호출
		animal = new Cat();
		animal.sound(); //재정의된 메소드 호출
		System.out.println("-----------");
		
		//메소드의 다양성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound(); //재정의된 메소드 호출
	}
}
