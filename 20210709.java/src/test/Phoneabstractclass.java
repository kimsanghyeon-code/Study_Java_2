package test;

public abstract class Phoneabstractclass {
	public String owner;
	
	public Phoneabstractclass(String owner) {
		this.owner = owner;
	}
		public void turnOn() {
			System.out.println("�� ������ �մϴ�.");
		}
		public void turnOff() {
			System.out.println("�� ������ ���ϴ�.");
		}
	}

