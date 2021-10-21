package test20210708_multi;

public class SmartTelevision implements RemoteControl, Searchable {
	//2�� �̻��� �������̽��� �����
//�ʵ�
	private int volume;
	//RemoteControl�� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
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
		System.out.println("���� TV ����: "+ this.volume);
	}
	//Searchable�� �߻�޼ҵ忡 ���� ��ü �޼ҵ�
	@Override
	public void search(String url) {
		System.out.println(url + "�� �˻��մϴ�.");
	}
}


/*
public class SmartTelevision implements RemoteControl, Searchable {

//2���̻��� �������̽��� ����� ����Ŭ�������� �ǹ���
//����� ��� �������̽��� �߻�޼��带 ����Ŭ������ ��� �����ؾ��Ѵ�
//�ϳ��� ���� ������ ����

// �ʵ�
private int volume;

// RemoteControl�� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
@Override
public void turnOn() {
   System.out.println("TV�� �մϴ�.");      
}

@Override
public void turnOff() {
   System.out.println("TV�� ���ϴ�.");
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
   System.out.println("���� TV ����: " + this.volume);
}
//����Ʈ��Ʋ���� �������̽��� ������ ��ü�޼�����

// Searchable�� �߻�޼ҵ忡 ���� ��ü �޼ҵ�
@Override
public void search(String url) { 
   System.out.println(url + "�� �˻��մϴ�.");      
   // ��ġ���̺� �������̽��� �߻�޼ҵ带 ������ ������ ��ü�޼ҵ���
   //���⼭�� �Ű������� �Էµ� ���ڿ� url�� ����Ѵ�
}
}
*/