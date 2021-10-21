package clone;

public class Member implements Cloneable{
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public Member(String id, String name, String password, int age, boolean adult) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public Member getMember() {
		Member cloned = null;
		try {
			cloned = (Member) clone();
		}catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return cloned;
	}
}


/*
package clone;

public class Member implements Cloneable {
   //��������
   //Cloneable�������̽��� �����ؼ� �����۾��� ��
   //�����������̽���. 
   //implements �������̽��� �ǹ���
   //�������̽��� ������ü�� �ش��������̽��� �ִ� �޼ҵ���� ���� �����س�����.
   public String id;
   public String name;
   public String password;
   public int age;
   public boolean adult; //5���� �ʵ弱��
   //�����Ͱ� ����� ��
   
   public Member(String id,  String name, String password, int age, boolean adult ) {
      this.id = id;
      this.name = name;
      this.password = password;
      this.age = age;
      this.adult = adult;
   }//��������. �ʱⰪ����
   
   public Member getMember() {
      Member cloned = null; //memberŬ����������Ÿ���� ����� cloned��ü������ �ΰ����� �ʱ�ȭ�� ��. 
      try { //try�������� �����̶� �ݵ�� ����Ǵ� ����
         cloned = (Member) clone();
         //��ü���� cloned�� clone�޼��带 �۵���Ű�� �װ��� ���������Ÿ������ ������ȯ�Ѵ�. �װ��� cloned�Ҵ���
      } catch (CloneNotSupportedException e) {
         //�������нÿ� ������ �����޽���
         //catch�� ����ó���� �����߻��� ó���� ����
         e.printStackTrace(); //e�� ������ ���� Ŭ������ ������Ÿ���� ���� ������ ����ó���� ���� ��ü��� �����. 
      }
      return cloned;//�����۾��� �Ͼ�� ����� cloned��ü������ �����ش�
   }
}
*/