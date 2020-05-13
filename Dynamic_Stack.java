package stacks;

public class Dynamic_Stack extends Stacks_using_arrays {
	public Dynamic_Stack(int capacity) {
		super(capacity);
		}
	
	public void push(int item) throws Exception{
		if(this.size()==this.data.length) {
			int [] arr= new int[2*data.length]; 
			for(int i=0; i<this.data.length; i++) {
				arr[i]=this.data[i];
			}
			this.data=arr;
		}
		super.push(item);
	}

}
