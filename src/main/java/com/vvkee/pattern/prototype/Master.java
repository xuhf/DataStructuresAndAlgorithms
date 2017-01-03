package com.vvkee.pattern.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Master implements Serializable {

	private static final long serialVersionUID = 8617218698470939137L;

	private String name;

	private String no;

	private Teacher teacher;

	public Master() {
		super();
	}

	public Master(String name, String no, Teacher teacher) {
		super();
		this.name = name;
		this.no = no;
		this.teacher = teacher;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	@Override
	public String toString() {
		return "Master [name=" + name + ", no=" + no + ", teacher=" + teacher + "]";
	}

	public Object deepClone() throws Exception {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ObjectOutputStream objectOut = new ObjectOutputStream(out);
		objectOut.writeObject(this);
		ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
		ObjectInputStream objectIn = new ObjectInputStream(in);
		return objectIn.readObject();
	}

}
