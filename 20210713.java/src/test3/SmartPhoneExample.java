package test3;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����","�ȵ���̵�");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
}

/*
package test;
public class SmartPhoneExample {
   public static void main(String[] args) {
      SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�"); //����Ʈ���� ��ü�� ����� 2���� �Ű������� ����
      //myPhone��ü������ �Ҵ��� ��
      
      String strObj = myPhone.toString();
      //myPhone�� tostring�޼��带 �۵���Ű�� �װ���� StringŬ����������Ÿ���� ����� strObj��ü������ ������
      System.out.println(strObj);//�����
      
      System.out.println(myPhone);
      //println�� ����� �ҷ��� �Ҷ�. ������Ÿ���� ����Ǹ� �ش�Ǵ� ���� ����Ѵ�. ������ ���ߴٸ�. 
      //strOjb, myPhone�� ��ü������� �������� ������ ����.
      //println�� �Ű������� Ư�������� �ƴ� ��ü�� �־��ָ� �� ��ü�ȿ� �ִ� tostring�޼��带 ȣ���ؼ� ������� ������ش�. 
      
      //println�޼���� ��ü������ ������ �� ��ü�ȿ� tostring�޼��尡 �ִٸ� �װ��� �����Ų��. 
   }
}
*/