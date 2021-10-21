package test;

import java.util.Scanner;

public class BankApplication {
   private static Account[] accountArray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);
   
   public static void main(String[] args) {
      boolean run = true;      
      while(run) {
         System.out.println("----------------------------------------------------------");
         System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
         System.out.println("----------------------------------------------------------");
         System.out.print("선택> ");
         
         int selectNo = scanner.nextInt();
         
         if(selectNo == 1) {
            createAccount();
         } else if(selectNo == 2) {
            accountList();
         } else if(selectNo == 3) {
            deposit();
         } else if(selectNo == 4) {
            withdraw();
         } else if(selectNo == 5) {
            run = false;
         }
      }
      System.out.println("프로그램 종료");
   }
   
   //계좌생성하기
   private static void createAccount() {
      System.out.println("--------------");
      System.out.println("계좌생성");
      System.out.println("--------------");
      
      System.out.print("계좌번호: "); 
      String ano = scanner.next();
      
      System.out.print("계좌주: "); 
      String owner = scanner.next();
      
      System.out.print("초기입금액: ");
      int balance = scanner.nextInt();
      
      Account newAccount = new Account(ano, owner, balance);
      for(int i=0; i<accountArray.length; i++) {
         if(accountArray[i] == null) {
            accountArray[i] = newAccount;
            System.out.println("결과: 계좌가 생성되었습니다.");
            break;
         }
      }
   }
   
   //계좌목록보기
   private static void accountList() {
      System.out.println("--------------");
      System.out.println("계좌목록");
      System.out.println("--------------");
      for(int i=0; i<accountArray.length; i++) {
         Account account = accountArray[i];
         if(account != null) {
            System.out.print(account.getAno());
            System.out.print("     ");
            System.out.print(account.getOwner());
            System.out.print("     ");
            System.out.print(account.getBalance());
            System.out.println();
         }
      }
   }
   
   //예금하기
   private static void deposit() {
      System.out.println("--------------");
      System.out.println("예금");
      System.out.println("--------------");
      System.out.print("계좌번호: "); 
      String ano = scanner.next();
      System.out.print("예금액: ");
      int money = scanner.nextInt();
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("결과: 계좌가 없습니다.");
         return;
      }
      account.setBalance(account.getBalance() + money);
      System.out.println("결과: 예금이 성공되었습니다.");
   }
   
   //출금하기
   private static void withdraw() {
      System.out.println("--------------");
      System.out.println("출금");
      System.out.println("--------------");
      System.out.print("계좌번호: "); 
      String ano = scanner.next();
      System.out.print("출금액: ");
      int money = scanner.nextInt();
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("결과: 계좌가 없습니다.");
         return;
      }
      account.setBalance(account.getBalance() - money);
      System.out.println("결과: 출금이 성공되었습니다.");
   }   
   
   //Account 배열에서 ano와 동일한 Account 객체 찾기
   private static Account findAccount(String ano) {
      Account account = null;
      for(int i=0; i<accountArray.length; i++) {
         if(accountArray[i] != null) {
            String dbAno = accountArray[i].getAno();
            if(dbAno.equals(ano)) {
               account = accountArray[i];
               break;
            }
         }
      }
      return account;
   }
}


/*
package test;

import java.util.Scanner; //외부에서 값을 입력받을 수있도록 해주는 클래스

public class BankApplication {
   private static Account[] accountArray = new Account[100];//100개의 배열방들을 만들고 accountArray배열객체변수를 정의하고 만들어진 배열객체를 저장한다
   //외부에서 접근이 안되고 정적인, 전역적으로 사용됨
   private static Scanner scanner = new Scanner(System.in);
   //키보드를 통해서 글자데이터를 들어오는 데, system.in 이것을 매개변수로 해서 스캐너클래스생성자가 객체를 생성해서 scanner객체변수에 할당한다
   //scanner는 외부에서 들어온 데이터를 핸들링할수 있는 객체변수가 된다 
   //메인함수들어가기전에 배열과 객체변수를 선언한다
   public static void main(String[] args) {
      boolean run = true;      //run변수가 설정이 됨 참으로 설정됨
      
      while(run) {
         //while문에 run변수값을 매개변수로 활용함
         //true가 run에 있는 한은 계속 반복함
         System.out.println("----------------------------------------------------------");
         System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
         System.out.println("----------------------------------------------------------");
         System.out.print("선택> ");
         //화면에 인터페이스 메뉴를 글자로 서 출력해준다
         
         
         int selectNo = scanner.nextInt(); //다음들어오는 정수가 scanner객체에 의해서 값이 전달된다 
         //selectNo정수형객체변수에 저장이 된다
         
         if(selectNo == 1) {
            //만약에 selectNo객체변수에 들어있는 값이 1과 같다면 
            createAccount();
            //바로 밑에 있는 createAccount메서드를 사용함
         } else if(selectNo == 2) {
            accountList();
            //2번이라면 accountList메서드를 작동한다
         } else if(selectNo == 3) {
            deposit();
            //3번이면 deposit메서드를 작동한다
         } else if(selectNo == 4) {
            withdraw();
            //4번이면 withdraw메서드를 작동한다
         } else if(selectNo == 5) {
            run = false;
            //5번이면 run변수에 false를 넣어준다
            //run변수는 while실행될때마다 비교하는데, false값이 들어가니까 .while문이 종료한다
            //다중if문으로 선택지와 관련된 메서드를 호출한다 
         }
      }
      System.out.println("프로그램 종료"); //5번을 누르게 되면 프로그래종료가 되는 것임.
   }
   
   //계좌생성하기
   private static void createAccount() { //계좌생성메서드
      System.out.println("--------------");
      System.out.println("계좌생성");
      System.out.println("--------------");
      
      System.out.print("계좌번호: "); 
      String ano = scanner.next(); //scanner클래스를 통해서 넥스트메서드로 데이터를 입력받고 
      //string문자열클래스 데이터타입을 적용한 ano객체변수에 입력된 값을 할당한다
      
      System.out.print("계좌주: "); 
      String owner = scanner.next(); //넥스트메서드로 문자열을 입력받고 
      //owner객체변수에 할당한다 
      
      System.out.print("초기입금액: ");
      int balance = scanner.nextInt(); //정수데이터를 입력받아서 넥스트인티저메서드로. 
      //balance객체변수에 값을 할당한다
      
      //외부에서 값을 받은 3개의 변수를 활용해서
      Account newAccount = new Account(ano, owner, balance);
      // new키워드로 Account클래스의 생성자에 3개의 변수값을 매개변수로 넣고 적용한 후에 생성된 객체를 
      //Account클래스데이터타입을 적용한 newAccount객체변수에 할당한다
      for(int i=0; i<accountArray.length; i++) {
         //i가 accountArray의 길이보다 작을때까지만 반복을 함
         if(accountArray[i] == null) {
            //만약에 accountArray의 i인덱스가 null값 비어있는 값과 같다면 
            accountArray[i] = newAccount;
            //newAccount객체변수값을 accountArray i인덱스에 할당한다 
            System.out.println("결과: 계좌가 생성되었습니다.");
            break;
         }
      }
   }
   
   //계좌목록보기
   private static void accountList() {
      System.out.println("--------------");
      System.out.println("계좌목록");
      System.out.println("--------------");
      for(int i=0; i<accountArray.length; i++) {
         //i는 0 i가 accountArray의 길이보다 작을때까지 반복을 함
         Account account = accountArray[i];
         //accountArray의 i인덱스값을 account객체변수에 할당한다
         if(account != null) { //account객체변수가 null 배열의 값이 들어있다면 아래의 출력문을 실행한다
            System.out.print(account.getAno()); //account객체변수에서 getAno메서드를 실행한다 
            System.out.print("     "); //탭을 넣어서 사이 띄우기 해주고
            System.out.print(account.getOwner()); //account객체변수에서 getOwner메서드로 계좌주의 정보를 출력한다
            System.out.print("     ");//탭넣음
            System.out.print(account.getBalance());//account객체변수에서 getBalance메서드로 잔액정보를 출력한다
            System.out.println();
         }
      }
   }
   
   //예금하기
   private static void deposit() {
      System.out.println("--------------");
      System.out.println("예금");
      System.out.println("--------------");
      System.out.print("계좌번호: "); 
      String ano = scanner.next(); //scanner클래스의 next메서드로 문자열을 입력받고 ano에 저장된다
      System.out.print("예금액: ");
      int money = scanner.nextInt();//scanner클래스의 nextint메서드로 숫자값을 입력받고 그것을 money객체변수에 할당한다 
      Account account = findAccount(ano); //findAccount메서드에 ano객체변수의 값을 매개변수로 넣는다
      //account객체변수에 findAccount메서드의 결과값을 할당한다
      if(account == null) { //만약에 account객체변수가 null비어있는 값과 같다면
         System.out.println("결과: 계좌가 없습니다.");
         //계좌정보가 없음
         return;
      }
      account.setBalance(account.getBalance() + money);
      //account객체변수에서 setBalance 세터메서드임. 잔액을 세팅함
      //account객체변수에서 getBalance 기존의 잔액과 money변수 에 있는 값을 더하고 그 결과를 잔액설정메서드에 매개변수로 넣는다
      System.out.println("결과: 예금이 성공되었습니다.");
   }
   
   //출금하기
   private static void withdraw() {
      System.out.println("--------------");
      System.out.println("출금");
      System.out.println("--------------");
      System.out.print("계좌번호: "); 
      String ano = scanner.next(); //스캐너클래스로 문자열을 입력받는다 그리고 그결과를 ano객체변수에 저장한다
      System.out.print("출금액: "); 
      int money = scanner.nextInt(); //스캐너클래스로 정수값을 입력받는다 그것을 money변수에 저장한다
      Account account = findAccount(ano); //계좌정보를 찾아야 예금을 늘리든 줄이든 할것이기에
      //findAccount메서드에 ano계좌번호를 매개변수로 넣음
      if(account == null) {
         //만약에 account객체변수에 null값이 같다면 
         System.out.println("결과: 계좌가 없습니다.");
         //계좌정보가 없음
         return;
      }
      account.setBalance(account.getBalance() - money);
      //setBalance메서드로 account객체변수의 getBalance 잔액을 불러와서 money변수의 값을 차감시킨다
      System.out.println("결과: 출금이 성공되었습니다.");
   }   
   
   //Account 배열에서 ano와 동일한 Account 객체 찾기
   private static Account findAccount(String ano) {
      //Acccount클래스의 자료형을 적용한 account객체변수에는 null값으로 초기화를 한다 
      Account account = null;
      
      for(int i=0; i<accountArray.length; i++) {
         //i는 0 i는 accountArray의 길이보다 작을 때까지만 반복을 한다
         if(accountArray[i] != null) {
            //만약에 accountArray의 i인덱스하고 null값이 다르다면 해당배열의 i인덱스에 데이터값이 들어있다면 실행문을 작동시키라는 뜻임
            String dbAno = accountArray[i].getAno();
            //문자열클래스의 데이터타입을 적용한 dbAno객체변수에 accountArray배열의 i인덱스에서 getAno 메서드로 계좌번호를 할당한다
            if(dbAno.equals(ano)) { //만약에 dbAno객체변수와 ano객체변수가 서로 같다면 
               //equas메서드는 서로 값이 같은지 파악함
               account = accountArray[i]; //accountArray i인덱스값을 account객체변수에 할당한다
               //그리고 반복을 끝냄
               break;
            }
         }
      }
      return account;
   }
}
*/














