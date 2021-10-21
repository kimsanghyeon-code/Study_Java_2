package deep_clone;
public class MemberExample {
   public static void main(String[] args) {
      //원본 객체 생성
      Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
      
      //복제 객체를 얻은 후에 참조 객체의 값을 변경
      Member cloned = original.getMember();
      cloned.scores[0] = 100;
      cloned.car.model = "그랜저";
      
      System.out.println("[복제 객체의 필드값]");
      System.out.println("name: " + cloned.name);
      System.out.println("age: " + cloned.age);
      System.out.print("scores: {");
      for(int i=0; i<cloned.scores.length; i++) {
         System.out.print(cloned.scores[i]);
         System.out.print((i==(cloned.scores.length-1))?"":",");
      }
      System.out.println("}");
      System.out.println("car: " + cloned.car.model);
      
      System.out.println();
      
      System.out.println("[원본 객체의 필드값]");
      System.out.println("name: " + original.name);
      System.out.println("age: " + original.age);
      System.out.print("scores: {");
      for(int i=0; i<original.scores.length; i++) {
         System.out.print(original.scores[i]);
         System.out.print((i==(original.scores.length-1))?"":",");
      }
      System.out.println("}");
      System.out.println("car: " + original.car.model);
   }
}


/*
package deep_clone;
public class MemberExample {
   public static void main(String[] args) {
      //원본 객체 생성
      Member original = new Member("홍길동", 25, new int[] {90, 90}, new Car("소나타"));
      //객체를 초기화하고 그 객체를 Member클래스의 데이터타입을 적용한 original객체변수에 할당한다
      
      //복제 객체를 얻은 후에 참조 객체의 값을 변경
      Member cloned = original.getMember();//오리지널에서 객체변수에서 복제객체를 생성하는 메서드를 작동시켜서 Member클래스데이터타입인 cloned객체변수에 저장한다
      //복제한 객체를 cloned에 할당한다
      cloned.scores[0] = 100; //복제객체의 scores배열필드의 0번필드안에 100을 저장을 함
      cloned.car.model = "그랜저";//복제객체의 car객체필드의 모델을 그랜저로 변경함. 오리지널은 소나타인데. 그랜져가 됨.
      
      System.out.println("[복제 객체의 필드값]");
      System.out.println("name: " + cloned.name);
      System.out.println("age: " + cloned.age);
      System.out.print("scores: {");
      for(int i=0; i<cloned.scores.length; i++) {//i가 복제객체변수의 scores배열필드의 길이보다 작을떄까지 반복한다.0번인덱스부터 출력하니까. 
         //cloned복제객체변수에서 scores i인덱스를 출력한다
         System.out.print(cloned.scores[i]);
         System.out.print((i==(cloned.scores.length-1))?"":",");
         //i인덱스가 cloned복제객체변수의 socores배열필드의 길이보다 1작은가 
         //배열은 0번부터시작하고 전체길이에서 1을 뺴면 0부터 길이센 배열의 가장 큰 넘버인덱스가 나옴.
         //i가 그것과 같은 가 
         //true이면 ""공백
         //끝이니까. 
         //그게 아니면 아직 더 출력할것이 있기때문에 ,를 뒤에 찍어준다라는 것이죠
         //배열의 요소들이 출력될때 서로 구분되라고 콤마를 찍어주는 로직임.
      }
      System.out.println("}");
      System.out.println("car: " + cloned.car.model);//카객체필드의 모델출력
      
      System.out.println();
      
      System.out.println("[원본 객체의 필드값]");
      System.out.println("name: " + original.name);//원본의 이름
      System.out.println("age: " + original.age);//원본나이
      System.out.print("scores: {"); //배열은 
      for(int i=0; i<original.scores.length; i++) {
         System.out.print(original.scores[i]);
         System.out.print((i==(original.scores.length-1))?"":",");
      }
      System.out.println("}");
      System.out.println("car: " + original.car.model);
      //복제객체변수에는 0번인덱스를 변경해서 값이 변하고 모델도 변하고 했는데 원본은 그대로 있다 .
   }
}
*/
