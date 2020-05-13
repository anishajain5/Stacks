package stacks;

public class Dynamic_stack_client {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Stacks_using_arrays stack= new Dynamic_Stack(5);
		stack.push(34);
		stack.display();
		for(int i=1; i<6;i++) {
			stack.push(i*7);
		}
		stack.display();
		

	}

}
