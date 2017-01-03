package com.vvkee.pattern.prototype;

public class MainClone {

	public static void main(String[] args) throws Exception {
		Class clazz = new Class("九年级一班", 30);
		Student s1 = new Student("TEST", 29, clazz);
		Student s2 = (Student) s1.clone();
		System.out.println(s1 == s2);
		s2.getClazz().setName("计算机一班");
		System.out.println(s1.getClazz() == s2.getClazz());
		System.out.println(s1);
		System.out.println(s2);
	}
}
