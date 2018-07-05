/*
 * Name: Shane Bowen
 * ID: R00149085
 * Class: SD2-A
 */

public class MyStaticQueue implements MyQueue {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------

	private int maxItems; //The max number of items a MyQueue can contain
	private int[] items; //It store the items of MyQueue
	private int numItems; //The number of items of MyQueue

	//-------------------------------------------------------------------
	// Basic Operation --> Check if myQueue is empty: myCreateEmpty
	//-------------------------------------------------------------------	
	public MyStaticQueue(int m) //Creates 1 object of the class MyStaticQueue
	{
		this.maxItems = m; //m represents the max number of items
		this.items = new int[this.maxItems]; //Sets the length of the array to max
		this.numItems = 0; //Set number of items to 0
	}

	//-------------------------------------------------------------------
	// Basic Operation --> Check if MyQueue is empty: isEmpty
	//-------------------------------------------------------------------	
	public boolean isEmpty(){//Check if MyQueue is empty

		boolean ok = true;

		if(numItems == 0)
		{
			ok = true;//If numItems is = 0, then array is empty
		}

		else if(numItems > 0)
		{
			ok = false;//If numItems is > 0, then array is not empty
		}

		return ok;
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Get first element from front of MyQueue: first
	//-------------------------------------------------------------------
	public int first()//Get the first element of array
	{
		int first = 0;
		
		if(items.length > 0)
		{
			first = items[0];
		}
		
		else if (numItems == 0)//If num items = 0, then myQueue is empty
		{
			System.out.println("MyQueue is empty");
		}
		
		return first;
	}	
	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Add element to back of MyQueue: add 
	//-------------------------------------------------------------------
	public void add(int element)//Add new element to array
	{
		if(numItems < maxItems)//If num Items < max Items then it's ok to add element
		{
			items[numItems] = element;//Set position in items to place element
			numItems++;//Increase num of Items
		}

		else if(numItems == maxItems)//If num Items = max Items then it's not ok to add element
		{
			System.out.println("Queue is Full!");	
		}
	}

	//-------------------------------------------------------------------
	// Basic Operation (Partial) --> Remove element from front of MyQueue: remove 
	//-------------------------------------------------------------------	
	public void remove()//Remove a element from array
	{
		for(int i = 0; i < numItems; i++)
		{
			this.items[i] = this.items[i+1];//Replace the current element with the next element in the array 
			this.numItems = this.numItems -1;//Reduce the number of items

			if(numItems == 0)//If num items = 0 then array is empty
			{
				System.out.println("MyQueue is empty");
			}	
		}
	}

}