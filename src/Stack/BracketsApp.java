package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StackZ{
	private int maxSize;        // size of stack array
	private long[] stackArray;
	private int top;            // top of stack
	//--------------------------------------------------------------
	
	public StackZ(int s){
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
class BracketChecker{
	private String input;                   // input string
	//--------------------------------------------------------------
	public BracketChecker(String in) {// constructor
		
		input = in; 
	}
	//--------------------------------------------------------------
	public void check() {
		int stackSize = input.length();      // get max stack size
		StackZ  theStack = new StackZ( stackSize);  // make stack
		
		for(int j=0; j<input.length(); j++) {  // get chars in turn{
			char ch = input.charAt(j);        // get char
			
			switch(ch) {
			
			
			case '{':                      // opening symbols
			case '[':
			case '(':
				theStack.push(ch);          // push them
				break;
				
			case '}':                      // closing symbols
			case ']':
			case ')':
				
				if( !theStack.isEmpty() ) {   // if stack not empty
					char chx = (char) theStack.pop();  // pop and check
					if( (ch=='{' && chx!='}') ||
						(ch=='[' && chx!=']') ||
						(ch=='(' && chx!=')') ) 
						System.out.println("Error: "+ch+" at "+j);
				}
					else                        // prematurely empty
						System.out.println("Error: "+ch+" at "+j);
					break;
				default:    // no action on other characters
						break;
				} // end switch
			} // end for
			// at this point, all characters have been processed
			if( !theStack.isEmpty() )
				System.out.println("Error: missing right delimiter");
				
			}  // end check()
	}

public class BracketsApp {
	public static void main(String[] args) throws IOException {
		String input;
		while(true) {
			System.out.println("Enter string containing delimiters");
			System.out.flush();
			input = getString();
			     // read a string from kbd
			if( input.equals("") )   // quit if [Enter]
				break;
			BracketChecker theChecker = new BracketChecker(input);
			theChecker.check();      // check brackets
		}
	
	}
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
