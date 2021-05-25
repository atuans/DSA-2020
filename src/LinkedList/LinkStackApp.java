//package LinkedList;
//class Link2{
//	public long dData;             // data item
//	public Link2 next;              // next link in list
//	
//	public Link2(long dd)           // constructor
//	{ dData = dd; }
//	
//	public void displayLink()      // display ourself
//	{
//		System.out.print(dData + " "); 
//	}
//}
//
//class LinkList3{
//	private Link2 first;            // ref to first item on list
//	// -------------------------------------------------------------
//	public LinkList3()              // constructor
//	{ first = null; }           // no items on list yet
//	// -------------------------------------------------------------
//	public boolean isEmpty()       // true if list is empty
//	{ return (first==null); }
//	// -------------------------------------------------------------
//	public void insertFirst(long dd) // insert at start of list
//	{                           // make new link
//		Link2 newLink = new Link2(dd);
//		newLink.next = first;       // newLink --> old first
//		first = newLink;            // first --> newLink
//		}
//		// -------------------------------------------------------------
//	public long deleteFirst()      // delete first item
//	{                           // (assumes list not empty)
//			Link2 temp = first;          // save reference to link
//			first = first.next;         // delete it: first-->old next
//			return temp.dData;          // return deleted link
//	}
//			// -------------------------------------------------------------
//	public void displayList(){
//		Link2 current = first;       // start at beginning of list
//		while(current != null)      // until end of list,
//		{
//			current.displayLink();   // print data
//			current = current.next;  // move to next link
//					
//			System.out.println("");
//		}
//	}
//		
//}
//
//class LinkStack{
//	private LinkList3 theList3;
//	
//	public LinkStack() {
//		theList3 = new LinkList3();
//	}
//	public void push(long j) {
//		theList3.insertFirst(j);
//	}
//	public long pop()            // take item from top of stack
//	{
//		return theList3.deleteFirst();
//	}
//	public boolean isEmpty()       // true if stack is empty
//	{
//		return ( theList3.isEmpty() );
//	}
//	public void displayStack(){
//		System.out.print("Stack (top-->bottom): ");
//		theList3.displayList();
//		}
//}
//
//
//public class LinkStackApp {
//	public static void main(String[] args) {
//		LinkStack theStack = new LinkStack(); // make stack
//		theStack.push(20);                    // push items
//		theStack.push(40);
//		theStack.displayStack();              // display stack
//		theStack.push(60);                    // push items
//		theStack.push(80);
//		theStack.displayStack();              // display stack
//		theStack.pop();                       // pop items
//		theStack.pop();
//		theStack.displayStack();              // display stack
//	}
//
//}
