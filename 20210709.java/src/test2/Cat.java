package test2;

public class Cat extends Animal {
	public Cat() {
		this.kind = "������";
	//�����ڰ� kind�ʵ忡 "������"��� �ؽ�Ʈ�� �־���
	}
	//�߻� �޼ҵ� �������̵�
	@Override
	public void sound() {
		System.out.println("�߿�");
	}
}
