package Stacks;

public class Stacksusingarrays_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stacks_using_arrays stack = new Stacks_using_arrays(5);
		for (int i = 1; i <= 5; i++) {
			stack.push(i * 2);
			stack.display();
		}

		stack.pop();
		stack.display();
		System.out.println(stack.top());
		stack.pop();
		System.out.println(stack.size());

	}

}
