package 객체소멸자;

public class Counter {
	private int no;
	
	public Counter(int no) {
		this.no = no;
	}
	
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no + "번 객체의 finalize()가 실행됨");
	}
}


/*
package finalize;

public class Counter {
   private int no; //no필드설정
   
   public Counter(int no) {//생성자설정해줌
      this.no = no;
   }
   
   @Override
   protected void finalize() throws Throwable {
      System.out.println(no + "번 객체의 finalize()가 실행됨");
      //우리가 쓰기위해서 finalize()메서드를 오버라이딩했다
      //덤으로 따라오는 형태
   }
}
*/