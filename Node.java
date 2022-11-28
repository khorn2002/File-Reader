package hw5;

public class Node {
	
	Node next;
	Node last;
	double value;
	
	public Node(double value) {
		this.value = value;
		next = null;
		last = null;
	}
	
	public double getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}