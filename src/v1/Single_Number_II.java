package v1;
/**
 * 2014-9-6
 * @author Alvin
 * 
 */

public class Single_Number_II {
    public int singleNumber(int[] A) {
    	int x =0;
    	int result=0;
    	for (int i=0;i<32 ;i++ ){
    		x = 0;
    		for (int j =0;j <A.length;j++) {  		 
    			if( (A[j] & (1 << i)) != 0)    			 
    				x ++;    	   	
    	   } 
    	   result  = result |((x%3)<<(i));
    	}
    	return result;
    }	
	public static void main(String[] args) {
		int [] A ={100000,1,1,3,100000,100000,1};
		System.out.println(new Single_Number_II().singleNumber(A) );
	}
}
