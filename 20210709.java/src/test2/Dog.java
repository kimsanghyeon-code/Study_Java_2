package test2;
//�߻� �޼ҵ� �������̵�
public class Dog extends Animal {
	//�߻�Ŭ���� Animal�� DogŬ������ ��ӹ���
	public Dog() {
		this.kind = "������";
		//DogŬ������ �����ڰ� kind�ʵ忡 "������"��� �ؽ�Ʈ�� �־���
	}
	//�߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("�۸�");
	}
}
