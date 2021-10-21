package deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
   public String name;
   public int age;
   public int[] scores;
   public Car car;
   
   public Member(String name, int age, int[] scores, Car car) {
      this.name = name;
      this.age = age;
      this.scores = scores;
      this.car = car;
   }
   
   @Override
   protected Object clone() throws CloneNotSupportedException {
      //���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
      Member cloned = (Member) super.clone();
      //scores�� �����Ѵ�.
      cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
      //car�� �����Ѵ�.
      cloned.car = new Car(this.car.model);
      //���� ������ Member ��ü�� ����
      return cloned;
   }
   
   public Member getMember() {
      Member cloned = null;
      try {
         cloned = (Member) clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return cloned;
   }
}

/*
package deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {//Ŭ�г��̺��������̽��� ������
   public String name;
   public int age;
   public int[] scores; //�迭�� ��
   public Car car; //carŬ������ ������ �ʵ�
   
   public Member(String name, int age, int[] scores, Car car) { //������
      this.name = name;
      this.age = age;
      this.scores = scores;//�ܺο��� �Ű������� �迭�� scores�� ���ͼ� ���簴ü�� scores�ʵ忡 �Ҵ��
      this.car = car;
   }
   
   @Override
   protected Object clone() throws CloneNotSupportedException {//Object������Ÿ���� �����ϴ� clone�޼��� �׸��� Ŭ�н��н������� ����ó������
      //���� ���� ���縦 �ؼ� name, age�� �����Ѵ�.
      Member cloned = (Member) super.clone(); //����Ű���尡 ���� ������ƮŬ������ Ŭ�и޼��带 ȣ����. Ŭ�и޼���� ��ü�� ����� cloned��ü������ �Ҵ�
      //��ü�� ī�Ǹ� ���縦 ���� �װ��� ������Ÿ���� ���Ŭ������ Ÿ���� ������ �׸��� �װ��� ���������� �̷��������
      //������ ��ü�� MemberŬ����Ÿ���� ����� cloned��ü������ ������ ��
      //��ü�� �����ع���
      cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
      //�迭 copyof�޼��带 �迭�� ������ �����ϴ� �޼�����.
      //arrays����Ŭ������ copyof�޼��带 ������
      //copyof�� ù��°�μ��� �����������, ���簴ü�� ���ھ����ʵ��� �迭�� �����ϰڴ�
      //�ι�°�μ��� �󸶸�ŭ �����Ұ��̳Ŀ� ���� �迭�� ���̸� �־����
      //scores�迭�ʵ��� ���̸�ŭ �ϴ� �����ϰڴٴ� ����
      //cloned��ü������ �ִ� scores�迭�ʵ�ȿ� ������ �迭�� ������ �״�� �Ҵ�ȴ�
      
      //copyof�޼��忡�� 2���� �Ķ���Ͱ� �� . ���簴ü�� scores�� ���� ��ü�� scores length�� �����۾��� ��. �迭���� �����۾��� �޼���
      //car�� �����Ѵ�.
      cloned.car = new Car(this.car.model);
      //���Ķ���Ͱ� ���� ī��ü�� �����Ǽ� cloned������ ��ü������ car�ʵ忡 ����. 
      //���� ������ Member ��ü�� ����
      return cloned;
   }
   
   public Member getMember() {//�ٸ���� �޼�����
      Member cloned = null; //MemberŬ������ ������Ÿ���� ����� cloned��ü������ null������ �ʱ�ȭ��
      try {
         cloned = (Member) clone(); //Ŭ�и޼��带 �۵����Ѽ� ��ü�� �����ϰ� Member������Ÿ������ ������ȯ���Ѽ� cloned��ü������ ������
         //������ ��ü�� ��ü�����ȿ� �������
      } catch (CloneNotSupportedException e) { //�ͼ����� �̴ϼ��� e�� ����ó���� ��ü�������� ��
         e.printStackTrace();
      }
      return cloned;//���ܻ����� ������ �����Ѱ�ü�� ������ ���ư�
   }
}
*/