package clone;

public class MemberExample {
	public static void main(String[] args) {
		//원본 객체 생성
		Member original = new Member("blue","홍길동","12345",25,true);
		
		//복제 객체를 얻은 후에 패스워드 변경
		Member cloned = original.getMember();
		cloned.password = "67890";
		
		System.out.println("[복제 객체의 필드값]");
		System.out.println("id: "+cloned.id);
		System.out.println("name:"+cloned.name);
		System.out.println("password:"+cloned.password);
		System.out.println("age:"+cloned.age);
		System.out.println("adult:"+cloned.adult);
		
		System.out.println();
		
		System.out.println("[원본 객체의 필드값]");
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
      //원본 객체 생성
      Member original = new Member("blue", "홍길동", "12345", 25, true);
      //뉴키워드하고 인수 5개를 넣음 객체를 생성하고, member클래스의 데이터타입이 적용된 original객체변수에 객체를 할당했음. 
      
      //복제 객체를 얻은 후에 패스워드 변경
      Member cloned = original.getMember(); //original데이터가 있는 객체변수에서 getMember메서드를 작동시킴
      cloned.password = "67890";//객체변수 cloned에서 password필드에 67890 리터럴을 할당해줌
      //password필드의 값을 변경할 수 있음. 
      
      System.out.println("[복제 객체의 필드값]");
      System.out.println("id: " + cloned.id);
      System.out.println("name: " + cloned.name);
      System.out.println("password: " + cloned.password);
      System.out.println("age: " + cloned.age);
      System.out.println("adult: " + cloned.adult);
      
      System.out.println();
      
      System.out.println("[원본 객체의 필드값]");
      System.out.println("id: " + original.id);
      System.out.println("name: " + original.name);
      System.out.println("password: " + original.password);
      System.out.println("age: " + original.age);
      System.out.println("adult: " + original.adult);
   }
}
*/