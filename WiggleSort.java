/*
    WiggleSort is an exercise from Hacker Rank.
    The idea is to sort an array of integers so that the largest 
    is placed at the beginning of the array followed by the smallest. 
    This continues with the next largest number and the next smallest 
    number etc. etc.
*/

class WiggleSort{
	public static void main (String[] args){

		int[] myIntArray = {11,52,6,17,122,91,56,1,12,8,33,2,7};
		int temp = 0; int count = 0;
		
		/*
		    We begin with the largest number at index zero, the 2nd largest at 
		    index 2, the smallest at index 1, the second smallest at index 3, 
		    and so on. This means that we will be need to check whether or not
		    the current index is even or odd. This information will tell us
		    whether we need to check for a larger or smaller number.
		*/
		
		while(count < myIntArray.length){
		    for(int i=count; i<myIntArray.length; i++){
		        if(count % 2 == 0){
		            if(myIntArray[count] < myIntArray[i]){
		                temp = myIntArray[count];
		                myIntArray[count] = myIntArray[i];
		                myIntArray[i] = temp;
		            }
		        } else{
		            if(myIntArray[count] > myIntArray[i]){
		                temp = myIntArray[count];
		                myIntArray[count] = myIntArray[i];
		                myIntArray[i] = temp;
		            }
		        }
		    }//end for
		    count++;
		}//end while
		System.out.println("\n");
		for(int j=0; j<myIntArray.length; j++){
		    System.out.print(myIntArray[j] + " , ");
		}
		System.out.println("\n");
	}//end main
}//end class
