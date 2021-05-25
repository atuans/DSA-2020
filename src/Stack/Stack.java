package Stack;

class StackX{
	private int maxSize;        // size of stack array
	private long[] stackArray;
	private int top;            // top of stack
	//--------------------------------------------------------------
	
	public StackX(int s){
		maxSize = s;             // set array size
		stackArray = new long[maxSize];  // create array
		top = -1;            // no items yet
	}//--------------------------------------------------------------
	
	public void push(long j)   {
		stackArray[++top] = j;     // increment top, insert it
	}
	
	//--------------------------------------------------------------
	public long pop() {// take item from top of stack
		return stackArray[top--];  // access item, decrement top
	}
	
	//--------------------------------------------------------------
	
	public long peek() {// peek at top of stack
		return stackArray[top];
	}
	
	//--------------------------------------------------------------
	
	public boolean isEmpty() { // true if stack is empty
		return (top == -1);
	}
	//--------------------------------------------------------------
	
	public boolean isFull() {// true if stack is full
		return (top == maxSize-1);
	}
	//--------------------------------------------------------------

}

public class Stack {
	public static void main(String[] args) {
		StackX theStack = new StackX(10);  // make new stack
		
		theStack.push(20);               // push items onto stack
		theStack.push(40);
		theStack.push(60);
		theStack.push(80);
		
		while( !theStack.isEmpty() )    // until it’s empty,
			{                             // delete item from stack
			long value = theStack.pop();
			System.out.print(value);      // display it
			System.out.print(" " );
			}  // end while
		System.out.println(" ");
			}
	}


/*
 * 
 
 		FUCTION TO GET MAX ELEMENT IN STACK USING C++
 		
 		
 		FUNCTION
 		
 		1- PUSH THE ELEMENT INTO STACK
 		2- DELETE ELEMENT PRESENT AT THE TOP OF THE STACK
 		3- PRINT THE MAXIMUM ELEMENT IN THE STACK
 		
 		
 		
 		vector<int> getMax(vector<string> operations) {
    stack<int> elementStk, maxStk;
    vector<int> result; 
    for(string operation:operations){
        if(operation[0] == '1'){
          int val=stoi(operation.substr(2,operation.length()-2));
            elementStk.push(val);
            if(maxStk.empty()){ maxStk.push(val); }
            else
                if(maxStk.top() <= val){ maxStk.push(val); }
        }else if(operation[0] == '2'){
            if(elementStk.top() == maxStk.top()){ maxStk.pop(); }
            elementStk.pop();
        }else if(operation[0] == '3')
            result.push_back(maxStk.top());
        else{ cout<<"Invalid Choice"<<endl; }
    }
    return result;
}
  
  
  
  
 */


