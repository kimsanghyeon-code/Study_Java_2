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
   //�ʵ���� ����
   private String ano;
   private String owner;
   private int balance;
   
   public Account(String ano, String owner, int balance) { //����������
      //��ü�� ��������
      this.ano = ano;
      this.owner = owner;
      this.balance = balance;
      //������ ��ü�� �ܺο��� ���� �Ű������� �����Ų��
   }
   
   //�ʵ忡 ����ִ� ���� �������ų� �ʵ忡 ���� �����ϴ� �޼������
   public String getAno() { return ano; } //����ȣ�������� ��
   public void setAno(String ano) { this.ano = ano; }
   //����ȣ����
   public String getOwner() { return owner; } //�������� ������ ������
   public void setOwner(String owner) { this.owner = owner; } 
   //������ ��������
   public int getBalance() { return balance; } //�ܾ������� ������
   public void setBalance(int balance) { this.balance = balance; }
   //�ܾ���������
   //���Ϳ� ���͸޼��带 �����ؼ�  ���� �߰��ϰų� ���� �����ͼ� ����ϴ� �뵵�� ����Ѵ�
}
*/