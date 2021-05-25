package Tree;


class Node{
	public int iData;              // data item (key)
	public double dData;           // data item
	public Node leftChild;         // this node’s left child
	public Node rightChild;        // this node’s right child
	public void displayNode()      // display ourself
	{
		System.out.print("{");
		System.out.print(iData);
		System.out.print(", ");
		System.out.print(dData);
		System.out.print("} ");
		}
}  
class Tree {
	private Node root;            // the only data field in Tree
	
	//////////////////////////////////////////////////////////////////////
	public Node find(int key){
		
		Node current = root;                // start at root
		while(current.iData != key) {// while no match,
			
			if(key < current.iData)          // go left?
				current = current.leftChild;
			else
				current = current.rightChild; // or go right?
			if(current == null)              // if no child,
				return null;                  // didn’t find it
			
		}
		return current;                     // found it
		
	}
	
	//////////////////////////////////////////////////////////////////////
	public void insert(int id, double dd){
		Node newNode = new Node();    // make new node
		newNode.iData = id;           // insert data
		newNode.dData = dd;
		if(root==null)                // no node in root
			root = newNode;
		else
		{
			Node current = root;       // start at root
			Node parent;
			while(true) {// (exits internally)
				
				parent = current;
				if(id < current.iData)  // go left?
				{
					current = current.leftChild;
					if(current == null) {// if end of the line,
						
						parent.leftChild = newNode;
						return;
					}
				}// end if go left
				else {					//or go right?
					current = current.rightChild;
					if(current == null) {// if end of the line
						
						parent.rightChild = newNode;
						return;
					}
							
					
				}// end else go right
			} // end while
		}// end else not root
		
	}// end insert()
	
	//////////////////////////////////////////////////////////////////////

//	public void delete(int id){
//		
//	}
	
	public boolean delete(int key) {// delete node with given key
		
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;
		
		while(current.iData != key) {// search for node
			
			parent = current;
			if(key < current.iData) {// go left?
				
				isLeftChild = true;
				current = current.leftChild;
				
			}
			else {
				isLeftChild = false;
				current = current.rightChild;
			}
			if(current == null) {// end of the line,
				return false;                // didn’t find it
			}
			
			// delete() continued...
			// if no children, simply delete it
			if(current.leftChild == null && current.rightChild == null) {
				if(current == root) {// if root,
					root = null;                 // tree is empty
				}
				else if(isLeftChild) {
					parent.leftChild = null;     // disconnect
				}
				else                            // from parent
					parent.rightChild = null;
			}
			// delete() continued...
			// if no right child, replace with left subtree
			else if(current.rightChild==null) {
				if(current == root) {
					root = current.leftChild;
				}
				else if(isLeftChild){  // left child of parent
					
					parent.leftChild = current.leftChild;
				}
				else {// right child of parent
					parent.rightChild = current.leftChild;
				}
				// if no left child, replace with right subtree
				
			}
			else if(current.leftChild==null) {
				if(current == root) {
					root = current.rightChild;
				}
				else if(isLeftChild) {// left child of parent
					parent.leftChild = current.rightChild;
				}
				else {// right child of parent
					parent.rightChild = current.rightChild;
				}
			}
		}
		return isLeftChild;
		
	}
	
	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild;   // go to right child
		while(current != null) {// until no more
			
			successorParent = successor;
			successor = current;
			current = current.leftChild;      // go to left child
		}
		if(successor != delNode.rightChild) {// right child,
			
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}
	///////////////////////////////////////////////////////////////////////
	private void inOrder(Node localRoot){
		if(localRoot != null){
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
			}
		}
	///////////////////////////////////////////////////////////////////////
	
	public Node minimum() {// returns node with minimum key value
		
		Node current, last = null;
		current = root;                   // start at root
		while(current != null) {// until the bottom,
			last = current;                // remember node
			current = current.leftChild;   // go to left child
		}
		
		return last;
	}
}
 
public class TreeApp{
	public static void main(String[] args) {
		Tree theTree = new Tree();        // make a tree
		theTree.insert(50, 1.5);        // insert 3 nodes
		theTree.insert(25, 1.7);
		theTree.insert(75, 1.9);
		
		Node found = theTree.find(25);  // find node with key 25
		if(found != null) {
			System.out.println("Found the node with key 25");
		}
		else {
			System.out.println("Could not find node with key 25");
		}
	}
	
}
