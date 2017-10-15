public class LinkedList{
	public static void main(String args[]){
		LL list1 = new LL();

		list1.insert(1);
		list1.insert(2);
		list1.insert(3);
		list1.insert(4);
		list1.insert(5);
		list1.insert(6);

		list1.insert_end(10);
		list1.insert_end(12);

		//System.out.println(list1.search(100));
		System.out.println(list1.length());
		list1.printList();

		list1.delete_front();
		list1.printList();

		list1.delete_end();
		list1.printList();

	}
}

class node{
	int data;
	node next;
}

class LL{
	private node front = new node();

	public LL(){
		front = null;
	}

	public boolean empty(){
		return (front == null);
	}

	public void insert(int x){
		node temp = new node();
		temp.data = x;
		temp.next = front;
		front = temp;
	}

	public void printList(){
		node i = new node();
		i = front;
		
		while(i != null){
			System.out.print(i.data+"-->");
			i = i.next;
		} 
		System.out.print("\n"); 
	}

	public void insert_end(int x){
		node temp = new node();
		temp.data = x;
		temp.next = null;

		node i = new node();
		i = front;
		
		while(i.next != null){
			i = i.next;
		}

		i.next = temp;

	}

	public int search(int x){
		if(!empty()){
			node i = new node();
			i = front;
		
			int position = 1;

			while((i != null) && (i.data != x)){
				i = i.next;
				position ++;
			}

			if(i == null){
				return -1;
			}

			else{
				return position;
			}
		}
		else{
			return -1;
		}
	}

	public int length(){
		if(empty()){
			return -1;
		}
		else{
			node i = new node();
			i = front;
			int count = 1;

			while(i != null){
				i = i.next;
				count++;
			}

			return count-1;
		}
	}

	public void delete_front(){
		if(empty()){
			System.out.println("Nothing there to delete");
		}

		else{
			front = front.next;
		}		

	}

	public void delete_end(){
		if(empty()){
			System.out.println("Nothing there to delete");
		}

		else{
			node i = new node();
			node prev = new node();
			prev = null;
			i = front;

			while(i.next != null){
				prev = i;
				i = i.next;
			}

			if(prev == null){
				front = null;
			}

			else{
				prev.next = null;
			}
		}

	}

	/*public void delete(int x){

	}*/
}	