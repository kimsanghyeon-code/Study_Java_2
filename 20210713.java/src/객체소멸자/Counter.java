package ��ü�Ҹ���;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "�� ��ü�� finalize()�� �����");
	}
}


/*
package finalize;

public class Counter {
   private int no; //no�ʵ弳��
   
   public Counter(int no) {//�����ڼ�������
      this.no = no;
   }
   
   @Override
   protected void finalize() throws Throwable {
      System.out.println(no + "�� ��ü�� finalize()�� �����");
      //�츮�� �������ؼ� finalize()�޼��带 �������̵��ߴ�
      //������ ������� ����
   }
}
*/