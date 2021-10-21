package test2;

public class AnimalExample {
	public static void main(String[] args){
		Dog dog = new Dog(); //DogŬ������ü ���� �� dog��ü������ �Ҵ�
		Cat cat = new Cat(); //CatŬ������ü ���� �� cat��ü������ �Ҵ�
		dog.sound(); //���� �޼ҵ� ����
		cat.sound();
		System.out.println("-----------");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog(); //�ڵ� Ÿ�� ��ȯ
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
		animal = new Cat();
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
		System.out.println("-----------");
		
		//�޼ҵ��� �پ缺
		animalSound(new Dog());
		animalSound(new Cat());
	}
	public static void animalSound(Animal animal) {
		animal.sound(); //�����ǵ� �޼ҵ� ȣ��
	}
}
