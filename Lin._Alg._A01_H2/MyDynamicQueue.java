/*
 *Name: Shane Bowen
 *ID: R00149085
 *Class: SD2-A
 */

public class MyDynamicQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private MyNode head;//The first item in the MyQueue
	private int numItems;

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------		
	public MyDynamicQueue(){

		this.head = null;//Initialize the head to null
		this.numItems = 0;//Initialize the num Items to 0

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){

		boolean ok = true;

		if(numItems == 0)
		{
			ok = true;
		}

		else if(numItems > 0)
		{
			ok = false;
		}

		return ok;

	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first(){

		int res = 0;//Initialize the result to 0

		if(numItems > 0)
		{
			MyNode current = this.head; //the current node is the head of the MyQueue

			res = current.getInfo();//Assign the result to the info of the desired node
		}

		else if(numItems == 0)//If num items = 0, then myQueue is empty
		{
			System.out.println("MyQueue is empty");
		}
		return res;

	}

	//-------------------------------------------------------------------
	// Basic Operation --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element){

		MyNode newNode = null; //Initialize the newNode to null
		MyNode currentNode = null;//Initialize the currentNode to null

		if(numItems == 0)//If num Items = 0, then we make the current node the head of the MyQueue
		{
			currentNode = head;//Current node is a reference to head node
			newNode = new MyNode(element, null);//Create the newNode

			this.head = newNode;//We make newNode be the first node of MyQueue
			newNode.setNext(currentNode);//We make the new node point to currentNode

			this.numItems = this.numItems + 1;//Increase the num of Items
		}

		else if(numItems > 0)//If num Items > 0, then we place the current node behind the head of the MyQueue
		{
			currentNode = head;
			MyNode previousNode = null;//Initialize previousNode to null
			int count = 0;//Initialize count to 0

			while (count < numItems)//We look for the place the node should be inserted
			{
				previousNode = currentNode;//We make previousNode point to currentNode
				currentNode = currentNode.getNext();//We make current point to it's next node

				count = count + 1;//We increase the count
			}

			newNode = new MyNode(element, null);//We create the  new node
			previousNode.setNext(newNode);//We make previousNode point to newNode

			newNode.setNext(currentNode);//We make newNode point to it's current node
			this.numItems = this.numItems + 1;//Increase the num of Items
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove(){

		if(numItems > 0 )
		{
			head = head.getNext();//Replace the head of MyQueue with next items in list
			this.numItems = this.numItems-1;//Reduce the num of Items
		}

		else if (numItems == 0)//If num Items is equal to 0, then it is empty
		{
			System.out.println("MyQueue is empty");
		}

	}
	
}