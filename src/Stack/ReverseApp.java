package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackY{
	private int maxSize;        // size of stack array
	private long[] stackArray;
	private int top;            // top of stack
	//--------------------------------------------------------------
	
	public StackY(int s){
		maxSize = s;             // set array size
		stackArray = new long[maxSize];  // create array
		top = -1;            
	// no items yet
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

class Reverse {
	
	private String input;                // input string
	private String output;               // output string
	
	public Reverse(String in) {
		input = in;
	}
	public String doRev() { // reverse the string
		
		int stackSize = input.length();   // get max stack size
		StackY theStack = new StackY(stackSize);  // make stack
		
		for(int j=0; j<input.length(); j++){
			char ch = input.charAt(j);     // get a char from input
			theStack.push(ch);             // push it
			}
		output = "";
		while( !theStack.isEmpty() ){
			char ch = (char) theStack.pop();      // pop a char,
			output = output + ch;          // append to output
			}
		return output;
			
	}  // end doRev()
		
}

public class ReverseApp{
	public static void main(String[] args) throws IOException {
		String input,output;
		while(true) {
			System.out.print("Enter a string: ");
			System.out.flush();
			input = getString();          // read a string from kbd
			if( input.equals("") ) {// quit if [Enter]
				break;
			}
			Reverse theReverser = new Reverse(input);
			output = theReverser.doRev(); // use it
			System.out.println("Reversed: " + output);
		}
		
	}
	public static String getString() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
		}
}

