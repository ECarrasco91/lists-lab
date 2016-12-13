package ListLab;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T>{

	private Node<T> head;
	private int size = 0;

	public int getSize() {
		return size;
	}

	public boolean remove(int index) {
		if (index > size) {
			return false;
		} else {
			Node<T> headNode = head;
			Node<T> nextNode;
			for (int i = 0; i < index; i++) {
				headNode = headNode.getNext();
			}
			nextNode = headNode.getNext();
			headNode.setNext(nextNode);
			size--;
			return true;
		}
	}

	public T get(int index) {
		if (index > size) {
			return null;
		} else {
			Node<T> headNode = head;
			for (int i = 0; i < index; i++) {
				headNode = headNode.getNext();
			}
			return (T) headNode.getData();
		}
	}

	public void add(T obj) {
		if (head == null) {
			head = new Node<T>(obj);
		} else {
			Node<T> headNode = head;
			Node<T> nextNode = headNode.getNext();
			while (nextNode != null) {
				headNode = headNode.getNext();
				nextNode = headNode.getNext();
			}
			headNode.setNext(new Node<>(obj));
			size++;
		}
	}

	//The methods below are bonus

	public void add(int index, T obj){
		//to-do
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(head);
	}

	private class MyIterator<T> implements Iterator<T> {

		private Node<T> node;

		public MyIterator(Node<T> node) {
			//to-do
		}
		@Override
		public boolean hasNext() {
			//to-do
		}

		@Override
		public T next() {
			//to-do
		}

		@Override
		public void remove() {
			// to-do

		}

	}
}
