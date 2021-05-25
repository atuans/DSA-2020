package Arrays;

public class Array1 {
	public static void main(String[] args) {
		
//		int[] arr;
//		arr = new int[100];
		
		int[] ar = new int[100];
		
		int intArray[] = new int[100];  // alternative syntax
		int arrayLength = intArray.length;   // find array size
		System.out.println(arrayLength);
		
		int temp = intArray[3];  // get contents of fourth element of array
		intArray[7] = 66;    // insert 66 into the eighth cell
		

		//autoData[] carArray = new autoData[4000];
		long[] arr;                  // reference to array
		arr = new long[100];         // make array
		int nElems = 0;              // number of items
		
		int j;                       // loop counter
		long searchKey;              // key of item to search for
		
		arr[0] = 77;                 // insert 10 items
		arr[1] = 99;
		arr[2] = 44;
		arr[3] = 55;
		arr[4] = 22;
		arr[5] = 88;
		arr[6] = 11;
		arr[7] = 00;
		arr[8] = 66;
		arr[9] = 33;
		nElems = 10;                 // now 10 items in array
		
		//--------------------------------------------------------------
		for(j=0; j<nElems; j++)   {   
			System.out.println(arr[j] + "");		
		}
		System.out.println("");
		
		//--------------------------------------------------------------
		searchKey = 66;              // find item with key 66
		for(j=0; j<nElems; j++) {
			if(arr[j] == searchKey)       // found item?
				break;                     // yes, exit before end
			if(j == nElems)                  // at the end?
				System.out.println("Can’t find " + searchKey); // yes
			else
				System.out.println("Found " + searchKey);      // no
		}
		//--------------------------------------------------------------
		searchKey = 55;              // delete item with key 55
		for(j=0; j<nElems; j++)   {
			if(arr[j] == searchKey){
				break;			}
		}
		for(int k=j; k<nElems-1; k++)  {// move higher ones down
			arr[k] = arr[k+1];
		}
		nElems--;                         // decrement size			
	
	
	//-------------------------------------------------
	for(j=0; j<nElems; j++)  {// display items
		System.out.print( arr[j] + "");
		System.out.println("");  // end main()
	}

}
}
