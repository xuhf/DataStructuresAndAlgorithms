package com.vvkee.pattern.prototype;

public class DeepCloneMain {

	public static void main(String[] args) throws Exception {
		Teacher t = new Teacher("张三", 12);
		Master m1 = new Master("徒弟1", "1", t);
		Master m2 = (Master) m1.deepClone();
		System.out.println(m1 == m2);
		System.out.println(m1.getTeacher() == m2.getTeacher());

		m1.getTeacher().setName("李四");
		System.out.println(m1);
		System.out.println(m2);
	}
}
