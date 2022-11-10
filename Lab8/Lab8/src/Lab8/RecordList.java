package Lab8;

public class RecordList {
	private class Node {
		Record data;
		Node next;
		public Node(Record dataValue) {
			next = null;
			data = dataValue;
		}
	}
	private Node head;
	public RecordList() {
		head = new Node(null);
	}
	public int indexOf(String name) {
		Node currentNode = head;
		int index = 0;
		while (currentNode.next != null && !currentNode.next.data.getName().equals(name)) {
			currentNode = currentNode.next;
			index++;
		}
		if (currentNode.next == null) return -1;
		else return index;
	}
	public int add(Record data) {
		return 0;
	}
	public void print() {
		Node currentNode = head.next;
		while (currentNode != null) {
			System.out.println(currentNode.data.getName() + ", " + currentNode.data.getTime());
			currentNode = currentNode.next;
		}
		System.out.println();
	}
	public void writeToFile(String filename) {	
	}
}
