package Queue;

import java.io.IOException;

class PriorityQ{
	private int maxSize;
	private long[] queArray;
	private int nItems;
	
	
	public PriorityQ(int s)          // constructor
	{
		maxSize = s;
		queArray = new long[maxSize];
		nItems = 0;
	}
	
	
	public void insert(long item)    // insert item
	{
		int j;
		if(nItems==0)                         // if no items,
			queArray[nItems++] = item;         // insert at 0
		else                                // if items,
			{
			for(j=nItems-1; j>=0; j--)         // start at end,
				{
				if( item > queArray[j] )      // if new item larger,
					queArray[j+1] = queArray[j]; // shift upward
				else                          // if smaller,
					break;                     // done shifting
				}
			queArray[j+1] = item;            // insert it
			nItems++;
			}
	}
	public long remove()             // remove minimum item
	{ 
		return queArray[--nItems]; 
		
	}
	
	public long peekMin()            // peek at minimum item
	{ 
		return queArray[nItems-1]; 
		
	}
	public boolean isEmpty()         // true if queue is empty
	{ 
		return (nItems==0);
	
	}
	//-------------------------------------------------------------
	public boolean isFull()          // true if queue is full
	{ 
		return (nItems == maxSize); 
		
	}
}


public class PriorityQueueApp {
	public static void main(String[] args) throws IOException {
		PriorityQ thePQ = new PriorityQ(5);
		thePQ.insert(30);
		thePQ.insert(50);
		thePQ.insert(10);
		thePQ.insert(40);
		thePQ.insert(20);
		
		
		while( !thePQ.isEmpty() ){
			long item = thePQ.remove();
			System.out.print(item + " ");  // 10, 20, 30, 40, 50}  // end while
			System.out.println("");
		}
	}

}
