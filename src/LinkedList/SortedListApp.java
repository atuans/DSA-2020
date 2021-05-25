package LinkedList;

class Link4{
	public Link4 next;                   // next link in list	
	public long dData;               // next link in list
	
	public Link4( long dd) {// constructor{
		dData = dd;                 // (‘next’ is automatically set to null)
	}
	
	public void displayLink() {// display ourself
		
		System.out.print(dData + " ");	
		}
	
}

class SortedList{
	private Link4 first;                 // ref to first item on list
	// -------------------------------------------------------------
	public SortedList()                 // constructor
	{ 
		first = null; 
	}
	// -------------------------------------------------------------
	public boolean isEmpty()            // true if no links
	{
		return (first==null); 
	}
	// -------------------------------------------------------------
	public void insert(long key)        // insert, in order
	{
		Link4 newLink = new Link4(key);    // make new link
		Link4 previous = null;            // start at first
		Link4 current = first;// until end of list,
		while(current != null && key > current.dData){                             // or key > current,
			previous = current;current = current.next;  
			
		}// go to next item
			if(previous==null)               // at beginning of list
				first = newLink;              // first --> newLink
			else                             // not at beginning
				previous.next = newLink;      // old prev --> newLink
				newLink.next = current;          // newLink --> old current
	}// end insert()
			// -------------------------------------------------------------
	public Link4 remove()           // return & delete first link
	{                           // (assumes non-empty list)
		Link4 temp = first;               // save first
		first = first.next;              // delete first
		return temp;                     // return value
	}			
	// -------------------------------------------------------------p
	public void displayList(){
		System.out.print("List (first-->last): ");
		Link4 current = first;       // start at beginning of list
		while(current != null)      // until end of list,
			{
			current.displayLink();   // print data
			current = current.next;  // move to next link
			System.out.println("");
			}
	}
			
		
}

public class SortedListApp {
	public static void main(String[] args) {
		SortedList theSortedList = new SortedList();
		
		theSortedList.insert(20);    // insert 2 items
		theSortedList.insert(40);
		theSortedList.displayList(); // display list
		theSortedList.insert(10);    // insert 3 more items
		theSortedList.insert(30);
		theSortedList.insert(50);
		theSortedList.displayList(); // display list
		theSortedList.remove();      // remove an item
		theSortedList.displayList(); // display list
	}

}
