package v1;
/**
 * 2014-6-12
 * @author Alvin
 * 
 */

public class Rotate_Image {
	
    public void rotate(int[][] matrix) {
    
        int length  = matrix.length;
    	int[][] array = new int[length][length];
        for(int i =0;i < length;i++){
        	for(int j =0;j<length;j++){
        		array[j][length-1-i] = matrix[i][j] ;
        	}
        }
        
        for(int i =0;i < length;i++){
        	for(int j =0;j<length;j++){
        		matrix[i][j] =array[i][j];
        	}
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix ={{}};
		new Rotate_Image().rotate(matrix);
	}

}
