package clone;

public class MemberExample {
	public static void main(String[] args) {
		//���� ��ü ����
		Member original = new Member("blue","ȫ�浿","12345",25,true);
		
		//���� ��ü�� ���� �Ŀ� �н����� ����
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id: "+cloned.id);
		System.out.println("name:"+cloned.name);
		System.out.println("password:"+cloned.password);
		System.out.println("age:"+cloned.age);
		System.out.println("adult:"+cloned.adult);
		
		System.out.println();
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("id:"+original.id);
		System.out.println("name:"+original.name);
		System.out.println("password:"+original.password);
		System.out.println("age:"+original.age);
		System.out.println("adult:"+original.adult);
	}
}

/*
package clone;

public class MemberExample {
   public static void main(String[] args) {
      //���� ��ü ����
      Member original = new Member("blue", "ȫ�浿", "12345", 25, true);
      //��Ű�����ϰ� �μ� 5���� ���� ��ü�� �����ϰ�, memberŬ������ ������Ÿ���� ����� original��ü������ ��ü�� �Ҵ�����. 
      
      //���� ��ü�� ���� �Ŀ� �н����� ����
      Member cloned = original.getMember(); //original�����Ͱ� �ִ� ��ü�������� getMember�޼��带 �۵���Ŵ
      cloned.password = "67890";//��ü���� cloned���� password�ʵ忡 67890 ���ͷ��� �Ҵ�����
      //password�ʵ��� ���� ������ �� ����. 
      
      System.out.println("[���� ��ü�� �ʵ尪]");
      System.out.println("id: " + cloned.id);
      System.out.println("name: " + cloned.name);
      System.out.println("password: " + cloned.password);
      System.out.println("age: " + cloned.age);
      System.out.println("adult: " + cloned.adult);
      
      System.out.println();
      
      System.out.println("[���� ��ü�� �ʵ尪]");
      System.out.println("id: " + original.id);
      System.out.println("name: " + original.name);
      System.out.println("password: " + original.password);
      System.out.println("age: " + original.age);
      System.out.println("adult: " + original.adult);
   }
}
*/