package test2;

public abstract class Animal { //�߻� Ŭ����
	public String kind;
	//�ʵ�
	public void breathe() {
		//�߻�Ŭ���� ������
		System.out.println("���� ���ϴ�.");
	}
	//�߻� �޼ҵ� ����
	public abstract void sound();
	//������ ()�Ǿ�����. ��, ���� ����θ� ����.
}

/*
public abstract class Animal { // �߻� Ŭ����
public String kind; //�ʵ�

public void breathe() {
   System.out.println("���� ���ϴ�.");
} //�߻�Ŭ������ ������

// �߻� �޼ҵ� ����
public abstract void sound();  // ���� ���� {}�� ���� ����θ� ����.
//�ش��߻�Ŭ������ ���߿� ��ü�� ���鶧 �ݵ�� ���ߵ�
//�޼��� ����� �ִ�. �ϸ��� �߻�޼��带 ���Ǹ� ��
//�׷��� �߻�޼��尡 ������ �Ǿ��ִµ� ���߿� ����Ŭ�������� �߻�޼��尡 ���������� �����Ͽ����� ���ü�����
//�߻�޼���� ����Ŭ������ ����Ŭ�������� ����ϴ� ���̴�. 
//���ǵ� �ű⼭�ϴ� �Ű�.
}
*/