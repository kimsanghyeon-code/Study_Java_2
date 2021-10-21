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
		Student studentLee = new Student(100, "이상원");
		Student studentLee2 = studentLee;
		Student studentSang = new Student(100,"이상원");
		//동일한 주소의 두 인스턴스 비교
		if(studentLee == studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다.");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
		
		//주소는 다르지만 equals의 결과가 true인 경우
		if(studentLee == studentSang)
			System.out.println("studentLee와 studentSang의 주소는 같습니다.");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang은 동일합니다.");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다.");
		
		System.out.println("studentLee의 hashCode:"+ studentLee.hashCode());
		System.out.println("studentSang의 hashCode:"+ studentSang.hashCode());
		
		System.out.println("studentLee의 실제 주소값:"+ System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제 주소값:"+ System.identityHashCode(studentSang));
	}

}


/*
package test;

class Student{
   
   int studentId; //학생아이디
   String studentName; //학생이름
   
   public Student(int studentId, String studentName){ //생성자
      this.studentId = studentId; //매개변수가 studentId필드에 할당
      this.studentName = studentName; //매개변수가 studentName필드에 할당
   }
   
   public String toString(){ //tostring메서드
      return studentId + "," + studentName; //학생아이디와 학생이름을 리턴값으로 돌려줌
   }

   @Override
   public boolean equals(Object obj) { //이퀄즈메서드가 외부에서 들어오는 매개변수를 Object클래스데이터타입을 적용을 함
      if(obj instanceof Student){ //만약에 obj가 학생클래스하고 같은형태의 객체인지 확인을 함
         Student std = (Student)obj; //obj객체변수를 Student클래스데이터타입을 강제적용하고 std객체변수에 넣어버림
         if( studentId == std.studentId) //만약에 외부에서 온 매개변수의 학생아이디와 현재 비교하는 객체의 아이디가 같다면 true를 리턴하고 아니면 false
            return true;
         else return false;
      }
      return false;
   }

   @Override
   public int hashCode() { //해쉬코드메서드를 오버라이딩함
      //리턴하고 학생아이디 돌려줌
      //해쉬코드는 객체를 구분하는 정수값
      //통신이나 보안쪽에서 하나의 객체 혹은 하나의 접속자를 구분하기위해서 해쉬값을 계산을 함
      return studentId;
   }
   
}

public class EqualsTest {

   public static void main(String[] args) {

      Student studentLee = new Student(100, "이상원");//학생객체생성되고 studentLee객체변수에 할당
      Student studentLee2 = studentLee; //방금만든 studentLee객체변수의 값을 studentLee2객체변수에 할당
      //객체를 생성하면 그 객체가 메모리상에서 존재하는 번지주소가 객체변수에 할당이 된다 
      //그래서 변수끼리 값을 주고 받으면 같은 주소값을 갖게 된다. 
      Student studentSang = new Student(100, "이상원");
      //학생객체를 값은 똑같이 하지만 new키워드로 객체를 새로 생성한다 
      //그리고 studentSang객체변수는 다른곳으로 할당해준다
      // 동일한 주소의 두 인스턴스 비교
      if(studentLee == studentLee2)
         System.out.println("studentLee와 studentLee2의 주소는 같습니다.");
      else
         System.out.println("studentLee와 studentLee2의 주소는 다릅니다.");
      if(studentLee.equals(studentLee2))
         System.out.println("studentLee와 studentLee2는 동일합니다.");
      else
         System.out.println("studentLee와 studentLee2는 동일하지 않습니다.");
      
      //주소는 다르지만 equals 의 결과가 true 인 경우
      if(studentLee == studentSang)
         System.out.println("studentLee와 studentSang의 주소는 같습니다.");
      else
         System.out.println("studentLee와 studentSang의 주소는 다릅니다.");
      if(studentLee.equals(studentSang))
         System.out.println("studentLee와 studentSang은 동일합니다.");
      else
         System.out.println("studentLee와 studentSang은 동일하지 않습니다.");

      System.out.println("studentLee의 hashCode :" +studentLee.hashCode());
      System.out.println("studentSang의 hashCode :" +studentSang.hashCode());
      
      System.out.println("studentLee의 실제 주소값 :"+ System.identityHashCode(studentLee));
      System.out.println("studentSang의 실제 주소값 :"+ System.identityHashCode(studentSang));
   
   }
}
*/