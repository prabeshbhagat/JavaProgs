package com.ojm18.Threads;

public class TestSynchronizedBlock1 {

	public static void main(String[] args) {
		
		Table obj = new Table();//only one object  
		MyThread12 t1=new MyThread12(obj);  
		MyThread22 t2=new MyThread22(obj);  
		t1.start();  
		t2.start(); 
	}

}

class Table{  
	  
	 void printTable(int n){  
	   synchronized(this){//synchronized block  
	     for(int i=1;i<=5;i++){  
	      System.out.println(n*i);  
	      try{  
	       Thread.sleep(400);  
	      }catch(Exception e){System.out.println(e);}  
	     }  
	   }  
	 }//end of the method  
	}  
	  
	class MyThread12 extends Thread{  
	Table t;  
	MyThread12(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(5);  
	}  
	  
	}  
	class MyThread22 extends Thread{  
	Table t;  
	MyThread22(Table t){  
	this.t=t;  
	}  
	public void run(){  
	t.printTable(100);  
	}  
	}  
	 