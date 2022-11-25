package com.encapsulation;

public class B {
	public static void main(String[] args) {
		A a1 = new A();
		a1.setId(12);
		a1.setName("Rocky");
		a1.setCity("Bangalore");
		a1.setFirstInstallment(25000);
		
		
		System.out.println(a1.getId());
		System.out.println(a1.getName());
		System.out.println(a1.getCity());
		System.out.println(a1.getFirstInstallment());
	}

}
