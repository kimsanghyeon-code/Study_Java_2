package ǥ��API;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1�� obj2�� �����մϴ�.");
		}else {
			System.out.println("ojb1�� obj2�� �������� �ʽ��ϴ�.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		}else {
			System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
		}
	}
}


/*
package test;

public class MemberExample {
   public static void main(String[] args) {
      Member obj1 = new Member("blue"); //blue���ڿ��� ��������ڿ��� ��üȭ�ؼ� obj1��ü������ �Ҵ�
      Member obj2 = new Member("blue"); //blue���ڿ��� ��������ڿ��� ��üȭ�ؼ� obj2��ü������ �Ҵ�
      Member obj3 = new Member("red");  //red���ڿ��� ��������ڿ��� ��üȭ�ؼ� obj3��ü������ �Ҵ�
      
      if(obj1.equals(obj2)) { // ���࿡ obj1�� ������޼��忡 �Ű������� obj2�� ���� ��쿡 ���̸� 
         System.out.println("obj1�� obj2�� �����մϴ�."); //�̶�� �����
      } else { //�ƴϸ� ���������ʴٰ� ��µ�
         System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
      }
      
      if(obj1.equals(obj3)) {  // ���࿡ obj1�� obj3�� ������޼������� �ϸ�
         System.out.println("obj1�� obj3�� �����մϴ�."); //���̸� �����ϴٰ� ��µǰ� �ƴϸ� 
      } else { //���������ʴٰ� ��µ�.
         System.out.println("obj1�� obj3�� �������� �ʽ��ϴ�.");
      }
   }
}
*/