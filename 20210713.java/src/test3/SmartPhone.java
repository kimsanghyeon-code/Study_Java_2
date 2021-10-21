package test3;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	@Override
	public String toString() {
		return company + "," + os;
	}
}

/*
package test;

public class SmartPhone {
   //우리가 표준API에 존재하는 투스트링메서드를 오버라이딩해서 활용하는 코드
   private String company;
   private String os; //프라이빗필드를 2개를 설정
   
   public SmartPhone(String company, String os) { 
      //생성자 2개의 데이터를 매개변수로 입력받아서 필드를 초기화시킴
      this.company = company;
      this.os = os;
   }
   
   @Override //오버라이딩어노테이션을 선언
   public String toString() { //문자열데이터타입으로 리턴되는 결과를 보여주는 메서드를 선언함 오버라이딩의 형태로
      return company + ", " + os;
      //내부에 있는 필드 company하고 os를 출력해줌
   }
}
*/