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
      //������Ʈ�� ����Ŭ������. �׷��� ������Ʈ�� �ִ� toString�޼��尡 �� Ŭ�������� �������̵��Ǿ ����� �ǰ� ����
      Object obj1 = new Object(); //������ƮŬ������ �����ڷ� ��ü�� �����ϰ�  objectŬ����������Ÿ���� ����� obj1�� �Ҵ�
      Date obj2 = new Date();//����ƮŬ������ �����ڷ� ��ü�� �����ϰ�  dateŬ����������Ÿ���� ����� obj2�� �Ҵ�
      
      System.out.println(obj1.toString());//objectŬ������ ����Ʈ���޼��带 ȣ���ϰ�
      //java.lang.Object@7a81197d
      //Ŭ������@16�����ؽ��ڵ�
      System.out.println(obj2.toString()); //dateŬ������ ����Ʈ���޼��带 ȣ����
      //��¥�����Ϳ�����õǼ� ����Ʈ���޼���� ǥ���Ҽ��ִ� ���� ����� ���ֵ��� �������̵�����.
      //ue Jul 13 14:02:59 KST 2021 ��¥�� ���� �����Ͱ� ���ڿ��� ���·� ����� ��. 
      //���Ŭ�������� ������ �ƴ����� ���� ���� �޼��嵵 ������ �޶������ִ�. 
      
   }
}
*/