package test3;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return company + "," + os;
	}
}

/*
package test;

public class SmartPhone {
   //�츮�� ǥ��API�� �����ϴ� ����Ʈ���޼��带 �������̵��ؼ� Ȱ���ϴ� �ڵ�
   private String company;
   private String os; //�����̺��ʵ带 2���� ����
   
   public SmartPhone(String company, String os) { 
      //������ 2���� �����͸� �Ű������� �Է¹޾Ƽ� �ʵ带 �ʱ�ȭ��Ŵ
      this.company = company;
      this.os = os;
   }
   
   @Override //�������̵�������̼��� ����
   public String toString() { //���ڿ�������Ÿ������ ���ϵǴ� ����� �����ִ� �޼��带 ������ �������̵��� ���·�
      return company + ", " + os;
      //���ο� �ִ� �ʵ� company�ϰ� os�� �������
   }
}
*/