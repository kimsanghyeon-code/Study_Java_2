package 표준API;

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
   public String id; //id는 필드
   
   public Member(String id) { //생성자에 id가 들어오면 내부에 있는 id필드에 매개변수값을 할당한다
      this.id = id;
   }
   
   @Override
   public boolean equals(Object obj) { //이퀄즈메서드를 오버라이딩한다 
      //객체의 원형이 되는 object클래스의 데이터타입을 적용한 obj를 매개변수로 넣어준다
      //외부에서 object클래스데이터타입을 적용된 obj매개변수를 넣어서 
      if(obj instanceof Member) { //만약에 obj객체변수가 Member 타입인지 확인을 함
         Member member = (Member) obj; 
         //obj를 Member클래스타입으로 강제 변환하고 그것을 member객체변수에 할당한다
         if(id.equals(member.id)) { //만약에 id의 equals메서드에 id필드값이 같다면 
            //true값을 리턴한다
            return true;
         }
      }
      return false;
   }
}
*/
