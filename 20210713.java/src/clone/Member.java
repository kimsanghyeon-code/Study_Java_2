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
   //얕은복제
   //Cloneable인터페이스를 구현해서 복제작업을 함
   //복제인터페이스임. 
   //implements 인터페이스를 의미함
   //인터페이스의 구현객체는 해당인터페이스에 있는 메소드들을 전부 구현해내야함.
   public String id;
   public String name;
   public String password;
   public int age;
   public boolean adult; //5개의 필드선언
   //데이터가 저장될 곳
   
   public Member(String id,  String name, String password, int age, boolean adult ) {
      this.id = id;
      this.name = name;
      this.password = password;
      this.age = age;
      this.adult = adult;
   }//생성자임. 초기값설정
   
   public Member getMember() {
      Member cloned = null; //member클래스데이터타입이 적용된 cloned객체변수에 널값으로 초기화를 함. 
      try { //try정상적인 구문이라서 반드시 실행되는 구문
         cloned = (Member) clone();
         //객체변수 cloned에 clone메서드를 작동시키고 그것을 멤버데이터타입으로 강제변환한다. 그것을 cloned할당함
      } catch (CloneNotSupportedException e) {
         //복제실패시에 나오는 오류메시지
         //catch는 예외처리나 오류발생시 처리할 구문
         e.printStackTrace(); //e는 오류에 대한 클래스의 데이터타입을 받은 오류나 예외처리에 대한 객체라고 보면됨. 
      }
      return cloned;//복제작업이 일어나서 저장된 cloned객체변수를 돌려준다
   }
}
*/