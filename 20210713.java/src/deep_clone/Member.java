package deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {
   public String name;
   public int age;
   public int[] scores;
   public Car car;
   
   public Member(String name, int age, int[] scores, Car car) {
      this.name = name;
      this.age = age;
      this.scores = scores;
      this.car = car;
   }
   
   @Override
   protected Object clone() throws CloneNotSupportedException {
      //먼저 얕은 복사를 해서 name, age를 복제한다.
      Member cloned = (Member) super.clone();
      //scores를 복제한다.
      cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
      //car를 복제한다.
      cloned.car = new Car(this.car.model);
      //깊은 복제된 Member 객체를 리턴
      return cloned;
   }
   
   public Member getMember() {
      Member cloned = null;
      try {
         cloned = (Member) clone();
      } catch (CloneNotSupportedException e) {
         e.printStackTrace();
      }
      return cloned;
   }
}

/*
package deep_clone;

import java.util.Arrays;

public class Member implements Cloneable {//클론네이블인터페이스를 구현함
   public String name;
   public int age;
   public int[] scores; //배열이 들어감
   public Car car; //car클래스를 적용한 필드
   
   public Member(String name, int age, int[] scores, Car car) { //생성자
      this.name = name;
      this.age = age;
      this.scores = scores;//외부에서 매개변수로 배열인 scores가 들어와서 현재객체의 scores필드에 할당됨
      this.car = car;
   }
   
   @Override
   protected Object clone() throws CloneNotSupportedException {//Object데이터타입을 리턴하는 clone메서드 그리고 클론실패시적용할 예외처리선언
      //먼저 얕은 복사를 해서 name, age를 복제한다.
      Member cloned = (Member) super.clone(); //슈퍼키워드가 들어가면 오브젝트클래스의 클론메서드를 호출함. 클론메서드로 객체를 만들면 cloned객체변수에 할당
      //객체를 카피를 복사를 했음 그것의 데이터타입을 멤버클래스로 타입을 정의함 그리고 그것은 강제적으로 이루어지게함
      //복제한 객체를 Member클래스타입이 적용된 cloned객체변수에 저장을 함
      //객체를 복제해버림
      cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
      //배열 copyof메서드를 배열의 내용을 복제하는 메서드임.
      //arrays정적클래스의 copyof메서드를 쓴것임
      //copyof는 첫번째인수가 원본복제대상, 현재객체의 스코어즈필드의 배열을 복제하겠다
      //두번째인수는 얼마만큼 복제할것이냐에 대한 배열의 길이를 넣어줘요
      //scores배열필드의 길이만큼 싹다 복사하겠다는 뜻임
      //cloned객체변수에 있는 scores배열필드안에 복제된 배열의 내용이 그대로 할당된다
      
      //copyof메서드에는 2개의 파라메터가 들어감 . 현재객체의 scores와 현재 객체의 scores length를 복사작업을 함. 배열에서 복제작업을 메서드
      //car를 복제한다.
      cloned.car = new Car(this.car.model);
      //모델파라메터가 들어가고 카객체가 생성되서 cloned복제된 객체변수의 car필드에 들어간다. 
      //깊은 복제된 Member 객체를 리턴
      return cloned;
   }
   
   public Member getMember() {//겟멤버는 메서드임
      Member cloned = null; //Member클래스의 데이터타입이 적용된 cloned객체변수를 null값으로 초기화함
      try {
         cloned = (Member) clone(); //클론메서드를 작동시켜서 객체를 복사하고 Member데이터타입으로 강제변환시켜서 cloned객체변수에 저장함
         //복사한 객체를 객체변수안에 집어넣음
      } catch (CloneNotSupportedException e) { //익셉션의 이니셜인 e가 예외처리의 객체변수명이 됨
         e.printStackTrace();
      }
      return cloned;//예외사항이 없으면 복사한객체를 가지고 돌아감
   }
}
*/