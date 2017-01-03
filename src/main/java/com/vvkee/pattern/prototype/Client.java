package com.vvkee.pattern.prototype;

class Client implements Cloneable {

	public Client clone() {
		Client prototype = null;
		try {
			prototype = (Client) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}

}

class ConcretePrototype extends Client {

	public void draw() {
		System.out.println(" prototype pattern ");
	}
}
