package Stacks;

public class Stacks_using_arrays {
	private int[] data;
	private int tos;

	public Stacks_using_arrays(int capacity) {
		this.data = new int[capacity];
		this.tos = -1;
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		} else
			return false;
	}

	public void display() {
		for (int i = tos; i >= 0; i--) {
			System.out.println(this.data[i]);
		}
		System.out.println("*******************");
	}

	public void push(int item) throws Exception {
		if (this.size() == this.data.length) {
			throw new Exception("Stack is full");
		}
		this.tos++;
		this.data[this.tos] = item;
	}

	public int pop() throws Exception {
		if (this.size() == 0) {
			throw new Exception("Stack is empty");
		}
		int rv = this.data[this.tos];
		this.data[this.tos] = 0;
		this.tos--;

		return rv;
	}

	public int top() {
		int rv = this.data[this.tos];
		return rv;

	}

}
