package test2;

class Student{
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public String toString() {
		return studentId + "," + studentName;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			if(studentId == std.studentId)
				return true;
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return studentId;
	}
}
public class EqualsTest {
	public static void main(String[] args) {
		Student studentLee = new Student(100, "�̻��");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"�̻��");
		//������ �ּ��� �� �ν��Ͻ� ��
		if(studentLee == studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
		
		//�ּҴ� �ٸ����� equals�� ����� true�� ���
		if(studentLee == studentSang)
			System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�.");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");
		
		System.out.println("studentLee�� hashCode:"+ studentLee.hashCode());
		System.out.println("studentSang�� hashCode:"+ studentSang.hashCode());
		
		System.out.println("studentLee�� ���� �ּҰ�:"+ System.identityHashCode(studentLee));
		System.out.println("studentSang�� ���� �ּҰ�:"+ System.identityHashCode(studentSang));
	}

}


/*
package test;

class Student{
   
   int studentId; //�л����̵�
   String studentName; //�л��̸�
   
   public Student(int studentId, String studentName){ //������
      this.studentId = studentId; //�Ű������� studentId�ʵ忡 �Ҵ�
      this.studentName = studentName; //�Ű������� studentName�ʵ忡 �Ҵ�
   }
   
   public String toString(){ //tostring�޼���
      return studentId + "," + studentName; //�л����̵�� �л��̸��� ���ϰ����� ������
   }

   @Override
   public boolean equals(Object obj) { //������޼��尡 �ܺο��� ������ �Ű������� ObjectŬ����������Ÿ���� ������ ��
      if(obj instanceof Student){ //���࿡ obj�� �л�Ŭ�����ϰ� ���������� ��ü���� Ȯ���� ��
         Student std = (Student)obj; //obj��ü������ StudentŬ����������Ÿ���� ���������ϰ� std��ü������ �־����
         if( studentId == std.studentId) //���࿡ �ܺο��� �� �Ű������� �л����̵�� ���� ���ϴ� ��ü�� ���̵� ���ٸ� true�� �����ϰ� �ƴϸ� false
            return true;
         else return false;
      }
      return false;
   }

   @Override
   public int hashCode() { //�ؽ��ڵ�޼��带 �������̵���
      //�����ϰ� �л����̵� ������
      //�ؽ��ڵ�� ��ü�� �����ϴ� ������
      //����̳� �����ʿ��� �ϳ��� ��ü Ȥ�� �ϳ��� �����ڸ� �����ϱ����ؼ� �ؽ����� ����� ��
      return studentId;
   }
   
}

public class EqualsTest {

   public static void main(String[] args) {

      Student studentLee = new Student(100, "�̻��");//�л���ü�����ǰ� studentLee��ü������ �Ҵ�
      Student studentLee2 = studentLee; //��ݸ��� studentLee��ü������ ���� studentLee2��ü������ �Ҵ�
      //��ü�� �����ϸ� �� ��ü�� �޸𸮻󿡼� �����ϴ� �����ּҰ� ��ü������ �Ҵ��� �ȴ� 
      //�׷��� �������� ���� �ְ� ������ ���� �ּҰ��� ���� �ȴ�. 
      Student studentSang = new Student(100, "�̻��");
      //�л���ü�� ���� �Ȱ��� ������ newŰ����� ��ü�� ���� �����Ѵ� 
      //�׸��� studentSang��ü������ �ٸ������� �Ҵ����ش�
      // ������ �ּ��� �� �ν��Ͻ� ��
      if(studentLee == studentLee2)
         System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�.");
      else
         System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�.");
      if(studentLee.equals(studentLee2))
         System.out.println("studentLee�� studentLee2�� �����մϴ�.");
      else
         System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�.");
      
      //�ּҴ� �ٸ����� equals �� ����� true �� ���
      if(studentLee == studentSang)
         System.out.println("studentLee�� studentSang�� �ּҴ� �����ϴ�.");
      else
         System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�.");
      if(studentLee.equals(studentSang))
         System.out.println("studentLee�� studentSang�� �����մϴ�.");
      else
         System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�.");

      System.out.println("studentLee�� hashCode :" +studentLee.hashCode());
      System.out.println("studentSang�� hashCode :" +studentSang.hashCode());
      
      System.out.println("studentLee�� ���� �ּҰ� :"+ System.identityHashCode(studentLee));
      System.out.println("studentSang�� ���� �ּҰ� :"+ System.identityHashCode(studentSang));
   
   }
}
*/