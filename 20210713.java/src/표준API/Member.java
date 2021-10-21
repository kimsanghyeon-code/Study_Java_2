package ǥ��API;

public class Member {
	public String id;
	public Member(String id) {
		this.id = id;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}

/*
package test;

public class Member {
   public String id; //id�� �ʵ�
   
   public Member(String id) { //�����ڿ� id�� ������ ���ο� �ִ� id�ʵ忡 �Ű��������� �Ҵ��Ѵ�
      this.id = id;
   }
   
   @Override
   public boolean equals(Object obj) { //������޼��带 �������̵��Ѵ� 
      //��ü�� ������ �Ǵ� objectŬ������ ������Ÿ���� ������ obj�� �Ű������� �־��ش�
      //�ܺο��� objectŬ����������Ÿ���� ����� obj�Ű������� �־ 
      if(obj instanceof Member) { //���࿡ obj��ü������ Member Ÿ������ Ȯ���� ��
         Member member = (Member) obj; 
         //obj�� MemberŬ����Ÿ������ ���� ��ȯ�ϰ� �װ��� member��ü������ �Ҵ��Ѵ�
         if(id.equals(member.id)) { //���࿡ id�� equals�޼��忡 id�ʵ尪�� ���ٸ� 
            //true���� �����Ѵ�
            return true;
         }
      }
      return false;
   }
}
*/
