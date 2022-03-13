package com.base;


public class newclass {
	static int x=0;
	public static void main(String[] args) {
		try {
			while (x>10) {
				System.out.println("iaminsidewhileloop");
				
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("whileloopdone");
		System.out.println("====================");
		do {
			System.out.println("iaminsidedowhileloop");
		} while(x>10);
		System.out.println("dowhileloopdone");
	}
	
	protected String dosomething2() {
		return "Java";
		
	}
	
	
	
}
