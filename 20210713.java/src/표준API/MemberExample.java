package 표준API;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		}else {
			System.out.println("ojb1과 obj2는 동등하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
	}
}


/*
package test;

public class MemberExample {
   public static void main(String[] args) {
      Member obj1 = new Member("blue"); //blue문자열을 멤버생성자에서 객체화해서 obj1객체변수에 할당
      Member obj2 = new Member("blue"); //blue문자열을 멤버생성자에서 객체화해서 obj2객체변수에 할당
      Member obj3 = new Member("red");  //red문자열을 멤버생성자에서 객체화해서 obj3객체변수에 할당
      
      if(obj1.equals(obj2)) { // 만약에 obj1의 이퀄즈메서드에 매개변수로 obj2를 넣을 경우에 참이면 
         System.out.println("obj1과 obj2는 동등합니다."); //이라고 출력함
      } else { //아니면 동등하지않다고 출력됨
         System.out.println("obj1과 obj2는 동등하지 않습니다.");
      }
      
      if(obj1.equals(obj3)) {  // 만약에 obj1이 obj3와 이퀄즈메서드계산을 하면
         System.out.println("obj1과 obj3은 동등합니다."); //참이면 동등하다고 출력되고 아니면 
      } else { //동등하지않다고 출력됨.
         System.out.println("obj1과 obj3은 동등하지 않습니다.");
      }
   }
}
*/