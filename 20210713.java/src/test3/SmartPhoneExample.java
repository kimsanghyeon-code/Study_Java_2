package test3;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글","안드로이드");
		
		String strObj = myPhone.toString();
		System.out.println(strObj);
		
		System.out.println(myPhone);
	}
}

/*
package test;
public class SmartPhoneExample {
   public static void main(String[] args) {
      SmartPhone myPhone = new SmartPhone("구글", "안드로이드"); //스마트폰의 객체를 만들고 2개의 매개변수를 넣음
      //myPhone객체변수에 할당을 함
      
      String strObj = myPhone.toString();
      //myPhone의 tostring메서드를 작동시키고 그결과를 String클래스데이터타입이 적용된 strObj객체변수에 저장함
      System.out.println(strObj);//출력함
      
      System.out.println(myPhone);
      //println을 출력을 할려고 할때. 데이터타입이 적용되면 해당되는 값을 출력한다. 변수를 정했다면. 
      //strOjb, myPhone도 객체변수라는 공통점을 가지고 있음.
      //println의 매개변수로 특정변수가 아닌 객체를 넣어주면 그 객체안에 있는 tostring메서드를 호출해서 결과값을 출력해준다. 
      
      //println메서드는 객체변수를 받으면 그 객체안에 tostring메서드가 있다면 그것을 실행시킨다. 
   }
}
*/