package 객체소멸자;

public class FinalizeExample {
	public static void main(String[] args) {
		Counter counter = null;
		for(int i=1; i<=50; i++) {
			counter = new Counter(i);
			counter = null;
			System.gc();
		}
	}
}


/*
package finalize;

public class FinalizeExample {
   public static void main(String[] args) {
      Counter counter = null; //파이널라이즈메서드를 오버라이드한 카운트클래스의 데이터타입을 적용한 counter객체변수에 널값으로 초기화
      for(int i=1; i<=50; i++) { //for문으로 i는 1부터 i는 50보다작거나 같을때까지
         counter = new Counter(i); //new키워드로 카운터클래스생성자를 작동시킴
         //카운터클래스에는 파이널라이즈메서드가 ..있다. 
         //이것을 객체가 삭제되어서 사라지기 직전에 작동되는 것이 파이널라이즈메서드임.
         
         counter = null; //카운터객체는 초기화를 하는 것임. 
         //counter객체변수에 null값을 넣으면 객체는 활동중지상태가됨. 곧 쓸수없는 쓰레기 객체가 된다. 
         System.gc(); //gc는 거버지컬랙터라는 메서드인데 죽은 객체를 회수해달라고 하는 명령메서드임. 
         //가버지콜렉션은 쓰레기를 모은다는 뜻.
         
         //바로위에서 카운트객체변수에 널을 넣어서 쓰레기객체를 만들었기 떄문에 gc메서드를 쓰면 쓰레기된 객체가 타겟이 되게 되어버림. 
         //system정적클래스의 gc메서드라고 하면 됨. 자바가상머신 JVM이 사용하지 않는 객체를 회수하게 됨.
         //gc에 의해서 회수가 되는 순간에 마지막에 딱한번 메시지 출력하고 사라지는 거예요. 
      }
   }
}
*/