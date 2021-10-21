package test3;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		Object obj1 = new Object();
		Date obj2 = new Date();
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
	}
}


/*
package test;

import java.util.Date;

public class ToStringExample {
   public static void main(String[] args) {
      //오브젝트가 원형클래스임. 그래서 오브젝트에 있는 toString메서드가 각 클래스에서 오버라이딩되어서 사용이 되고 있음
      Object obj1 = new Object(); //오브젝트클래스의 생성자로 객체를 생성하고  object클래스데이터타입을 적용된 obj1에 할당
      Date obj2 = new Date();//데이트클래스의 생성자로 객체를 생성하고  date클래스데이터타입을 적용된 obj2에 할당
      
      System.out.println(obj1.toString());//object클래스의 투스트링메서드를 호출하고
      //java.lang.Object@7a81197d
      //클래스명@16진수해시코드
      System.out.println(obj2.toString()); //date클래스의 투스트링메서드를 호출함
      //날짜데이터연산관련되서 투스트링메서드로 표현할수있는 것을 사용할 수있도록 오버라이딩됐음.
      //ue Jul 13 14:02:59 KST 2021 날짜에 대한 데이터가 문자열의 형태로 출력이 됨. 
      //어느클래스에서 유래가 됐는지에 따라서 같은 메서드도 내용이 달라질수있다. 
      
   }
}
*/