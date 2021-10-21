package test;

import java.util.Scanner;

public class BankApplication {
   private static Account[] accountArray = new Account[100];
   private static Scanner scanner = new Scanner(System.in);
   
   public static void main(String[] args) {
      boolean run = true;      
      while(run) {
         System.out.println("----------------------------------------------------------");
         System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
         System.out.println("----------------------------------------------------------");
         System.out.print("����> ");
         
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
      System.out.println("���α׷� ����");
   }
   
   //���»����ϱ�
   private static void createAccount() {
      System.out.println("--------------");
      System.out.println("���»���");
      System.out.println("--------------");
      
      System.out.print("���¹�ȣ: "); 
      String ano = scanner.next();
      
      System.out.print("������: "); 
      String owner = scanner.next();
      
      System.out.print("�ʱ��Աݾ�: ");
      int balance = scanner.nextInt();
      
      Account newAccount = new Account(ano, owner, balance);
      for(int i=0; i<accountArray.length; i++) {
         if(accountArray[i] == null) {
            accountArray[i] = newAccount;
            System.out.println("���: ���°� �����Ǿ����ϴ�.");
            break;
         }
      }
   }
   
   //���¸�Ϻ���
   private static void accountList() {
      System.out.println("--------------");
      System.out.println("���¸��");
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
   
   //�����ϱ�
   private static void deposit() {
      System.out.println("--------------");
      System.out.println("����");
      System.out.println("--------------");
      System.out.print("���¹�ȣ: "); 
      String ano = scanner.next();
      System.out.print("���ݾ�: ");
      int money = scanner.nextInt();
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("���: ���°� �����ϴ�.");
         return;
      }
      account.setBalance(account.getBalance() + money);
      System.out.println("���: ������ �����Ǿ����ϴ�.");
   }
   
   //����ϱ�
   private static void withdraw() {
      System.out.println("--------------");
      System.out.println("���");
      System.out.println("--------------");
      System.out.print("���¹�ȣ: "); 
      String ano = scanner.next();
      System.out.print("��ݾ�: ");
      int money = scanner.nextInt();
      Account account = findAccount(ano);
      if(account == null) {
         System.out.println("���: ���°� �����ϴ�.");
         return;
      }
      account.setBalance(account.getBalance() - money);
      System.out.println("���: ����� �����Ǿ����ϴ�.");
   }   
   
   //Account �迭���� ano�� ������ Account ��ü ã��
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

import java.util.Scanner; //�ܺο��� ���� �Է¹��� ���ֵ��� ���ִ� Ŭ����

public class BankApplication {
   private static Account[] accountArray = new Account[100];//100���� �迭����� ����� accountArray�迭��ü������ �����ϰ� ������� �迭��ü�� �����Ѵ�
   //�ܺο��� ������ �ȵǰ� ������, ���������� ����
   private static Scanner scanner = new Scanner(System.in);
   //Ű���带 ���ؼ� ���ڵ����͸� ������ ��, system.in �̰��� �Ű������� �ؼ� ��ĳ��Ŭ���������ڰ� ��ü�� �����ؼ� scanner��ü������ �Ҵ��Ѵ�
   //scanner�� �ܺο��� ���� �����͸� �ڵ鸵�Ҽ� �ִ� ��ü������ �ȴ� 
   //�����Լ��������� �迭�� ��ü������ �����Ѵ�
   public static void main(String[] args) {
      boolean run = true;      //run������ ������ �� ������ ������
      
      while(run) {
         //while���� run�������� �Ű������� Ȱ����
         //true�� run�� �ִ� ���� ��� �ݺ���
         System.out.println("----------------------------------------------------------");
         System.out.println("1.���»��� | 2.���¸�� | 3.���� | 4.��� | 5.����");
         System.out.println("----------------------------------------------------------");
         System.out.print("����> ");
         //ȭ�鿡 �������̽� �޴��� ���ڷ� �� ������ش�
         
         
         int selectNo = scanner.nextInt(); //���������� ������ scanner��ü�� ���ؼ� ���� ���޵ȴ� 
         //selectNo��������ü������ ������ �ȴ�
         
         if(selectNo == 1) {
            //���࿡ selectNo��ü������ ����ִ� ���� 1�� ���ٸ� 
            createAccount();
            //�ٷ� �ؿ� �ִ� createAccount�޼��带 �����
         } else if(selectNo == 2) {
            accountList();
            //2���̶�� accountList�޼��带 �۵��Ѵ�
         } else if(selectNo == 3) {
            deposit();
            //3���̸� deposit�޼��带 �۵��Ѵ�
         } else if(selectNo == 4) {
            withdraw();
            //4���̸� withdraw�޼��带 �۵��Ѵ�
         } else if(selectNo == 5) {
            run = false;
            //5���̸� run������ false�� �־��ش�
            //run������ while����ɶ����� ���ϴµ�, false���� ���ϱ� .while���� �����Ѵ�
            //����if������ �������� ���õ� �޼��带 ȣ���Ѵ� 
         }
      }
      System.out.println("���α׷� ����"); //5���� ������ �Ǹ� ���α׷����ᰡ �Ǵ� ����.
   }
   
   //���»����ϱ�
   private static void createAccount() { //���»����޼���
      System.out.println("--------------");
      System.out.println("���»���");
      System.out.println("--------------");
      
      System.out.print("���¹�ȣ: "); 
      String ano = scanner.next(); //scannerŬ������ ���ؼ� �ؽ�Ʈ�޼���� �����͸� �Է¹ް� 
      //string���ڿ�Ŭ���� ������Ÿ���� ������ ano��ü������ �Էµ� ���� �Ҵ��Ѵ�
      
      System.out.print("������: "); 
      String owner = scanner.next(); //�ؽ�Ʈ�޼���� ���ڿ��� �Է¹ް� 
      //owner��ü������ �Ҵ��Ѵ� 
      
      System.out.print("�ʱ��Աݾ�: ");
      int balance = scanner.nextInt(); //���������͸� �Է¹޾Ƽ� �ؽ�Ʈ��Ƽ���޼����. 
      //balance��ü������ ���� �Ҵ��Ѵ�
      
      //�ܺο��� ���� ���� 3���� ������ Ȱ���ؼ�
      Account newAccount = new Account(ano, owner, balance);
      // newŰ����� AccountŬ������ �����ڿ� 3���� �������� �Ű������� �ְ� ������ �Ŀ� ������ ��ü�� 
      //AccountŬ����������Ÿ���� ������ newAccount��ü������ �Ҵ��Ѵ�
      for(int i=0; i<accountArray.length; i++) {
         //i�� accountArray�� ���̺��� ������������ �ݺ��� ��
         if(accountArray[i] == null) {
            //���࿡ accountArray�� i�ε����� null�� ����ִ� ���� ���ٸ� 
            accountArray[i] = newAccount;
            //newAccount��ü�������� accountArray i�ε����� �Ҵ��Ѵ� 
            System.out.println("���: ���°� �����Ǿ����ϴ�.");
            break;
         }
      }
   }
   
   //���¸�Ϻ���
   private static void accountList() {
      System.out.println("--------------");
      System.out.println("���¸��");
      System.out.println("--------------");
      for(int i=0; i<accountArray.length; i++) {
         //i�� 0 i�� accountArray�� ���̺��� ���������� �ݺ��� ��
         Account account = accountArray[i];
         //accountArray�� i�ε������� account��ü������ �Ҵ��Ѵ�
         if(account != null) { //account��ü������ null �迭�� ���� ����ִٸ� �Ʒ��� ��¹��� �����Ѵ�
            System.out.print(account.getAno()); //account��ü�������� getAno�޼��带 �����Ѵ� 
            System.out.print("     "); //���� �־ ���� ���� ���ְ�
            System.out.print(account.getOwner()); //account��ü�������� getOwner�޼���� �������� ������ ����Ѵ�
            System.out.print("     ");//�ǳ���
            System.out.print(account.getBalance());//account��ü�������� getBalance�޼���� �ܾ������� ����Ѵ�
            System.out.println();
         }
      }
   }
   
   //�����ϱ�
   private static void deposit() {
      System.out.println("--------------");
      System.out.println("����");
      System.out.println("--------------");
      System.out.print("���¹�ȣ: "); 
      String ano = scanner.next(); //scannerŬ������ next�޼���� ���ڿ��� �Է¹ް� ano�� ����ȴ�
      System.out.print("���ݾ�: ");
      int money = scanner.nextInt();//scannerŬ������ nextint�޼���� ���ڰ��� �Է¹ް� �װ��� money��ü������ �Ҵ��Ѵ� 
      Account account = findAccount(ano); //findAccount�޼��忡 ano��ü������ ���� �Ű������� �ִ´�
      //account��ü������ findAccount�޼����� ������� �Ҵ��Ѵ�
      if(account == null) { //���࿡ account��ü������ null����ִ� ���� ���ٸ�
         System.out.println("���: ���°� �����ϴ�.");
         //���������� ����
         return;
      }
      account.setBalance(account.getBalance() + money);
      //account��ü�������� setBalance ���͸޼�����. �ܾ��� ������
      //account��ü�������� getBalance ������ �ܾװ� money���� �� �ִ� ���� ���ϰ� �� ����� �ܾ׼����޼��忡 �Ű������� �ִ´�
      System.out.println("���: ������ �����Ǿ����ϴ�.");
   }
   
   //����ϱ�
   private static void withdraw() {
      System.out.println("--------------");
      System.out.println("���");
      System.out.println("--------------");
      System.out.print("���¹�ȣ: "); 
      String ano = scanner.next(); //��ĳ��Ŭ������ ���ڿ��� �Է¹޴´� �׸��� �װ���� ano��ü������ �����Ѵ�
      System.out.print("��ݾ�: "); 
      int money = scanner.nextInt(); //��ĳ��Ŭ������ �������� �Է¹޴´� �װ��� money������ �����Ѵ�
      Account account = findAccount(ano); //���������� ã�ƾ� ������ �ø��� ���̵� �Ұ��̱⿡
      //findAccount�޼��忡 ano���¹�ȣ�� �Ű������� ����
      if(account == null) {
         //���࿡ account��ü������ null���� ���ٸ� 
         System.out.println("���: ���°� �����ϴ�.");
         //���������� ����
         return;
      }
      account.setBalance(account.getBalance() - money);
      //setBalance�޼���� account��ü������ getBalance �ܾ��� �ҷ��ͼ� money������ ���� ������Ų��
      System.out.println("���: ����� �����Ǿ����ϴ�.");
   }   
   
   //Account �迭���� ano�� ������ Account ��ü ã��
   private static Account findAccount(String ano) {
      //AcccountŬ������ �ڷ����� ������ account��ü�������� null������ �ʱ�ȭ�� �Ѵ� 
      Account account = null;
      
      for(int i=0; i<accountArray.length; i++) {
         //i�� 0 i�� accountArray�� ���̺��� ���� �������� �ݺ��� �Ѵ�
         if(accountArray[i] != null) {
            //���࿡ accountArray�� i�ε����ϰ� null���� �ٸ��ٸ� �ش�迭�� i�ε����� �����Ͱ��� ����ִٸ� ���๮�� �۵���Ű��� ����
            String dbAno = accountArray[i].getAno();
            //���ڿ�Ŭ������ ������Ÿ���� ������ dbAno��ü������ accountArray�迭�� i�ε������� getAno �޼���� ���¹�ȣ�� �Ҵ��Ѵ�
            if(dbAno.equals(ano)) { //���࿡ dbAno��ü������ ano��ü������ ���� ���ٸ� 
               //equas�޼���� ���� ���� ������ �ľ���
               account = accountArray[i]; //accountArray i�ε������� account��ü������ �Ҵ��Ѵ�
               //�׸��� �ݺ��� ����
               break;
            }
         }
      }
      return account;
   }
}
*/














