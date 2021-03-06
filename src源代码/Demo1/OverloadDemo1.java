package com.hs_vae.Demo1;
//Date:2020.9.28
//Content:方法重载，功能类似的方法，因为参数列表不一样要记住很多方法名称属实麻烦，这时候方法重载技术起到了很好的作用
//Note:多个方法名一样，参数列表不一样
public class OverloadDemo1 {
	public static void main(String[] args) {
	  sum(1,2);  
	  sum(1.3,2.2);
	  sum(1,2.2);
	  sum(2.2,1);
	  sum(1,2,3);
	}
	
	public static int sum(int b,int a) {
	  System.out.println("两个值之和为:"+(a+b));
		return a+b;
	}
 

    public static int sum(double a,int b) {
  	  System.out.println("两个值之和为:"+(a+b));
    	return (int)(a+b);
    }
    
    public static int sum(int a,double b) {
  	  System.out.println("两个值之和为:"+(a+b));
    	return (int)(a+b);  //因为返回值类型为整型所以必须强转int类型
    }
    
    public static double sum(double a ,double b) {
  	  System.out.println("两个值之和为:"+(a+b));
    	return a+b;       
    }
	
	
	public static int sum(int a,int b,int c) {
	 System.out.println("三个值之和为:"+(a+b+c));
		return a+b+c;
	}

	
	
	
	
	
	
	
	
	
}
