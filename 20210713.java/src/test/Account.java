package test;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}
	
	public String getAno() {return ano;}
	public void setAno(String ano) {this.ano=ano;}
	public String getOwner() {return owner;}
	public void setOwner(String owner) {this.owner=owner;}
	public int getBalance() {return balance;}
	public void setBalance(int balance) {this.balance=balance;}
}


/*
package test;

public class Account {
   //필드들의 세팅
   private String ano;
   private String owner;
   private int balance;
   
   public Account(String ano, String owner, int balance) { //생성자정보
      //객체의 생성정보
      this.ano = ano;
      this.owner = owner;
      this.balance = balance;
      //현재의 객체에 외부에서 들어온 매개변수를 저장시킨다
   }
   
   //필드에 들어있는 값을 가져오거나 필드에 값을 세팅하는 메서드들임
   public String getAno() { return ano; } //고객번호가져오는 것
   public void setAno(String ano) { this.ano = ano; }
   //고객번호세팅
   public String getOwner() { return owner; } //계좌주의 정보를 가져옴
   public void setOwner(String owner) { this.owner = owner; } 
   //계좌주 정보세팅
   public int getBalance() { return balance; } //잔액정보를 가져옴
   public void setBalance(int balance) { this.balance = balance; }
   //잔액정보세팅
   //게터와 세터메서드를 설정해서  값을 추가하거나 값을 가져와서 출력하는 용도로 사용한다
}
*/