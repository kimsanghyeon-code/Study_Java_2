package ��ü�Ҹ���;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
	}
}


/*
package finalize;

public class FinalizeExample {
   public static void main(String[] args) {
      Counter counter = null; //���̳ζ�����޼��带 �������̵��� ī��ƮŬ������ ������Ÿ���� ������ counter��ü������ �ΰ����� �ʱ�ȭ
      for(int i=1; i<=50; i++) { //for������ i�� 1���� i�� 50�����۰ų� ����������
         counter = new Counter(i); //newŰ����� ī����Ŭ���������ڸ� �۵���Ŵ
         //ī����Ŭ�������� ���̳ζ�����޼��尡 ..�ִ�. 
         //�̰��� ��ü�� �����Ǿ ������� ������ �۵��Ǵ� ���� ���̳ζ�����޼�����.
         
         counter = null; //ī���Ͱ�ü�� �ʱ�ȭ�� �ϴ� ����. 
         //counter��ü������ null���� ������ ��ü�� Ȱ���������°���. �� �������� ������ ��ü�� �ȴ�. 
         System.gc(); //gc�� �Ź����÷��Ͷ�� �޼����ε� ���� ��ü�� ȸ���ش޶�� �ϴ� ��ɸ޼�����. 
         //�������ݷ����� �����⸦ �����ٴ� ��.
         
         //�ٷ������� ī��Ʈ��ü������ ���� �־ �����ⰴü�� ������� ������ gc�޼��带 ���� ������� ��ü�� Ÿ���� �ǰ� �Ǿ����. 
         //system����Ŭ������ gc�޼����� �ϸ� ��. �ڹٰ���ӽ� JVM�� ������� �ʴ� ��ü�� ȸ���ϰ� ��.
         //gc�� ���ؼ� ȸ���� �Ǵ� ������ �������� ���ѹ� �޽��� ����ϰ� ������� �ſ���. 
      }
   }
}
*/