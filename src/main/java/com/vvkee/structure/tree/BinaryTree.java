package com.vvkee.structure.tree;

/**
 * 二叉树
 * 
 * 二叉树的遍历（）是指从根结点出发，按照某种次序依次访问二叉树中所有节点，使得每个节点被访问一次且仅被访问一次。
 * 
 * @author xuhaifei
 *
 */
public class BinaryTree {

	public static class Node {
		Object data;
		Node left;
		Node right;

		@Override
		public String toString() {
			return "Node [data=" + data + "]";
		}
	}

	/**
	 * 前序遍历 <br/>
	 * 
	 * 规则是若二叉树为空，则空操作返回，否则先访问根结点，然后前序遍历左子树， 再前序遍历右子树
	 * 
	 * @param node
	 */
	public void pre(Node node) {
		if (node == null) {
			return;
		}
		System.out.println("node is " + node);
		pre(node.left);
		pre(node.right);
	}

	/**
	 * 中序遍历 <br/>
	 * 规则是若树为空，则空操作返回，否则从根结点开始(注意并不是先访问根结点) ，<br/>
	 * 中序遍历根结点的左子树，然后是访问根结点，最后中序遍历右子树
	 * 
	 * @param node
	 */
	public void middle(Node node) {
		if (node == null) {
			return;
		}
		middle(node.left);
		System.out.println("node is " + node.data);
		middle(node.right);
	}

	/**
	 * 后序遍历 <br/>
	 * 规则是若树为空，则空操作返回，<br/>
	 * 否则从左到右先叶子后结点的方式遍历访问左右子树，最后是访问根结点 <br/>
	 * GHDBIEFCA
	 * 
	 * @param node
	 */
	public void hou(Node node) {
		if (node == null) {
			return;
		}
		hou(node.left);
		hou(node.right);
		System.out.println("node is " + node.data);
	}

	public static void main(String[] args) {
		BinaryTree b = new BinaryTree();
		Node root = b.init();
		b.pre(root);
		System.out.println("==============");
		b.middle(root);
		System.out.println("==============");
		b.hou(root);
	}

	private Node init() {
		Node a = new Node();
		a.data = "a";

		Node b = new Node();
		b.data = "b";

		Node c = new Node();
		c.data = "c";

		Node d = new Node();
		d.data = "d";

		Node e = new Node();
		e.data = "e";

		Node f = new Node();
		f.data = "f";

		Node g = new Node();
		g.data = "g";

		Node h = new Node();
		h.data = "h";

		Node i = new Node();
		i.data = "i";

		a.left = b;
		a.right = c;

		b.left = d;

		d.left = g;
		d.right = h;

		c.left = e;
		c.right = f;

		e.right = i;
		return a;
	}
}
