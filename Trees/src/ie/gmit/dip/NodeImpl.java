package ie.gmit.dip;

import java.util.*;

public class NodeImpl<T> implements Node<T> {
	//composing
	private Node<T> parent;
	private List<Node<T>> children = new ArrayList<Node<T>>();// nodes of type T
	private T data;

//==================================
	// now parent is required to make a new node
	public NodeImpl(Node<T> parent, T data) {
		super();
		this.parent = parent;
		this.data = data;
	}

//==================================
	@Override
	public T getData() {
		return this.data;
	}

	@Override
	public void setData(T data) {
		this.data = data;
	}

	@Override
	public boolean isRoot() {
		return this.parent == null;// if == null then it is the root
	}

	@Override
	public boolean isLeaf() {
		return children.isEmpty();// if true is a leaf
	}

	@Override
	public Node<T> getParent() {
		return this.parent;
	}

	@Override
	public List<Node<T>> children() {
		return this.children();// people from the outside can view
	}

	@Override
	public void addChild(Node<T> child) {
		children.add(child);
	}

	@Override
	public void removeChild(Node<T> child) {
		children.remove(child);
	}

	@Override
	public boolean hasChild(Node<T> child) {
		return children.contains(child);
	}

	@Override
	public boolean hasSibling() {
		if (!isRoot()) {
			return siblings().size() > 0;// child of parent is one, if more than one then you have a sibling
		}

		return false;
	}

	@Override
	public List<Node<T>> siblings() {
		List<Node<T>> siblings = parent.children();
		siblings.remove(this);

		return siblings;
	}

}
