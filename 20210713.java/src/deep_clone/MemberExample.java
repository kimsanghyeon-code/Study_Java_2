package deep_clone;
public class MemberExample {
   public static void main(String[] args) {
      //���� ��ü ����
      Member original = new Member("ȫ�浿", 25, new int[] {90, 90}, new Car("�ҳ�Ÿ"));
      
      //���� ��ü�� ���� �Ŀ� ���� ��ü�� ���� ����
      Member cloned = original.getMember();
      cloned.scores[0] = 100;
      cloned.car.model = "�׷���";
      
      System.out.println("[���� ��ü�� �ʵ尪]");
      System.out.println("name: " + cloned.name);
      System.out.println("age: " + cloned.age);
      System.out.print("scores: {");
      for(int i=0; i<cloned.scores.length; i++) {
         System.out.print(cloned.scores[i]);
         System.out.print((i==(cloned.scores.length-1))?"":",");
      }
      System.out.println("}");
      System.out.println("car: " + cloned.car.model);
      
      System.out.println();
      
      System.out.println("[���� ��ü�� �ʵ尪]");
      System.out.println("name: " + original.name);
      System.out.println("age: " + original.age);
      System.out.print("scores: {");
      for(int i=0; i<original.scores.length; i++) {
         System.out.print(original.scores[i]);
         System.out.print((i==(original.scores.length-1))?"":",");
      }
      System.out.println("}");
      System.out.println("car: " + original.car.model);
   }
}


/*
package deep_clone;
public class MemberExample {
   public static void main(String[] args) {
      //���� ��ü ����
      Member original = new Member("ȫ�浿", 25, new int[] {90, 90}, new Car("�ҳ�Ÿ"));
      //��ü�� �ʱ�ȭ�ϰ� �� ��ü�� MemberŬ������ ������Ÿ���� ������ original��ü������ �Ҵ��Ѵ�
      
      //���� ��ü�� ���� �Ŀ� ���� ��ü�� ���� ����
      Member cloned = original.getMember();//�������ο��� ��ü�������� ������ü�� �����ϴ� �޼��带 �۵����Ѽ� MemberŬ����������Ÿ���� cloned��ü������ �����Ѵ�
      //������ ��ü�� cloned�� �Ҵ��Ѵ�
      cloned.scores[0] = 100; //������ü�� scores�迭�ʵ��� 0���ʵ�ȿ� 100�� ������ ��
      cloned.car.model = "�׷���";//������ü�� car��ü�ʵ��� ���� �׷����� ������. ���������� �ҳ�Ÿ�ε�. �׷����� ��.
      
      System.out.println("[���� ��ü�� �ʵ尪]");
      System.out.println("name: " + cloned.name);
      System.out.println("age: " + cloned.age);
      System.out.print("scores: {");
      for(int i=0; i<cloned.scores.length; i++) {//i�� ������ü������ scores�迭�ʵ��� ���̺��� ���������� �ݺ��Ѵ�.0���ε������� ����ϴϱ�. 
         //cloned������ü�������� scores i�ε����� ����Ѵ�
         System.out.print(cloned.scores[i]);
         System.out.print((i==(cloned.scores.length-1))?"":",");
         //i�ε����� cloned������ü������ socores�迭�ʵ��� ���̺��� 1������ 
         //�迭�� 0�����ͽ����ϰ� ��ü���̿��� 1�� ���� 0���� ���̼� �迭�� ���� ū �ѹ��ε����� ����.
         //i�� �װͰ� ���� �� 
         //true�̸� ""����
         //���̴ϱ�. 
         //�װ� �ƴϸ� ���� �� ����Ұ��� �ֱ⶧���� ,�� �ڿ� ����شٶ�� ������
         //�迭�� ��ҵ��� ��µɶ� ���� ���еǶ�� �޸��� ����ִ� ������.
      }
      System.out.println("}");
      System.out.println("car: " + cloned.car.model);//ī��ü�ʵ��� �����
      
      System.out.println();
      
      System.out.println("[���� ��ü�� �ʵ尪]");
      System.out.println("name: " + original.name);//������ �̸�
      System.out.println("age: " + original.age);//��������
      System.out.print("scores: {"); //�迭�� 
      for(int i=0; i<original.scores.length; i++) {
         System.out.print(original.scores[i]);
         System.out.print((i==(original.scores.length-1))?"":",");
      }
      System.out.println("}");
      System.out.println("car: " + original.car.model);
      //������ü�������� 0���ε����� �����ؼ� ���� ���ϰ� �𵨵� ���ϰ� �ߴµ� ������ �״�� �ִ� .
   }
}
*/
